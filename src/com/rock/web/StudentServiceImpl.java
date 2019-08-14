package com.rock.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	@Qualifier("studentDao")
	private StudentDao add;
	@Override
	public void addStudent() {
		// TODO Auto-generated method stub
    add.add();
}
	
}
