package com.adenuniv.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adenuniv.model.Student;

public interface StudentRepository
		extends JpaRepository<Student, Long> {



}
