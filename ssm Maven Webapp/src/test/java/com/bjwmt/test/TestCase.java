package com.bjwmt.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bjwmt.model.User;
import com.bjwmt.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestCase {
	@Resource
	private UserService userService=null;
	
	@Test
	public void testList(){
		List<User> users=userService.selectAll();
		System.err.println(users.get(0).getUsername());
	}

}
