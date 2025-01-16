package com.practice.jpa.jpa_practice;

import com.practice.jpa.jpa_practice.entities.ProductEntity;
import com.practice.jpa.jpa_practice.repositories.ProductRepositories;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
class JpaPracticeApplicationTests {
	@Autowired
	ProductRepositories productRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testRepository() {
		ProductEntity productEntity = ProductEntity.builder()
				.sku("milky123")
				.title("Milky Bar")
				.price(BigDecimal.valueOf(12.02))
				.quantity(10)
				.build();

		ProductEntity savedProductEntity = productRepository.save(productEntity);
		System.out.println(savedProductEntity);
	}

	@Test
	void getAllRepositories() {
		List<ProductEntity> productEntityList = productRepository.findAll();
		System.out.println(productEntityList);
	}
}
