package org.sid.gestiondequipe.controllers;

import org.springframework.data.domain.Sort;

import java.util.Optional;

import org.sid.gestiondequipe.models.Team;
import org.sid.gestiondequipe.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class TeamController {
    
    @Autowired
    TeamRepository teamRepository;

   // afficher tous les equipes DESC 
    @RequestMapping("/equipes")
    public String getAllTeams(Model model) {
        model.addAttribute("equipe", teamRepository.findAll(Sort.by(Sort.Direction.DESC, "id")));
        return "equipes";
    }


     // Supprimer une equipe selon l'id et redirection vers le tableau d equipes 
     @RequestMapping("/deleteequipe")
     public String deleteTeamById(@RequestParam String id) {
         
        teamRepository.deleteById(id);
 
         return "redirect:/equipes";
    }

     //  Update Team by id
     @RequestMapping("/updateteam")
     public String updateTeam(@RequestParam String id, @RequestParam String team_name ,
                                @RequestParam String team_nickname, 
                                @RequestParam String team_founded, @RequestParam String team_owner , 
                                @RequestParam String team_league ,@RequestParam String logo_URL
                                
                                ) {
       
                                    Optional<Team> team = teamRepository.findById(id);
                                    
                                    team.get().setTeam_name(team_name);
                                    team.get().setTeam_nickname(team_nickname);
                                    team.get().setTeam_founded(team_founded);
                                    team.get().setTeam_owner(team_owner);
                                    team.get().setTeam_league(team_league);
                                    team.get().setLogo_URL(logo_URL);
                                    
                                    
                                    teamRepository.save(team.get());

                                    return "redirect:/equipes" ;
                                }


                

     // Creation nouveau equipe  
     @RequestMapping("/saveteam")
     public String saveTeam(@RequestParam String team_name, @RequestParam String team_nickname, 
                            @RequestParam String team_founded, @RequestParam String team_owner, 
                            @RequestParam String team_league, @RequestParam String logo_URL 
             
                            ) {

                                Team team = new Team();
                                    
                                team.setTeam_name(team_name);
                                team.setTeam_nickname(team_nickname);
                                team.setTeam_founded(team_founded);
                                team.setTeam_owner(team_owner);
                                team.setTeam_league(team_league);
                                team.setLogo_URL(logo_URL);
                                
                                teamRepository.save(team);   
                                
                                return "redirect:/equipes";
                      
                            }
    
}
