package org.sid.gestiondequipe.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Document (collection = "staff")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Staff  {

		
        @Id
		private String id; 
		
		private String staff_fullname; 
		private Integer staff_age; 
		private String staff_birth_date;
		private String staff_nationality;
		private String staff_gender;
		
		private String team_fullname;
		
		private String staff_role;
		private String staff_pic_URL;
		
		
    
}
