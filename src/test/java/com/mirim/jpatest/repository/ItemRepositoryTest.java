package com.mirim.jpatest.repository;

import java.time.LocalDateTime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mirim.jpatest.entity.Item;

@SpringBootTest
class ItemRepositoryTest {
	
	@Autowired
	ItemRepository itemRepository;
	
	@Test
	@DisplayName("상품 저장 테스트")
	public void creatItemTest() {
		Item item = new Item();
		item.setItemName("만년필");
		item.setPrice(100000);
		item.setRegTime(LocalDateTime.now());
		item.setStockNumber(10);
		
		Item savedItem = itemRepository.save(item);
		
		System.out.println(savedItem.toString());
	}

}
