package orm.demo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import orm.demo.demo.entity.User;
import orm.demo.demo.repo.UserRepository;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping
	public List<User> getAll() {
		return userRepository.findAll();
	}
}
