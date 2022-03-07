package com.mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringSecurityAssignmentQ6Application implements CommandLineRunner {
	

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityAssignmentQ6Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {

		User user1 = new User();
		user1.setUserName("Poonam");
		user1.setPassword(bCryptPasswordEncoder.encode("Poonam@123"));
		user1.setRoles("ROLE_ADMIN");

		userRepository.save(user1);

		User user2 = new User();
		user2.setUserName("user");
		user2.setPassword(bCryptPasswordEncoder.encode("user123"));
		user2.setRoles("ROLE_NORMAL");

		userRepository.save(user2);
	}

}
