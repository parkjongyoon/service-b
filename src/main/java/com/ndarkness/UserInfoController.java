package com.ndarkness;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

	@Autowired
	private UserServiceProxy userServiceProxy;
	
	@GetMapping("getUserInfo")
	public Map<String, String> getUserInfo(){
		Map<String, String> response = new HashMap<>();
		
        response.put("result", "200");
        response.put("msg", "ok");
        response.put("user-name", userServiceProxy.getUserName().get("username"));
        response.put("user-id", "1234");
        response.put("user-level", "Admin");
        response.put("user-tel", "010-1234-1234");
        
        return response;
	}
}
