package mkn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OpenFeignDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenFeignDemoApplication.class, args);
	}

}
