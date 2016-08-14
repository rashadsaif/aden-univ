package com.adenuniv.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adenuniv.model.Year;

public interface YearRepository
		extends JpaRepository<Year, Long>{


}
