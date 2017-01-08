package com.greenfoxacademy;

import com.greenfoxacademy.domain.Post;
import com.greenfoxacademy.domain.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {


	@Autowired
	private PostRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(RedditApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		repository.save(new Post("Gender neutral toilets in the woods"));
		repository.save(new Post("iPhone 36 - it's still the same shit"));
		repository.save(new Post(" \'Hey, Is this the real Reddit?\' "));
		repository.save(new Post(" \'HELP! Insurance covering damage done by toddlers?\' "));
		repository.save(new Post("Pre-Christmas depression turned into New Year disillusionment. Anyone?"));
	}
}