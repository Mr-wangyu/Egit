package com.rock.web;

import org.springframework.stereotype.Repository;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("StudentDaoImpl.add()");
	}

}
