package com.adenuniv.controller;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adenuniv.controller.vo.MarksVo;
import com.adenuniv.model.Student;
import com.adenuniv.model.Subject;
import com.adenuniv.repo.StudentRepository;
import com.adenuniv.repo.SubjectRepository;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Api("Operations about Marks")
public class MarkController {
	private final SubjectRepository repository;
	private final StudentRepository studentRepository;

	@RequestMapping(value = "/mark/student/{studentId}", method = RequestMethod.GET)
	public List<MarksVo> listYearSubjectMarks(@PathVariable("studentId") Long studentId) {
		Student std = studentRepository.findOne(studentId);
		
		if (std != null) {
			List<Subject> subjects = repository.findByYearId(std.getCurentYear().getId());
			if (subjects != null)
				// Marks m=new Marks();
				return subjects.stream().map(sub -> crreateMark(sub)).collect(Collectors.toList());
		}
		return null;
	}

	MarksVo crreateMark(Subject s) {
		MarksVo m = new MarksVo();
		m.setSubject(s.getName());
		m.setMark((short) ThreadLocalRandom.current().nextInt(50, 99 + 1));
		return m;

	}

}
