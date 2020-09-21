package org.anservices.service;

import java.time.LocalDateTime;
import java.util.List;

import org.anservices.bean.MedicalHelp;
import org.anservices.repository.MedicalHelpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicalHelpServiceImpl implements MedicalHelpService{

	@Autowired
	private MedicalHelpRepository medicalHelpRepository; 
	@Override
	public boolean submitHelp(MedicalHelp mHelp) {
		medicalHelpRepository.save(mHelp);
		return true;
	}
	@Override
	public List<MedicalHelp> getLatestHelp() {
		LocalDateTime ldt=null;
		return medicalHelpRepository.findByCompletedhelpdateOrderByCreatehelpdate(ldt);
	}

}
