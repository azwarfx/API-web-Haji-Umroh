package com.azwarazuhri.alamsor.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "CALONJAMAAH")
public class CalonJamaah {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String namaJamaah;
	private String binti;
	private String pengalamanHaji;
	private String thnTerakhir;
	private String noPaspor;
	private String alamat;
	private String noTlp;

}
