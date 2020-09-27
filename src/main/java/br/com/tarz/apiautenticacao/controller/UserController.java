package br.com.tarz.apiautenticacao.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tarz.apiautenticacao.entity.User;
import br.com.tarz.apiautenticacao.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	UserService service;

	@PostMapping
	public Object post(@RequestBody User user) {
		HashMap<String, Object> response = new HashMap<String, Object>();
		try {
			service.save(user);
			response.put("message", "Successful save");
			response.put("success", true);
			return response;
		} catch (Exception e) {
			response.put("message", e.getMessage());
			response.put("success", false);
			return response;
		}
	}

}
