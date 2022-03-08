package org.sid.gestiondequipe.controllers;

import java.util.Optional;
import org.sid.gestiondequipe.models.Match;
import org.sid.gestiondequipe.repositories.MatchRepository;
import org.sid.gestiondequipe.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// indication de 'Controller'
@Controller
public class MatchController {
// Get Post Delete Put Mapping act as a shortcut for @RequestMapping(method = RequestMethod."CRUD")

                // Autowiring feature => use setter or constructor injection => enables you to inject the object dependency implicitly
                @Autowired
                MatchRepository matchRepository;

                @Autowired
                TeamRepository teamRepository;

                // Afficher le tableau des matches
                @RequestMapping(path="/calendrier")
                public String getAllMatches(Model model){
                    // fetch tous les matches dans l'ordre DESC et les injecté dans var 'match'
                    model.addAttribute("match",matchRepository.findAll(Sort.by(Sort.Direction.DESC, "id")));
                    model.addAttribute("teams",teamRepository.findAll(Sort.by(Sort.Direction.DESC, "team_name")));

                    // return view 
                    return "calendrier" ;
                    
                }
                // Delete match by id et redirection vers le tableau des matches
                @RequestMapping("/deletematch")
                public String delete(@RequestParam String id) {
                   
                    matchRepository.deleteById(id);

                    return "redirect:/calendrier";
                }

                // Creation d'un match et redirection vers le tableau des matches
                @RequestMapping("/savematch")
                public String save(@RequestParam String home_team_logo, @RequestParam String away_team_logo, 
                                    @RequestParam String home_team,  @RequestParam String away_team, 
                                    @RequestParam String date,  @RequestParam String time, 
                                    @RequestParam String stadium,  @RequestParam String competition, 
                                    @RequestParam String status
                                    
                        ) {
                            Match match = new Match();
                            match.setHome_team_logo(home_team_logo);
                            match.setAway_team_logo(away_team_logo);
                            match.setHome_team(home_team);
                            match.setAway_team(away_team);
                                
                            match.setDate(date);
                            match.setTime(time);
                            
                            match.setStadium(stadium);
                            match.setCompetition(competition);
                            
                            
                        
                            match.setStatus(status);
                                
                    
                            matchRepository.save(match);
                        
                            return "redirect:/calendrier";
                        }
                            
                
                @RequestMapping("/updatematch")
                public String updatematch(@RequestParam String id, @RequestParam String date,  @RequestParam String time, 
                                                @RequestParam String stadium,
                                                @RequestParam String status  
                                                ) {
                                        
                                      
                                                    Optional<Match> match = matchRepository.findById(id);
                                                    
                                                  
                                                        
                                                    match.get().setDate(date);
                                                    match.get().setTime(time);
                                                    
                                                    match.get().setStadium(stadium);
                                                    
                                                    
                                                    
                                                
                                                    match.get().setStatus(status);
                                                    
                                                    
                                                    
                                                                            
                                                    matchRepository.save(match.get());
                                        
                                                    return "redirect:/calendrier" ;
                                            }
                          
                    
                
     
   

}
