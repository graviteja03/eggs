package com.eggs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EggController {

	@GetMapping("/contact")
	public String viewPage()
	{
		return "egg";
	}
}
