package org.sid.gestiondequipe.repositories;

import org.sid.gestiondequipe.models.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlayerRepository extends MongoRepository < Player, String >{
    
}
