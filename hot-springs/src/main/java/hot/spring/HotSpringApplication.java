package hot.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication
//annotations can be applied at class level, method level, for individual fields
public class HotSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotSpringApplication.class, args);
	}

}
