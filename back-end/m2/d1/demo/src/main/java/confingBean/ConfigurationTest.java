package confingBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ConfigurationTest {
	
	@Bean
	public Test test() {
		return new Test("Mario", "Rossi");
	}
	
	

}