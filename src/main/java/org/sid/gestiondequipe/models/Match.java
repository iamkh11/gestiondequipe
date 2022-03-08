package org.sid.gestiondequipe.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;




@Document (collection = "match")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Match {
	
	@Id
	private String id; 
	
	
	
	private String home_team;
	private String away_team;
	
	private String home_team_logo;
	private String away_team_logo;
	
	private String date;
	private String time;
	
	private String stadium;
	private String competition;
	private String status;
	
	
	
	
	
    
}
