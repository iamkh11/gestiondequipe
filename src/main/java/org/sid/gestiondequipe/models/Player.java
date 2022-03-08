package org.sid.gestiondequipe.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document(collection = "players")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Player {

	@Id
	private String id;  
	
	private String player_fullname; 
	private Integer player_age; 
	private String player_birth_date;
	private String player_nationality;
	
	private Integer player_number;
	private String player_position;
	private String player_pic_URL;
	
	
	
	

	
    
}
