package com.ndarkness;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="service-a")
public interface UserServiceProxy {

	@GetMapping("getUserName")
	public Map<String,String> getUserName();
}
