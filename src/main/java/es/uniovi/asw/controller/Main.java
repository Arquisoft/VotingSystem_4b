package es.uniovi.asw.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import es.uniovi.asw.dbupdate.PartidoRepository;
import es.uniovi.asw.dbupdate.VoterRepository;
import es.uniovi.asw.dbupdate.VotoRepository;
import es.uniovi.asw.dbupdate.modelo.Partido;
import es.uniovi.asw.dbupdate.modelo.Voto;


@Controller
public class Main {

  private static final Logger LOG = LoggerFactory.getLogger(Main.class);
  
  @Autowired
  PartidoRepository partidoRepository=null;
  @Autowired
  VotoRepository votoRepository =null;
  @Autowired
  VoterRepository voterRepository = null;

  @RequestMapping("/")
  public ModelAndView landing(Model model ) {
    LOG.info("Index page access");
     
    return new ModelAndView("index");
  }
  
  @RequestMapping(value = "/votar")
  public String votar(Partido partido, Model model) {
      return "/votar";
  }
 
  @RequestMapping(value = "/votar", method = RequestMethod.POST)
  public String saveVote(Partido partido, Model model) {
	  
	  List<Partido> partidos = new ArrayList<Partido>();
	  partidos = partidoRepository.findAll();
	  for (Partido p : partidos) {
		if(p.getSigla().equals(partido.getSigla())){
			Voto voto = new Voto(null, partido, false, false, false);
			votoRepository.save(voto);
			//voterRepository.setEjercioDerechoAlVotoFor(true, voter.getNif());
			
		}else if(partido.getSigla().equals("")){
			Voto voto = new Voto(null, null, false, false, true);
			votoRepository.save(voto);
			//voterRepository.setEjercioDerechoAlVotoFor(true, voter.getNif());
		}else{
			Voto voto = new Voto(null, null, false, true, false);
			votoRepository.save(voto);
			//voterRepository.setEjercioDerechoAlVotoFor(true, voter.getNif());
		}
	}
      System.out.println(partido.getSigla());
      return "index";
  }
  
  
  @RequestMapping("/modificar_elecciones")
  public ModelAndView modificar(Model model) {
    LOG.info("Modificar elecciones page access");
    return new ModelAndView("modificar_elecciones");
  }
  
  
  @RequestMapping("/add_colegio")
  public ModelAndView addColegio(Model model) {
    LOG.info("Add school page access");
    return new ModelAndView("add_colegio");
  }
  
  
  @RequestMapping("/add_partido")
  public ModelAndView addPartido(Model model) {
    LOG.info("Add politic party page access");
    return new ModelAndView("add_partido");
  }
  
}