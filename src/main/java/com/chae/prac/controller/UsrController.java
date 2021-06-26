package com.chae.prac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsrController {
	
	@RequestMapping("chae/pro/")
	@ResponseBody
	public String chaechae() {
		return "안녕 나의 첫 프로젝트";
	}
}
