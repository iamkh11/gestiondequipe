package org.sid.gestiondequipe.repositories;

import org.sid.gestiondequipe.models.News;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NewsRepository extends MongoRepository < News, String >{
    
}
