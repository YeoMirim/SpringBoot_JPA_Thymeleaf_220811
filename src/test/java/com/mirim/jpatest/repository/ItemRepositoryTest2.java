package com.mirim.jpatest.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.mirim.jpatest.entity.Item;

@SpringBootTest
//@TestPropertySource(locations = "classpath:application-test.properties")  //주석처리하면 기본값으로 Mysql에 저장이 됨
class ItemRepositoryTest2 {

	@Autowired
	ItemRepository itemRepository;
	
	@Test
	@DisplayName("상품 저장 코드 테스트")
	public void createItemTest() {
		/*
		 * Item item1 = new Item(); item1.setItemName("모나미볼펜"); item1.setPrice(1000);
		 * item1.setRegTime(LocalDateTime.now()); // 현재시간 입력 item1.setStockNumber(100);
		 * 
		 * Item item2 = new Item(); item2.setItemName("지우개"); item2.setPrice(300);
		 * item2.setRegTime(LocalDateTime.now()); // 현재시간 입력 item2.setStockNumber(80);
		 * 
		 * Item item3 = new Item(); item3.setItemName("형광펜"); item3.setPrice(1000);
		 * item3.setRegTime(LocalDateTime.now()); // 현재시간 입력 item3.setStockNumber(50);
		 * 
		 * Item item4 = new Item(); item4.setItemName("형광펜"); item4.setPrice(1200);
		 * item4.setRegTime(LocalDateTime.now()); // 현재시간 입력 item4.setStockNumber(30);
		 * 
		 * Item item5 = new Item(); item5.setItemName("형광펜"); item5.setPrice(800);
		 * item5.setRegTime(LocalDateTime.now()); // 현재시간 입력 item5.setStockNumber(60);
		 * 
		 * Item item6 = new Item(); item6.setItemName("컴퓨터용사인펜"); item6.setPrice(1000);
		 * item6.setRegTime(LocalDateTime.now()); // 현재시간 입력 item6.setStockNumber(120);
		 * 
		 * Item item = new Item();
		 */
		
		for (int i=1; i<=10; i++) {
			
			Item item = new Item();
			item.setItemName("모나미볼펜"+i);
			item.setPrice(1000);
			item.setRegTime(LocalDateTime.now());
			item.setStockNumber(100);
			
			Item savedItem = itemRepository.save(item);		// 값을 반환함
//			System.out.println(savedItem.toString());		// 문자열로 바꿔서 출력해줘야함
		}
		
		
	}
	
	@Test
	@DisplayName("상품 조회 테스트")
	public void findByItemNameTest() {
		this.createItemTest();
		List<Item> itemList = itemRepository.findByItemName("모나미볼펜1");
		
		for (Item item : itemList) {
			System.out.println(item.toString());
		}
	}
	
	@Test
	@DisplayName("모든 상품 리스트 조회 테스트")
	public void findByItemListTest() {
		this.createItemTest();
		List<Item> itemList = itemRepository.findAll();
		
		for (Item item : itemList) {
			System.out.println(item.toString());
		}
	}

}
