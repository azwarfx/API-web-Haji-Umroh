package com.azwarazuhri.alamsor;





import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.azwarazuhri.alamsor.entity.CalonJamaah;
import com.azwarazuhri.alamsor.repo.CalonJamaahRepoTes;
import com.azwarazuhri.alamsor.repo.CalonJamaahRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CalonJamaahTes {
	
	@Autowired
	CalonJamaahRepoTes ct;
	
	@Autowired
	CalonJamaahRepository cr;
	
//	@Test
//	public void isi() {
//		CalonJamaah cj = new CalonJamaah();
//		cj.setNamaJamaah("Azwar Annas");
//		ct.save(cj);
//	}
	
	
//	@Test
//	public void tes() {
//		//System.out.println("Azwar");
//		
//		CalonJamaah cj= ct.findOne("2");
//		//cj.setNamaJamaah("Azwar Annas");
//		//ct.save(cj);
//		System.out.println(ct.findAll());
//		System.out.println(cj.getNamaJamaah());
////		Assert.assertNotNull(ct);
//		Assert.assertEquals("Azwar Annas", cj.getNamaJamaah());
//	}
//	@Test
//	public void listJamaah(){
//		//List<CalonJamaah> calonJamaahs = ct.findAll(2);
//		//List<CalonJamaahVO> calonJamaahVOs = new ArrayList<>();
//		for (CalonJamaah calonJamaah : ct.findAll()) {
//			CalonJamaahVO vo = new CalonJamaahVO();
//			vo.setId(calonJamaah.getId());
//			vo.setNamaJamaah(calonJamaah.getNamaJamaah());
//			vo.setBinti(calonJamaah.getBinti());
//			vo.setPengalamanHaji(calonJamaah.getPengalamanHaji());
//			vo.setThnTerakhir(calonJamaah.getThnTerakhir());
//			vo.setNoPaspor(calonJamaah.getNoPaspor());
//			vo.setAlamat(calonJamaah.getAlamat());
//			vo.setNoTlp(calonJamaah.getNoTlp());
//			//calonJamaahVOs.add(vo);
//			System.out.println(vo.getNamaJamaah());
//		}
//	}
	
//	@Test
//	public void hapus() {
//		CalonJamaah cj = ct.findOne("2");
////		cj.setNamaJamaah("2");
//		ct.delete(cj);
//	}
}
