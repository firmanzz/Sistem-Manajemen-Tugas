package net.javaguides.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.sms.entity.Tugas;
import net.javaguides.sms.service.TugasService;

@Controller
public class TugasController {
	
	private TugasService tugasService;

	public TugasController(TugasService tugasService) {
		super();
		this.tugasService = tugasService;
	}
	
	// handler method to handle list students and return mode and view
	@GetMapping("/tugas")
	public String listTugas(Model model) {
		model.addAttribute("tugas", tugasService.getAllTugas());
		return "tugas";
	}
	
	@GetMapping("/tugas/new")
	public String createTugasForm(Model model) {
		
		Tugas tugas = new Tugas();
		model.addAttribute("tugas", tugas);
		return "create_tugas";
		
	}
	
	@PostMapping("/tugas")
	public String saveTugas(@ModelAttribute("tugas") Tugas tugas) {
		tugasService.saveTugas(tugas);
		return "redirect:/tugas";
	}
	
	@GetMapping("/tugas/edit/{id}")
	public String editTugasForm(@PathVariable String id, Model model) {
		model.addAttribute("tugas", tugasService.getTugasById(id));
		return "edit_tugas";
	}

	@PostMapping("/tugas/{id}")
	public String updateTugas(@PathVariable String id,
			@ModelAttribute("tugas") Tugas tugas,
			Model model) {
		
		Tugas existingTugas = tugasService.getTugasById(id);
		existingTugas.setId(id);
		existingTugas.setTugas(tugas.getTugas());
		existingTugas.setStatus(tugas.getStatus());
		
		// save updated student object
		tugasService.updateTugas(existingTugas);
		return "redirect:/tugas";		
	}
	
	// handler method to handle delete student request
	
	@GetMapping("/tugas/{id}")
	public String deleteTugas(@PathVariable String id) {
		tugasService.deleteTugasById(id);
		return "redirect:/tugas";
	}
	
}
