package com.example.Ashu;

import org.springframework.stereotype.Component;

@Component
public class AmazonOrder implements Order{
	@Override
	public void ordertesting() {
		System.out.println("=============AmazonOrder=======");
	}

}
