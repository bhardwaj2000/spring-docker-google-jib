package com.mks.spring.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerGoogleJibApplication {

    @GetMapping("/api/{name}")
    public ResponseEntity<String> getResponse(@PathVariable String name){
        return ResponseEntity.ok("deployed spring boot application by "+name+" with google jib");
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerGoogleJibApplication.class, args);
	}

}
