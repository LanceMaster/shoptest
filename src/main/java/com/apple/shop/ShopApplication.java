package com.apple.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopApplication {


	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);



	var friend =  new Friend("Kim");
		System.out.println(friend.name);
	}


}
class Friend {

	String name;
	int age = 20;
	//Friend는 constructor라고한다.
	Friend(String 구멍) {
		this.name = 구멍;
		//잘 쓰면 매번 다른 변수값으로 object를 뽑을수 있음
	}
}



