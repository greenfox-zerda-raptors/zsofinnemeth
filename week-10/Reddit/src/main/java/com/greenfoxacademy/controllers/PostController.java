package com.greenfoxacademy.controllers;

import com.greenfoxacademy.domain.Post;
import com.greenfoxacademy.repository.PostRepository;
import com.greenfoxacademy.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/posts")
public class PostController {


    @Autowired
    private PostService postService;

//    public PostController() {
//        //postService = new PostService();
//        postService = PostService.getInstance();
//    }

    @RequestMapping(value="", method=RequestMethod.GET)
    public String listPosts(Model model) {
        model.addAttribute("posts", postService.getPostsOrderedByScore());
        return "posts/list";
    }

    @RequestMapping(value="/vote/{vote}/{id}", method = RequestMethod.GET)
    public ModelAndView vote(@PathVariable int vote, @PathVariable long id) {
        postService.vote(vote, id);
        return new ModelAndView("redirect:/posts");
    }

    @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable long id) {
        postService.deletePost(id);
        return new ModelAndView("redirect:/posts");
    }

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String newProject() {
        return "posts/new";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ModelAndView create(@RequestParam("message") String comment) {
        postService.createNewPost(comment);
        return new ModelAndView("redirect:/posts");
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView update(@RequestParam("post_id") Long id,
                               @RequestParam("message") String message) {
        postService.updatePost(id, message);
        return new ModelAndView("redirect:/posts");
    }

    @RequestMapping(value = "/{id}/edit", method = RequestMethod.GET)
    public String edit(@PathVariable long id, Model model) {
        model.addAttribute("post", postService.findOne(id));
        return "posts/edit";
    }
}
