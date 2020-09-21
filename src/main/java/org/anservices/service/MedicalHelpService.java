package org.anservices.service;

import java.time.LocalDateTime;
import java.util.List;

import org.anservices.bean.MedicalHelp;

public interface MedicalHelpService {
	/**
	 * 
	 * @param mHelp
	 * @return
	 */
	public boolean submitHelp(MedicalHelp mHelp);
	/**
	 * 
	 * @return
	 */
	public List<MedicalHelp> getLatestHelp();
}
