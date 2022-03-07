package com.mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class springsecurityAssignment2Q2 implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(springsecurityAssignment2Q2.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {

		User user1 = new User();
		user1.setUserName("admin1");
		user1.setPassword(bCryptPasswordEncoder.encode("Pass"));
		user1.setRoles("ROLE_ADMIN");

		userRepository.save(user1);

		User user2 = new User();
		user2.setUserName("user1");
		user2.setPassword(bCryptPasswordEncoder.encode("pass"));
		user2.setRoles("ROLE_USER");

		userRepository.save(user2);
	}

}
