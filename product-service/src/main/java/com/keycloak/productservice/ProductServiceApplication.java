package com.keycloak.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

}

@RestController
@RequestMapping("/product")
class ProductController{

	@GetMapping(path = "/")
	public List<String> getProducts(){
		return Arrays.asList("iPhone", "Android", "Backberry");
	}

}
