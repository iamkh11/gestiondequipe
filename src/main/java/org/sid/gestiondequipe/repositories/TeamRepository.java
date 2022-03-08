package org.sid.gestiondequipe.repositories;

import org.sid.gestiondequipe.models.Team;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeamRepository extends MongoRepository < Team, String >{
    
}
