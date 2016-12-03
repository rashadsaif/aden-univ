package com.adenuniv.controller;

import java.util.List;

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

import com.adenuniv.controller.vo.SubjectVo;
import com.adenuniv.model.Subject;
import com.adenuniv.model.Year;
import com.adenuniv.repo.SubjectRepository;
import com.adenuniv.repo.YearRepository;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired) )
@Api("Operations about Subject")
public class SubjectController {
	
	private final SubjectRepository repository;
	private final YearRepository yearRepository;

	
	@RequestMapping(value = "/subject/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public ResponseEntity<Void>  delete(@PathVariable("id") Long id) {
		return new ResponseEntity<Void>(HttpStatus.OK);
	}



	@RequestMapping(value = "/subject/", method = RequestMethod.POST)
	public ResponseEntity<Void> addSubject(@RequestBody @Valid SubjectVo student) {
		Year year=yearRepository.findOne(student.getYear());
		Subject s=new Subject();
		s.setName(student.getName());
		s.setYear(year);
		repository.save(s);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/subject/year/{yearId}", method = RequestMethod.GET)
	public List<Subject> listYearSubjects(@PathVariable("yearId") Long yearId){
		return repository.findByYearId(yearId);
	}
	

}
