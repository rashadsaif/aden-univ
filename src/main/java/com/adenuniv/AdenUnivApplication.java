package com.adenuniv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import com.adenuniv.conf.SwaggerConfig;
import com.adenuniv.model.Student;
import com.adenuniv.model.Subject;
import com.adenuniv.model.Year;
import com.adenuniv.repo.StudentRepository;
import com.adenuniv.repo.SubjectRepository;
import com.adenuniv.repo.YearRepository;

@SpringBootApplication
@Import(SwaggerConfig.class)
public class AdenUnivApplication {
	@Autowired
	private YearRepository yearRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private SubjectRepository subjectRepository;

	public static void main(String[] args) {
		SpringApplication.run(AdenUnivApplication.class, args);
	}
	

	
	@Bean
	CommandLineRunner init() {
		return (String[] args) -> {
			Year y1=new Year();
			y1.setName("First Year");
			y1.setId(1L);
			yearRepository.save(y1);
			 y1=new Year();
			y1.setName("Second Year");
			y1.setId(2L);
			yearRepository.save(y1);
			 y1=new Year();
			y1.setName("Third Year");
			y1.setId(3L);
			yearRepository.save(y1);
			 y1=new Year();
			y1.setName("Fourth Year");
			y1.setId(4L);
			yearRepository.save(y1);
			// add default student
			Student s=new Student();
			s.setName("Maimonah");
			s.setCurentYear(y1);
			s.setAddress("Aden");
			studentRepository.save(s);
			// add default subject

			Subject sub=new Subject();
			sub.setName("Programming Language");
			sub.setYear(y1);
			subjectRepository.save(sub);
			 sub=new Subject();
			sub.setName("Java");
			sub.setYear(y1);
			subjectRepository.save(sub);
			 sub=new Subject();
			sub.setName("Mobile Applications");
			sub.setYear(y1);
			subjectRepository.save(sub);
			 sub=new Subject();
			sub.setName("Angularjs");
			sub.setYear(y1);
			subjectRepository.save(sub);
			

			
		};
	}
	
}
