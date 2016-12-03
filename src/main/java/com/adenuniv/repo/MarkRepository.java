package com.adenuniv.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.error.Mark;

import com.adenuniv.model.Marks;

public interface MarkRepository
		extends JpaRepository<Marks, Long> {
	//List<Mark> findByStudentId(Long studentId);



}
