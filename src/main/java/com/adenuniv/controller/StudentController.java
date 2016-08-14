package com.adenuniv.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.adenuniv.model.Student;
import com.adenuniv.repo.StudentRepository;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired) )
@Api("Operations about Student")
public class StudentController {
	
	private final StudentRepository studentRepository;
	
	@RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	void delete(@PathVariable("id") Long id) {
		studentRepository.delete(id);
	}

	@RequestMapping(value = "/student/", method = RequestMethod.POST)
	public ResponseEntity<Void> addStudent(@RequestBody @Valid Student student) {
		//Assert.isTrue(car.getMake().length() > 3, "invalid.elm.email");
		//System.out.println("Creating User " + car.getMake());
		studentRepository.save(student);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

}
