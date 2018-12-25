package de.windeln.controller;

import de.windeln.model.Chapter;
import de.windeln.repository.ChapterRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ChapterController {

    public final ChapterRepository repository;

    public ChapterController (ChapterRepository chapterRepository) {
        this.repository = chapterRepository;
    }

    @GetMapping("/chapters")
    public Flux<Chapter> listing() {
        return this.repository.findAll();
    }

    @GetMapping("/one")
    public Mono<Chapter> getOne() {
        return this.repository.findById("1");
    }

    @DeleteMapping("/delete")
    public Mono<Void> deleteAll() {
        return this.repository.deleteAll();
    }
}
