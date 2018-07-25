package com.demo.outer.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @auther monicamo
 * @date 2018/7/25
 */
@RestController
@RequestMapping("/index")
public class IndexController {

	@RequestMapping("")
	public String index() {
		return "index";
	}
}
