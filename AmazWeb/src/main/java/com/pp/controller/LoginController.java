package com.pp.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//import com.pp.model.UserDto;


@Controller
public class LoginController {
	
	@RequestMapping("/showLogin")
	public String showLogin(Map<String ,Object> map)
	{
		System.out.println("Inside Login Controller");
		map.put("UserDtoKey", new UserDto());
		return "login";
	}
	
	public String submitLogin(@ModelAttribute("UserDtoKey") UserDto login,Map<String,Object>map)
	{
		System.out.println("Email >>"+login.getEmailId());
		System.out.println("Password >>"+login.getPassword());
		map.put("UserDtoKey", login);
		return "login";
	}
	

}
 