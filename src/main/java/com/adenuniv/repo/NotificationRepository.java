package com.adenuniv.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adenuniv.model.Notification;

public interface NotificationRepository
		extends JpaRepository<Notification, Long>{
	List<Notification> findByToOrderByIdDesc(String to);


}
