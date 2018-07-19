package com.azwarazuhri.alamsor.repo;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.azwarazuhri.alamsor.entity.CalonJamaah;

@Repository
public interface CalonJamaahRepository extends CrudRepository<CalonJamaah, Long> {
	public CalonJamaah findById(Long id);

	public  List<CalonJamaah> findAll();
}
