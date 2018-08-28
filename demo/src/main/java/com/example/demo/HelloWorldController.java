package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.parser.Cookie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  * Spring Boot HelloWorld.  synchronizeOnSession example
 */
@RestController
public class HelloWorldController {
	@RequestMapping(value = "/{param}")
	public String sayHello(@PathVariable String param, HttpServletRequest request, HttpSession session) {
		System.out.println("param=" + param);

		Object id = session.getId();
		if (id == null) {
			System.out.println("session not exist " + id);
			//session.setAttribute("p", p);
		} else {
			System.out.println("session existed ，id=" + id);
			if (param.equals("sleep")) {
				try {
					Thread.sleep(15000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("wake up!");
			}
		}
		return "Hello,World! " + param;
	}
}
