package vn.com.demo.service;

import org.springframework.stereotype.Service;

import vn.com.demo.dao.entity.Demo;

@Service
public class DemoService {
	public Demo getDemoObj() {
		return new Demo("1", "test");
	}
}
