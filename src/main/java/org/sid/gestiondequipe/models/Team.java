package org.sid.gestiondequipe.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document (collection = "team")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Team {

		
    
        @Id
		private String id; 
		
		
		private String team_name;
		private String team_nickname;
		private String team_founded;
		private String team_owner;
		private String team_league;
		private String logo_URL;
		
		


        
}