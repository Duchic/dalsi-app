package com.example.dalsiapp;

import com.example.dalsiapp.entities.MarketEntity;
import com.example.dalsiapp.repositories.MarketRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DalsiAppApplication {

    private final MarketRepository marketRepository;

    public DalsiAppApplication(MarketRepository marketRepository){
        this.marketRepository = marketRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(DalsiAppApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
          try {
              marketRepository.saveAll(List.of(
                      new MarketEntity("RANDOM"),
                      //MarketEntity.builder().name("RANDOM").build(); //builder
                      new MarketEntity("STOCKS"),
                      new MarketEntity("CRYPTO")
              ));
          } catch (Exception e) {
              System.out.println(e.getMessage());
          }
        };
    }
}
