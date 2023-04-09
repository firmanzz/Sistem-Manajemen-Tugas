package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Tugas;
import net.javaguides.sms.entity.TugasCategory;
import net.javaguides.sms.entity.User;
import net.javaguides.sms.repository.TugasRepository;
import net.javaguides.sms.repository.UserRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private TugasRepository tugasRepository;
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {

		  User user1 = new User("firman", "firman123");
		  userRepository.save(user1);
		  
		  User user2 = new User("roy", "roy123");
		  userRepository.save(user2);

		  User user3 = new User("alvyn", "alvyn123");
		  userRepository.save(user3);
		
	}

}
