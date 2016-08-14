package com.adenuniv.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adenuniv.model.Marks;

public interface MarkRepository
		extends JpaRepository<Marks, Long> {



}
