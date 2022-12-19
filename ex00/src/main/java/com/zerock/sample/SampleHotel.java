package com.zerock.sample;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Component
@ToString
@Getter
@RequiredArgsConstructor 
//@RequiredArgsConstructor는 초기화 되지않은 final 필드나, @NonNull 이 붙은 필드에 대해 생성자를 생성해 줍니다.
public class SampleHotel {
	
	@NonNull // 반드시 null이 아니어야 하는 것
	private Chef chef;
	
	private String name;

}
