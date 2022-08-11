package com.mirim.jpatest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mirim.jpatest.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {	// entity class명과 기본키의 데이터 타입 작성
	// JpaRepository를 상속받으면 기본적인 SQL문을 제공해줌 (Update가 없어서 따로 구현을 해야함)
	
	List<Item> findByItemName(String ItemName);
}
