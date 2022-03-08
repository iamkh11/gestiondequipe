package org.sid.gestiondequipe.controllers;


import java.util.Optional;

import org.sid.gestiondequipe.models.Staff;
import org.sid.gestiondequipe.repositories.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.data.domain.Sort;

@Controller
public class StaffController {
    
    @Autowired
    StaffRepository staffRepository;

    // afficher tous le staff de l'equipe  
    @GetMapping("/staff")
    public String getAllStaff(Model model) {
        model.addAttribute("staff", staffRepository.findAll(Sort.by(Sort.Direction.DESC, "id")));
        return "staff";
    }

    // Supprimer un membre de staff selon l'id et redirection vers le tableau de staff 
    @RequestMapping("/deletestaff")
    public String deleteStaffById(@RequestParam String id) {
        
        staffRepository.deleteById(id);

        return "redirect:/staff";
    }

   

    @RequestMapping("/savestaff")
    public String saveStaff(@RequestParam String staff_fullname, @RequestParam Integer staff_age, 
                        @RequestParam String staff_birth_date, @RequestParam String staff_nationality, 
                        @RequestParam String staff_gender,
                        @RequestParam String staff_role , @RequestParam String staff_pic_URL
                        
                      ) {
            
                            Staff staff = new Staff();
                                
                            staff.setStaff_fullname(staff_fullname);
                            staff.setStaff_age(staff_age);
                            staff.setStaff_birth_date(staff_birth_date);
                            staff.setStaff_nationality(staff_nationality);
                            staff.setStaff_gender(staff_gender);   
                            staff.setTeam_fullname("Tunisia");
                            staff.setStaff_role(staff_role);
                            staff.setStaff_pic_URL(staff_pic_URL);  
                            

                            staffRepository.save(staff);
                            
                            return "redirect:/staff";
                        }

                      
                        

    @RequestMapping("/updatestaff")
    public String update(@RequestParam String id,@RequestParam String staff_fullname, @RequestParam Integer staff_age, 
                        @RequestParam String staff_birth_date, @RequestParam String staff_nationality, 
                        @RequestParam String staff_gender,
                        @RequestParam String staff_role , @RequestParam String staff_pic_URL
                        ){
                          
                            Optional<Staff> staff = staffRepository.findById(id);

                             staff.get().setStaff_fullname(staff_fullname);
                             staff.get().setStaff_age(staff_age);
                             staff.get().setStaff_birth_date(staff_birth_date);
                             staff.get().setStaff_nationality(staff_nationality);
                             staff.get().setStaff_gender(staff_gender);
                             staff.get().setStaff_role(staff_role);
                             staff.get().setStaff_pic_URL(staff_pic_URL);

                            staffRepository.save(staff.get());
            
                            return "redirect:/staff" ;
                        }                 

                        




}
