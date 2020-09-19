package org.anservices.controller;

import org.anservices.bean.MedicalHelp;
import org.anservices.service.MedicalHelpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MedicalHelpController {
	@Autowired
	private MedicalHelpService medicalHelpService;
	
	@RequestMapping(value = "/getmedicalhelp")
	public String getMedicalHelp() {	
		return "medical_emergency";
	}
	
	@RequestMapping(value="/submithelp")
	public String submitHelp(MedicalHelp mHelp) {
		medicalHelpService.submitHelp(mHelp);
		return "redirect:dboard";
	}
}
