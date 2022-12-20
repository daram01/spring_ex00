package com.zerock.sample;

import org.springframework.stereotype.Component;

// Car라는 클래스를 스프링 컨테이너가 관리하게 하고 싶을 때
// 1. @Component 사용
// 2. root-context 스프링 컨테이너에서 직접 등록
public class Car {
	String model;
	
	// 매개변수가 있는 생성자
	public Car(String model) {
		super();
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
}
