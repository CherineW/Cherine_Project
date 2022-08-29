package project.registerloginadmin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import Model.Student;
import Repositories.StudentRepository;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class }) 

public class RegisterloginadminApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(RegisterloginadminApplication.class, args);
		
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {

		/*Student student1=new Student("Cherine", "Wam", "cherine@email.com");
		studentRepository.save(student1);

		Student student2=new Student("Julian", "Bach", "julian@email.com");
		studentRepository.save(student2);

		Student student3=new Student("Johan", "Toit", "johan@email.com");
		studentRepository.save(student3);*/



	
		
	}
	

}
