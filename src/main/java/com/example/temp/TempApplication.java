package com.example.temp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class TempApplication {

	// 1.8 jdk로 실행해야됨 안그러면 IllegalStateException : Cannot load configuration class 발생함
	public static void main(String[] args) {
		SpringApplication.run(TempApplication.class, args);
	}
	@GetMapping("/")
	public String home() {
		return "index.html";
	}

}
