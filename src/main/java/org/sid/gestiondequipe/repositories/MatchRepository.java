package org.sid.gestiondequipe.repositories;

import java.util.List;
import org.sid.gestiondequipe.models.Match;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MatchRepository extends MongoRepository < Match, String > {

    public List<Match> findAll();

    
}
