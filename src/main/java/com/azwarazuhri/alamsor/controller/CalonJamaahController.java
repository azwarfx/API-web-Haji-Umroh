package com.azwarazuhri.alamsor.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.azwarazuhri.alamsor.entity.CalonJamaah;
import com.azwarazuhri.alamsor.repo.CalonJamaahRepoTes;
import com.azwarazuhri.alamsor.repo.CalonJamaahRepository;

@RestController
@RequestMapping("/calon-jamaah")
public class CalonJamaahController {

	@Autowired
	CalonJamaahRepository cr;
	@Autowired
	CalonJamaahRepoTes ct;

	// ById
	// List Calon Jamaah
	@RequestMapping(value = "/get-by-id", 
			method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CalonJamaah> tes(@RequestParam(value="id") Long id, CalonJamaah calonJamaah) {
		calonJamaah=ct.findOne(id);
		List<CalonJamaah> calonJamaahs = new ArrayList<>();
		calonJamaahs.add(calonJamaah);
		return calonJamaahs;
	}

	// Simpan Calon Jamaah
	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Boolean addCalonJamaah(@RequestBody CalonJamaah calonJamaah) {
		CalonJamaah jamaah = ct.save(calonJamaah);
		return true;
	}

	// Ubah
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public Boolean editCalonJamaah(@PathVariable("id") Long id, @RequestBody CalonJamaah calonJamaah) {
		calonJamaah.setId(id);
		CalonJamaah jamaah = ct.save(calonJamaah);
		return true;
	}

	// List Calon Jamaah
	@RequestMapping(value = "/get-list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Page<CalonJamaah> listJamaah(@RequestParam(value = "hal", required=false) String hal) {
		int pageS = Integer.parseInt(hal);
		PageRequest pageT = new PageRequest(pageS, 5);
		return ct.findAll(pageT);
	}

	// Hapus Calon Jamaah
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Boolean delete(@RequestParam(value = "id") Long id) {
		CalonJamaah calonJamaah = ct.findOne(id);
		ct.delete(calonJamaah);
		return true;
	}
}
