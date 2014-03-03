package com.reglamb.projvehimerc.controller;
/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
//import org.springframework.web.servlet.mvc.SimpleFormController;

import com.reglamb.projvehimerc.domain.vehiculo.Vehiculo_Soat;
import com.reglamb.projvehimerc.service.HabilitacionVehicular_InscripcionFacade;

@Controller
@RequestMapping("/inscripcionVehicular")
@SessionAttributes("inscripcion")
public class InscripcionController{
	
	private HabilitacionVehicular_InscripcionFacade inscripcionHabilitacionVehicFacade;
	
	@Autowired
	public InscripcionController(HabilitacionVehicular_InscripcionFacade inscripcionHabilitacionVehicFacade){
		this.inscripcionHabilitacionVehicFacade = inscripcionHabilitacionVehicFacade;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(Model model) {
		Vehiculo_Soat inscripcion = new Vehiculo_Soat();
		model.addAttribute("inscripcion", inscripcion);
		return "inscripcionVehicular";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String save(@ModelAttribute("inscripcion") Vehiculo_Soat vehiculosoat,
			BindingResult result, SessionStatus status) {
	        //System.out.println("Numero Sisgedo:" +vehiculosoat.getNum_poliza());
	        System.out.println("Insert y/o Update Inscripcion Vehicular");
	        try {
	        	//vehiculosoat.setId_soat((long) 3444433);
	        	//vehiculosoat.setNum_poliza(vehiculosoat.getNum_poliza());
	            //System.out.println("Numero_Poliza = "+vehiculosoat.getNum_poliza());
	            //System.out.println("Codigo:" +vehiculosoat.getId_soat());
	        	this.inscripcionHabilitacionVehicFacade.saveVehiculoSoat(vehiculosoat);
	        } catch(Exception e) {
	            e.printStackTrace();
	        }
	        //return "welcome";
	        return "inscripcionVehicular";
	        //return "redirect:/error.jsp";
	    }
}
*/