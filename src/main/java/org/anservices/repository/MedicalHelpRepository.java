package org.anservices.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.anservices.bean.MedicalHelp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalHelpRepository extends JpaRepository<MedicalHelp, Integer>{
	List<MedicalHelp> findByCompletedhelpdateOrderByCreatehelpdate(LocalDateTime ldt);

}
