package com.springboot.jpa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jpa.domain.User;
import com.springboot.jpa.repository.UserRepository;
import com.springboot.jpa.vo.Response;


/**
 * 用户控制器.
 * 
 * @author <a href="https://waylau.com">Way Lau</a>
 * @date 2017年2月26日
 */
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	/**
	 * 查询所有用户
	 * 
	 * @return
	 */
	@GetMapping("/list")
	public ResponseEntity<Response> getUserlist() {
		System.out.println("我有進入list");
		List<User> users = new ArrayList<>();
		for (User user : userRepository.findAll()) {
			users.add(user);
		}
		System.out.println(users);
		return ResponseEntity.ok().body(new Response(true, "处理成功", users));
	}

}
