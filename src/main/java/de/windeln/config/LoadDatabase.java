package de.windeln.config;

import de.windeln.model.Chapter;
import de.windeln.repository.ChapterRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner init(ChapterRepository chapterRepository) {
        return args -> {
            Flux.just(
                    new Chapter("1", " Quick start with spring-boot-2.1.1 !"),
                    new Chapter("2", " Reactive web with spring boot 2 !"),
                    new Chapter("3", " ... and more.")
                    )
                    .flatMap(chapterRepository::save)
                    .subscribe(System.out::println);
        };
    }
}
