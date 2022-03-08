package org.sid.gestiondequipe.controllers;

import java.util.Optional;

import org.sid.gestiondequipe.models.News;
import org.sid.gestiondequipe.repositories.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NewsController {
    
        @Autowired
        NewsRepository newsRepository;

        @RequestMapping("/postes")
        public String staff(Model model) {
            model.addAttribute("news", newsRepository.findAll(Sort.by(Sort.Direction.DESC, "id")));
            return "postes";
        }

        @RequestMapping("/deletepost")
	    public String delete(@RequestParam String id) {
	       
	        newsRepository.deleteById(id);

	        return "redirect:/postes";
	    }


        @RequestMapping("/savepost")
        public String save(@RequestParam String title, 
                           @RequestParam String date,  @RequestParam Boolean status, 
                           @RequestParam String image_url,@RequestParam String content,
                           @RequestParam String category
                ) {
                    News news = new News();
                
                        news.setTitle(title);
                        news.setDate(date);
                        news.setCategory(category);
                        news.setStatus(status);
                        news.setImage_url(image_url);
                        news.setContent(content);
                        // saving in db
                        newsRepository.save(news);
                    
                        
                        
                        
                    
                        return "redirect:/postes";
                    }


        @RequestMapping("/updateposte")
	    public String updatenews(@RequestParam String id, @RequestParam String title, 
	    		                 @RequestParam String date, @RequestParam Boolean status,  
	    		                 @RequestParam String image_url,@RequestParam String content,
                                 @RequestParam String category  
                                 ) {
                                    Optional<News> news = newsRepository.findById(id);
                                    
                                    news.get().setTitle(title);
                                    news.get().setDate(date);	    	
                                    news.get().setCategory(category);	    	
                                    news.get().setStatus(status);	    	
                                    news.get().setImage_url(image_url);	    	
                                    news.get().setContent(content);
                                                            
                                    newsRepository.save(news.get());
                        
                                    return "redirect:/postes" ;
                                }
	      
	    	
	    	
	 	       
	    	
	    


}
