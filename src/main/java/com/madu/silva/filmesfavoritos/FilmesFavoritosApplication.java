package com.madu.silva.filmesfavoritos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FilmesFavoritosApplication {

    public static void main(String[] args) {
        SpringApplication.run(FilmesFavoritosApplication.class, args);
    }

}
