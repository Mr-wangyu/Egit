package com.rock.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;



@Controller("student")
public class StudentAction {
	@Autowired
	private StudentService studentServ;
	public void test(){
		studentServ.addStudent();
	}
}
