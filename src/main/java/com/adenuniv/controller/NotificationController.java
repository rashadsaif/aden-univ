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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.adenuniv.model.Notification;
import com.adenuniv.repo.NotificationRepository;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Api("Operations about Notification")
public class NotificationController {
	private final NotificationRepository repository;

	@RequestMapping(value = "/notification/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@RequestMapping(value = "/notification/", method = RequestMethod.POST)
	public ResponseEntity<Void> addNotification(@RequestBody @Valid Notification notification) {
		if (isCorrectPasswordForAdd(notification.getTo(), notification.getPassword())) {
			repository.save(notification);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		} else {
			return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);

		}

	}

	@RequestMapping(value = "/notification", method = RequestMethod.GET)
	public ResponseEntity<List<Notification>> listAllNotifications(@RequestParam("to") String to,
			@RequestParam("password") String password) {
		if (isCorrectPasswordForList(to, password) && to!=null) {
			return new ResponseEntity<List<Notification>>(repository.findByToOrderByIdDesc(to), HttpStatus.OK);
		} else {
			return new ResponseEntity(null, HttpStatus.UNAUTHORIZED);
		}
	}

	private boolean isCorrectPasswordForList(String type, String password) {
		boolean isCorrect = false;
		switch (type) {
		case "stdAffairs":
			isCorrect = "aff".equals(password);
			break;
		case "deanship":
			isCorrect = "den".equals(password);
			break;
		case "allstd":
			isCorrect = "std".equals(password);
			break;
		case "delegate":
			isCorrect = "del".equals(password);
			break;
		case "deptHead":
			isCorrect = "dpt".equals(password);
			break;
		}
		return isCorrect;
	}

	private boolean isCorrectPasswordForAdd(String type, String password) {
		boolean isCorrect = false;
		switch (type) {
		case "stdAffairs":
			isCorrect = "aff@aden".equals(password);
			break;
		case "deanship":
			isCorrect = "den@aden".equals(password);
			break;
		case "allstd":
			isCorrect = "std@aden".equals(password);
			break;
		case "delegate":
			isCorrect = "del@aden".equals(password);
			break;
		case "deptHead":
			isCorrect = "dpt@aden".equals(password);
			break;
		}
		return isCorrect;
	}

}
