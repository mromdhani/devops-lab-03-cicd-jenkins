package be.businesstraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookstoreBackendApplication {
	
	public static void main(String[] args) {
        String message =  "Welcome";
        message.concat(" to the DevOps World");
		System.out.println(message);
		SpringApplication.run(BookstoreBackendApplication.class, args);
	}

}
