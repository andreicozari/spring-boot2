package de.windeln.repository;

import de.windeln.model.Chapter;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;


public interface ChapterRepository extends ReactiveCrudRepository<Chapter, String> {

}
