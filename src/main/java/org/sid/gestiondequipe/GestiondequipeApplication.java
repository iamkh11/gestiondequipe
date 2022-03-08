package org.sid.gestiondequipe;


import org.sid.gestiondequipe.models.News;
import org.sid.gestiondequipe.models.Player;
import org.sid.gestiondequipe.models.Role;
import org.sid.gestiondequipe.models.Staff;
import org.sid.gestiondequipe.models.Team;
import org.sid.gestiondequipe.repositories.NewsRepository;
import org.sid.gestiondequipe.repositories.PlayerRepository;
import org.sid.gestiondequipe.repositories.RoleRepository;
import org.sid.gestiondequipe.repositories.StaffRepository;
import org.sid.gestiondequipe.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GestiondequipeApplication  implements CommandLineRunner{

    private final TeamRepository teamRepository;
    private final PlayerRepository playerRepository;
    private final StaffRepository staffRepository;
    private final NewsRepository newsRepository;

    @Autowired
	public GestiondequipeApplication(TeamRepository teamRepository,PlayerRepository playerRepository,
    StaffRepository staffRepository,NewsRepository newsRepository ) {
    
		
		this.teamRepository=teamRepository;
        this.playerRepository=playerRepository;
        this.staffRepository=staffRepository;
        this.newsRepository=newsRepository;
	       
	}
	

	@Override
	public void run(String... args) throws Exception {
		
		// clear database
		
		System.out.println("==========Delete all entities==========");
        //  newsRepository.deleteAll();
        System.out.println("==========Save entities==========");


         

                                        //   teamRepository.save(new Team (null,"Manchester City","Citizens", "1880, Gorton, Manchester, United Kingdom", " City Football Group", "Premier League", "assets/images/teams/mancity.png"));
                                        //   teamRepository.save(new Team (null,"Arsenal","Gunners", "1886, Woolwich, London, United Kingdom", " Kroenke Sports & Entertainment", "Premier League", "assets/images/teams/arsenal.png"));
                                        //   teamRepository.save(new Team (null,"Aston Villa","The Villa", "1897,  Aston, Birmingham, United Kingdom", " Wes Edens", "Premier League", "assets/images/teams/astonvilla.png"));
                                        //   teamRepository.save(new Team (null,"Liverpool","Reds", "1892,  Anfield, Liverpool, United Kingdom", " Fenway Sports Group", "Premier League", "assets/images/teams/liverpool.png"));
                                        //   teamRepository.save(new Team (null,"Everton","The Black Watch", "1878, Liverpool, Liverpool, United Kingdom", " Farhad Moshiri", "Premier League", "assets/images/teams/everton.png"));
                                        //   teamRepository.save(new Team (null,"Newcastle","The Magpies", "1892,  Newcastle upon Tyne, London, United Kingdom", " Mike Ashley", "Premier League", "assets/images/teams/newcastle.png"));
                                        //   teamRepository.save(new Team (null,"Southhampton","the Saints", "1885,  Southampton, London, United Kingdom", " Gao Jisheng", "Premier League", "assets/images/teams/southhampton.png"));
                                        //   teamRepository.save(new Team (null,"Watford","The Hornets", "1881,  Watford, Hertfordshire, United Kingdom", " Gino Pozzo", "Premier League", "assets/images/teams/watford.png"));
                                        //   teamRepository.save(new Team (null,"Tottenham","Spurs", "1882,  Tottenham, London, United Kingdom", " ENIC Group", "Premier League", "assets/images/teams/tottenham.png"));
                                        //   teamRepository.save(new Team (null,"West Ham","Hammers", "1895,  Stratford, London, United Kingdom", " David Sullivan", "Premier League", "assets/images/teams/westham.png"));
                                        //   teamRepository.save(new Team (null,"Norwich","The Canaries", "1902,  Norwich, Norwich, United Kingdom", "Michael Wynn-Jones", "Premier League", "assets/images/teams/norwich.png"));
                                        //   teamRepository.save(new Team (null,"Chelsea","Blues", "1905, London,  London, United Kingdom", "Roman Abramovich", "Premier League", "assets/images/teams/chelsea.png"));
                                        //   teamRepository.save(new Team (null,"Burnley","the Clarets", "1882,  Burnley,Burnley, United Kingdom", "ALK Capital", "Premier League", "assets/images/teams/burnley.png"));
                                        //   teamRepository.save(new Team (null,"Brentford","The Bees", "1889,  Brentford, West London, United Kingdom", "Matthew Benham", "Premier League", "assets/images/teams/brentford.png"));
                                        //   teamRepository.save(new Team (null,"Leeds United","The Whites", "1919,   Leeds, West Yorkshire, United Kingdom", "Andrea Radrizzani", "Premier League", "assets/images/teams/leeds.png"));
                                        //   teamRepository.save(new Team (null,"Leicester","Foxes", "1884,   Leicester, East Midlands, United Kingdom", " King Power", "Premier League", "assets/images/teams/leicester.png"));
                                        //   teamRepository.save(new Team (null,"Wolverhampton","wolves", "1879, Wolverhampton, West Midlands, United Kingdom", " Fosun International", "Premier League", "assets/images/teams/wolverhampton.png"));
                                        //   teamRepository.save(new Team (null,"Brighton","Seagulls", "1901, Brighton and Hove, Brighton and Hove, United Kingdom", " Tony Bloom", "Premier League", "assets/images/teams/brighton.png"));
                                        //   teamRepository.save(new Team (null,"Crystal Palace","Eagles", "1905,  Croydon, South London, United Kingdom", " Steve Parish", "Premier League", "assets/images/teams/crystal.png"));
                                        //   teamRepository.save(new Team (null,"Manchester United","Red Devils", "1878, Newton Heath, Manchester, Royaume-Uni", "Glazers","Premier League", "assets/images/teams/ManUnited.png"));
                                        //   teamRepository.save(new Team (null,"Real Madrid","Los Blancos", "1902, Avenida Concha Espina Madrid", "Florentino Pérez", "La Liga", "assets/images/teams/madrid.png"));
                                        //   teamRepository.save(new Team (null,"FC Barcelona","Barça", "1899, Barcelone , capital of Catalogne", "Joan Laporta", "La Liga", "assets/images/teams/barcelona.png"));
                                        //   teamRepository.save(new Team (null,"Bayern Munich","The Bavarians", "1900 Munich, Bavière", "Karl-Heinz Rummenigge", "Bundesliga", "assets/images/teams/bayern.png"));
                                        //   teamRepository.save(new Team (null,"Paris Saint-Germain","PSG", "1970 Saint-Germain-en-Laye ,Paris", "Nasser al-Khelaïfi", "Ligue 1", "assets/images/teams/psg.png"));
                                          
                                          
                                        // playerRepository.save(new Player (null,"Cristiano Ronaldo",37, "05/02/1985", "Portuguese",7,"CF","assets/images/players/cristiano.png"));
                                        // playerRepository.save(new Player (null,"David De Gea",31, "07/11/1990", "Spanish",1,"GK","assets/images/players/degea.png"));
                                        // playerRepository.save(new Player (null,"Leonel Messi",31, "07/11/1990", "Argentinian",30,"AMF","assets/images/players/messi.png"));
                                        // playerRepository.save(new Player (null,"Ferjani Sassi",34, "05/02/1985", "Tunisien",13,"CMF","assets/images/players/ferjani.png"));
                                        // playerRepository.save(new Player (null,"Hannibal Mejbri",18, "05/02/2002", "Tunisien",14,"AMF","assets/images/players/hannibal.png"));
                                        // playerRepository.save(new Player (null,"Wahbi Khazri",30, "05/02/1990", "Tunisien",21,"AMF","assets/images/players/kazri.png"));
                                        // playerRepository.save(new Player (null,"Kylian Mbappe",22, "05/02/1999", "French",11,"RW","assets/images/players/mbappe.png"));
                                        // playerRepository.save(new Player (null,"Yussef M'sakni",31, "05/02/1990", "Tunisien",5,"LW","assets/images/players/msakni.png"));
                                        // playerRepository.save(new Player (null,"Neymar Junior",29, "05/02/1992", "Brazilien",10,"LW","assets/images/players/neymar.png"));
                                        // playerRepository.save(new Player (null,"Sergio Ramos",35, "05/02/1987", "Spanish",4,"CB","assets/images/players/ramos.png"));
                                        
                                        // playerRepository.save(new Player (null,"Elyes Skhiri",26, "05/02/1995", "Tunisien",4,"DMF","assets/images/players/skhiri.png"));
                                        // playerRepository.save(new Player (null,"Zlatan Ibrahimovic",40, "03/10/1983", "Swidish",99,"CF","assets/images/players/zlatan.png"));
                      


















       
                                            
       
    }


	public static void main(String[] args) {
		SpringApplication.run(GestiondequipeApplication.class, args);
	}


	@Bean
    CommandLineRunner init(RoleRepository roleRepository) {

        return args -> {

            Role adminRole = roleRepository.findByRole("ADMIN");
            if (adminRole == null) {
                Role newAdminRole = new Role();
                newAdminRole.setRole("ADMIN");
                roleRepository.save(newAdminRole);
            }

            Role userRole = roleRepository.findByRole("USER");
            if (userRole == null) {
                Role newUserRole = new Role();
                newUserRole.setRole("USER");
                roleRepository.save(newUserRole);
            }
        };

    }

}
