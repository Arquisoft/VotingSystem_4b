package es.uniovi.asw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Main {

  private static final Logger LOG = LoggerFactory.getLogger(Main.class);

  @RequestMapping("/")
  public ModelAndView landing(Model model) {
    LOG.info("Index page access");
    return new ModelAndView("index");
  }
  
  
  @RequestMapping(value="/votar", method=RequestMethod.POST)
  public ModelAndView votar(Model model) {
    LOG.info("Votar page access");
    model.addAttribute("partido", new String());
    
    return new ModelAndView("votar");
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