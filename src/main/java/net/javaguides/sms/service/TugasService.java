package net.javaguides.sms.service;

import java.util.List;

import net.javaguides.sms.entity.Tugas;

public interface TugasService {
	List<Tugas> getAllTugas();
	
	Tugas saveTugas(Tugas tugas);
	
	Tugas getTugasById(String id);
	
	Tugas updateTugas(Tugas tugas);
	
	void deleteTugasById(String id);
}
