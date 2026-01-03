package com.example.practice.jpa.jpaLearn;

import com.example.practice.jpa.jpaLearn.entities.ProductEntity;
import com.example.practice.jpa.jpaLearn.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
class JpaLearnApplicationTests {

    @Autowired
    ProductRepository productRepository;

	@Test
	void contextLoads() {

	}
    @Test
    void testRepository(){
        ProductEntity productEntity=ProductEntity.builder()
                .name("Vlad Von Carstein")
                .title("VampireLord")
                .price(BigDecimal.valueOf(2000))
                .quantity(1)
                .build();

        ProductEntity savedProductEntity=productRepository.save(productEntity);
        System.out.println(savedProductEntity);
    }

    @Test
    void getRepository(){
        List<ProductEntity> list=productRepository.findAll();
        System.out.println(list);
    }

}
