package es.uniovi.asw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Main {

  private static final Logger LOG = LoggerFactory.getLogger(Main.class);

  @RequestMapping("/")
  public ModelAndView landing(Model model) {
    LOG.info("Index page access");
    return new ModelAndView("index");
  }
  
  
  @RequestMapping("/votar")
  public ModelAndView votar(Model model) {
    LOG.info("Votar page access");
    return new ModelAndView("votar");
  }
  
  @RequestMapping("/modificar_elecciones")
  public ModelAndView modificar(Model model) {
    LOG.info("Modificar elecciones page access");
    return new ModelAndView("modificar_elecciones");
  }
  
}