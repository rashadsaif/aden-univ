package com.adenuniv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.adenuniv.repo.MarkRepository;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired) )
@Api("Operations about Marks")
public class MarkController {
	private final MarkRepository repository;

}
