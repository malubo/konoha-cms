package cz.malubo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KonohaCMSApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(KonohaCMSApplication.class);
		System.out.print("Starting app with System Args: [" );
		for (String s : args) {
			System.out.print(s + " ");
		}
		System.out.println("]");
		app.run(args);
	}

}
