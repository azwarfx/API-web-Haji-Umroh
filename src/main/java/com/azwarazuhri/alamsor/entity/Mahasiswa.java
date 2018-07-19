package com.azwarazuhri.alamsor.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mahasiswa {
	@Id
	private Long id;
	private String nama;
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
}
