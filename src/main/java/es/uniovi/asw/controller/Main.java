package es.uniovi.asw.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import es.uniovi.asw.dbupdate.ColegioRepository;
import es.uniovi.asw.dbupdate.VoterRepository;
import es.uniovi.asw.dbupdate.VotoRepository;
import es.uniovi.asw.modelo.ColegioElectoral;
import es.uniovi.asw.modelo.PartidoPolitico;
import es.uniovi.asw.modelo.Voto;

@Controller
public class Main {

	private static final Logger LOG = LoggerFactory.getLogger(Main.class);

	@Autowired
	VotoRepository votoRepository = null;
	@Autowired
	VoterRepository voterRepository = null;
	
	@Autowired
	ColegioRepository colegioRepository=null;

	@RequestMapping("/")
	public ModelAndView landing(Model model) {
		LOG.info("Index page access");

		return new ModelAndView("index");
	}

	@RequestMapping(value = "/votar")
	public String votar(Voto voto, Model model) {

		List<PartidoPolitico> partidos = new ArrayList<PartidoPolitico>();
		for (PartidoPolitico p : PartidoPolitico.values()) {
			partidos.add(p);
		}
		model.addAttribute("partidos", partidos);
		return "/votar";
	}

	@RequestMapping(value = "/votar", method = RequestMethod.POST)
	public String saveVote(Voto voto, Model model) {

		for (PartidoPolitico p : PartidoPolitico.values()) {
			if (p.equals(voto.getPartidoPolitico())) {
				Voto v = new Voto(null, p, false, false, false);
				votoRepository.save(v);
				// voterRepository.setEjercioDerechoAlVotoFor(true,
				// voter.getNif());

			} else if (voto.getPartidoPolitico().equals("")) {
				Voto v = new Voto(null, null, false, false, true);
				votoRepository.save(v);
				// voterRepository.setEjercioDerechoAlVotoFor(true,
				// voter.getNif());
			} else {
				Voto v = new Voto(null, null, false, true, false);
				votoRepository.save(v);
				// voterRepository.setEjercioDerechoAlVotoFor(true,
				// voter.getNif());
			}
		}
		return "index";
	}

	@RequestMapping("/modificar_elecciones")
	public ModelAndView modificar(Model model) {
		LOG.info("Modificar elecciones page access");
		return new ModelAndView("modificar_elecciones");
	}

	
	
	@RequestMapping(value = "/add_colegio")
	public String partido(ColegioElectoral colegioElectoral, Model model) {
		return "/add_colegio";
	}
	
	@RequestMapping(value = "/add_colegio", method = RequestMethod.POST)
	public String addPartido(ColegioElectoral colegioElectoral, Model model) {
		
		List<ColegioElectoral> colegios = colegioRepository.findAll();
		for (ColegioElectoral colegioElectoral2 : colegios) {
			if(colegioElectoral.getCodigoColegio()!= colegioElectoral2.getCodigoColegio()){
				ColegioElectoral c = new ColegioElectoral(colegioElectoral.getCodigoColegio(),
						colegioElectoral.getCircunscripcion(), colegioElectoral.getComunidadAutonoma());
				colegioRepository.save(c);
			}
		}

		return "modificar_elecciones";
	}


}