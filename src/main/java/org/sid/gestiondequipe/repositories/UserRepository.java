package org.sid.gestiondequipe.repositories;


import org.sid.gestiondequipe.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String> {
    
    User findByEmail(String email);
    
}
