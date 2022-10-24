import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.skytour.repository.PassageiroRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = PassageiroRepository.class)
public class SpringSecurityJpaApplication {
	
	public static void main(String[] args) {SpringApplication.run(SpringSecurityJpaApplication.class,args);}
}
