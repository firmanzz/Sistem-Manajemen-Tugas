package net.javaguides.sms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tugas")
public class Tugas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@Column(name = "tugas", nullable = false)
	private String tugas;
	
	@Column(name = "status")
	private TugasCategory status;
	
	public Tugas() {
		
	}
	
	public Tugas(String tugas, TugasCategory status) {
		super();
		this.tugas = tugas;
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTugas() {
		return tugas;
	}
	public void setTugas(String tugas) {
		this.tugas = tugas;
	}

	public TugasCategory getStatus(){
		return status;
	}
	public void setStatus(TugasCategory status){
		this.status = status;
	}
}
