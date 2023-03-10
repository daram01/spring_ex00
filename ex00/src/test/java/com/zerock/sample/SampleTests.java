package com.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class SampleTests {
	//						 자동의존주입
	@Setter(onMethod_ = { @Autowired })
	// public void setRestaurant(Restaurant restaurant){ 
	//	this.restaurant = restaurant;
	// }
	private Restaurant restaurant;
	
	@Test // 메인함수를 대신하여 테스트를 진행
	public void testExist() {
		assertNotNull(restaurant); // 객체가 제대로 생성되어져서 넘어왔는지 확인하는 것.
		log.info(restaurant);
		log.info("---------------------------------------------");
		log.info(restaurant.getChef());
	}
	
}
