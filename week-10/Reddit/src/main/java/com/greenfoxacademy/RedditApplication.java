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
		repository.save(new Post("Gender neutral toilets in the woods", "Such idea"));
		repository.save(new Post("iPhone 36 - it's very expensive", "Such price"));
		repository.save(new Post("New film from Werner Herzog about the inherent contradictions within the system of all known conspiracy theories", "I definitely wanna see that"));
		repository.save(new Post(" \'Hey, Is this the real Reddit?\' ", "Well who are you"));
		repository.save(new Post(" \'HELP! Insurance covering damage done by toddlers?\' ", "Gotta pay heavy money"));
		repository.save(new Post("Pre-Christmas depression turned into New Year disillusionment. Anyone?", "Everyone around me, sure"));
		repository.save(new Post("Brian Wilson's anniversay mental breakdown", "Originally unfinished Smiley Smile album turning 50"));
		repository.save(new Post("The worst documentary film of 2017 - or simply the greatest mockumentary?", "WANT"));
		repository.save(new Post("New black comedy from Chris Morris coming in 2017", "WANT"));
		repository.save(new Post("PJ Harvey on the making of her new album: \'I ate only potatoes\'", "Indicates a great album"));
	}
}