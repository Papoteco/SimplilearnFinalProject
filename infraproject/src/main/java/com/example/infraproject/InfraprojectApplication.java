package com.example.infraproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.lang.Math;

@SpringBootApplication
@RestController
public class InfraprojectApplication {

        @RequestMapping("/")
        public String home() {
          double x = 0.0001; 
          for (int i = 0; i<1000000; i++){
            x += Math.sqrt(x);
          } 
          return "Hello Docker World. I've made and instese CPU computation";
        }

	public static void main(String[] args) {
		SpringApplication.run(InfraprojectApplication.class, args);
	}

}
