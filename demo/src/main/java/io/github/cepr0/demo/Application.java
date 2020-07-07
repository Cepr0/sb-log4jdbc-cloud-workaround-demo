package io.github.cepr0.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.List;

@SpringBootApplication
public class Application {

    private final ModelRepo modelRepo;

    public Application(ModelRepo modelRepo) {
        this.modelRepo = modelRepo;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void onReady() {
        modelRepo.saveAll(List.of(
           new Model(1, "model1"),
           new Model(2, "model2")
        ));
        modelRepo.findAll();
    }
}
