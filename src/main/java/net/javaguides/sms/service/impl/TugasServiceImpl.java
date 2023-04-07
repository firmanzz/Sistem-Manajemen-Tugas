package net.javaguides.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.sms.entity.Tugas;
import net.javaguides.sms.repository.TugasRepository;
import net.javaguides.sms.service.TugasService;

@Service
public class TugasServiceImpl implements TugasService{

	private TugasRepository tugasRepository;
	
	public TugasServiceImpl(TugasRepository tugasRepository) {
		super();
		this.tugasRepository = tugasRepository;
	}

	@Override
	public List<Tugas> getAllTugas() {
		return tugasRepository.findAll();
	}

	@Override
	public Tugas saveTugas(Tugas tugas) {
		return tugasRepository.save(tugas);
	}

	@Override
	public Tugas getTugasById(String id) {
		return tugasRepository.findById(id).get();
	}

	@Override
	public Tugas updateTugas(Tugas tugas) {
		return tugasRepository.save(tugas);
	}

	@Override
	public void deleteTugasById(String id) {
		tugasRepository.deleteById(id);	
	}

}
