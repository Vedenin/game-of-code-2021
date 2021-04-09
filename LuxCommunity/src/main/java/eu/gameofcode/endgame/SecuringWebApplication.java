package eu.gameofcode.endgame;

import eu.gameofcode.endgame.data.DataInitializator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SecuringWebApplication implements CommandLineRunner {

	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(SecuringWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DataInitializator dataInitializator = applicationContext.getBean(DataInitializator.class);
		dataInitializator.initializeData();
	}

}
