package calcrewlator.calcrewlator;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalcrewlatorApplication {

	private static final Logger log = Logger.getLogger(CalcrewlatorApplication.class.getName());

	public static void main(String[] args) {
		log.info("Starting spring...");
		SpringApplication.run(CalcrewlatorApplication.class, args);
	}

}
