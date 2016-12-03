package com.adenuniv.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adenuniv.model.Student;

public interface StudentRepository
		extends JpaRepository<Student, Long> {
	List<Student> findByCurentYearId(Long id);



}
