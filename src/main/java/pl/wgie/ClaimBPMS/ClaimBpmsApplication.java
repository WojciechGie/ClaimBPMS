package pl.wgie.ClaimBPMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("pl.wgie.ClaimBPMS.config")
@ComponentScan("pl.wgie.ClaimBPMS.rest")
public class ClaimBpmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClaimBpmsApplication.class, args);
	}

}
