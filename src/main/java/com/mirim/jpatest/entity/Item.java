package com.mirim.jpatest.entity;

import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.Data;

@Entity				// 클래스를 엔티티로 지정
@Table(name="item")	// 엔티티 테이블 지정
@Data
public class Item {
	
	@Id 							// 테이블의 기본키 지정
	@Column(name="item_id")			//테이블 컬럼과 필드를 매핑	(옵션일뿐임)
	@GeneratedValue(strategy = GenerationType.AUTO)		// 기본 설정 값으로 각 데이터베이스에 따라 기본키를 자동으로 생성한다.
	private Long id;				// 상품 코드(기본키)
	
	
	@Column(nullable = false, length = 50) 	// null 값 허용 여부와 길이 설정
	private String itemName;		// 상품명 
	
	@Column(nullable = false)
	private int price;				// 상품 가격
	
	@Column(nullable = false)
	private int stockNumber;		// 상품 재고 수량
	
	
	private LocalDateTime regTime;	// 상품 등록 시간
	
	
}
