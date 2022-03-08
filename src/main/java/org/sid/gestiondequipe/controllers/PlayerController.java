package org.sid.gestiondequipe.controllers;

import java.util.Optional;

import org.sid.gestiondequipe.models.Player;
import org.sid.gestiondequipe.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlayerController {
    
    @Autowired
    PlayerRepository playerRepository;
    

    @RequestMapping("/joueurs")
    public String players(Model model) {

        model.addAttribute("players", playerRepository.findAll(Sort.by(Sort.Direction.DESC, "id")));
        
        
        return "joueurs";
    }

    @RequestMapping("/deleteplayer")
    public String delete(@RequestParam String id) {
       
        playerRepository.deleteById(id);

        return "redirect:/joueurs";
    }

    

    @RequestMapping("/saveplayer")
    public String save(@RequestParam String player_fullname, @RequestParam Integer player_age, 
                        @RequestParam String player_birth_date ,@RequestParam String player_nationality ,
                        @RequestParam Integer player_number ,@RequestParam String player_position , 
                        @RequestParam String player_pic_URL
                    )   {
                            Player players = new Player();
                                
                                players.setPlayer_fullname(player_fullname);
                                players.setPlayer_age(player_age);
                                players.setPlayer_birth_date(player_birth_date);
                                players.setPlayer_nationality(player_nationality);
                                players.setPlayer_number(player_number);
                                players.setPlayer_position(player_position);
                                players.setPlayer_pic_URL(player_pic_URL);
                                
                                playerRepository.save(players);
                                
                                return "redirect:/joueurs";
                        }      

    @RequestMapping("/updateplayer")
    public String update(@RequestParam String id,@RequestParam String player_fullname, @RequestParam Integer player_age, 
                            @RequestParam String player_birth_date ,@RequestParam String player_nationality ,
                            @RequestParam Integer player_number ,@RequestParam String player_position , 
                            @RequestParam String player_pic_URL) 
                        {
                                                        
                            Optional<Player> players = playerRepository.findById(id);
                        
                            players.get().setPlayer_fullname(player_fullname);
                            players.get().setPlayer_age(player_age);
                            players.get().setPlayer_birth_date(player_birth_date);
                            players.get().setPlayer_nationality(player_nationality);
                            players.get().setPlayer_number(player_number);
                            players.get().setPlayer_position(player_position);
                            players.get().setPlayer_pic_URL(player_pic_URL);

                            playerRepository.save(players.get());
                
                            return "redirect:/joueurs" ;
                        }
                            
                        
                            
                            
                            
                          
                                
                                
                                
                               
                            
                                
                            
                            
                                
   
}
