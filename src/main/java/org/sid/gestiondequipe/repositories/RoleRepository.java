package org.sid.gestiondequipe.repositories;

import org.sid.gestiondequipe.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public  interface RoleRepository extends MongoRepository<Role, String> {
    
    Role findByRole(String role);
    
}