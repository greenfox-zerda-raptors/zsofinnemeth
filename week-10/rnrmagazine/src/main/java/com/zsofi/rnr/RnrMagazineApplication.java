package com.zsofi.rnr;

import com.zsofi.rnr.domain.Article;
import com.zsofi.rnr.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class RnrMagazineApplication implements CommandLineRunner {

	@Autowired
	private ArticleRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(RnrMagazineApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		repository.save(new Article("NEW from David Bowie. Yes, really."));
		repository.save(new Article("COMING SOON! Brian Wilson anniversay mental breakdown"));
		repository.save(new Article("Chris Morris. Chris FUCKING Morris - says John Cleese"));
		repository.save(new Article("PJ Harvey again on potato diet"));
		repository.save(new Article("Terrible documentary with terrific prospects as mockumentary"));
		repository.save(new Article("New film from Werner Herzog about the wildly controversial reality within the framework of all commonly known conspiracy theories"));
	}
}
