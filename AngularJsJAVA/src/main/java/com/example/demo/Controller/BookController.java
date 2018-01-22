/**
 * 
 */
package com.example.demo.Controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author A664161
 *
 */
@Controller
public class BookController 
{
	@RequestMapping("/")
	public String hello()
	{
		return "index";
	}
	
}
