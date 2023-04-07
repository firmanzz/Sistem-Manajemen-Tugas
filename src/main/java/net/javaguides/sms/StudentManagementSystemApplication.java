package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Tugas;
import net.javaguides.sms.entity.TugasCategory;
import net.javaguides.sms.repository.TugasRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private TugasRepository tugasRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		  Tugas student1 = new Tugas("Mater", "221524013", "Firman", TugasCategory.Selesai);
		  tugasRepository.save(student1);
		
	}

}
