package org.sid.gestiondequipe.repositories;

import org.sid.gestiondequipe.models.Staff;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StaffRepository extends MongoRepository < Staff, String >{
    
}
