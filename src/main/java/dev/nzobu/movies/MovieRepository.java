package dev.nzobu.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository<R, O> extends MongoRepository<Movie, ObjectId> {
    Optional<Movie> findMovieByImdbId(String imdb);
}
