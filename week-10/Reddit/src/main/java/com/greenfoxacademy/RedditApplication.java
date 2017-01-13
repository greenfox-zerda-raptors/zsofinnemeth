package com.greenfoxacademy;

import com.greenfoxacademy.domain.Post;
import com.greenfoxacademy.repository.PostRepository;
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
		repository.save(new Post("iPhone 36 - it's very expensive"));
		repository.save(new Post("New film from Werner Herzog about the inherent contradictions within the system of all known conspiracy theories"));
		repository.save(new Post(" \'Hey, Is this the real Reddit?\' "));
		repository.save(new Post(" \'HELP! Insurance covering damage done by toddlers?\' "));
		repository.save(new Post("Pre-Christmas depression turned into New Year disillusionment. Anyone?"));
		repository.save(new Post("Brian Wilson's anniversay mental breakdown"));
		repository.save(new Post("The worst documentary film of 2017 - or simply the greatest mockumentary?"));
		repository.save(new Post("New black comedy from Chris Morris coming in 2017"));
		repository.save(new Post("PJ Harvey on the making of her new album: \'I ate only potatoes\'"));
	}
}