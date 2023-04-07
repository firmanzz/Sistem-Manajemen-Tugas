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
	
	@Column(name = "nim")
	private String nim;

	@Column(name = "nama")
	private String nama;
	
	@Column(name = "status")
	private TugasCategory status;
	
	public Tugas() {
		
	}
	
	public Tugas(String tugas, String nim, String nama, TugasCategory status) {
		super();
		this.tugas = tugas;
		this.nim = nim;
		this.nama = nama;
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
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
