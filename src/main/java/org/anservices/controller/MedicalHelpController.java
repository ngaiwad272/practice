package org.anservices.controller;

import java.util.List;

import org.anservices.bean.MedicalHelp;
import org.anservices.service.MedicalHelpService;
import org.anservices.util.DateTimeUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
		mHelp.setCreatehelpdate(DateTimeUtility.getLocalDateNTime());
		medicalHelpService.submitHelp(mHelp);
		return "redirect:dboard";
	}
	@RequestMapping(value="/get_notification")
	public String getNotification(Model m){
		m.addAttribute("notifications", medicalHelpService.getLatestHelp());
		return "dashboard";
	}
}
