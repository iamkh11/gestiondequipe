package org.sid.gestiondequipe.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Document (collection = "news")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class News {
	
    @Id
	private String id; 
	
	private String title;
	private String content;
	private String date;
	private String image_url;
	private String category;
	private Boolean status;
	
    
}
