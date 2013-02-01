package s9258.wypozyczalnia;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import s9258.wypozyczalnia.repository.KlientOperacje;

public class KlientOperacjeTest {

	@Test
	public void testSaveAndGetById(){
		
		// stworzenie kllienta
		Klient k = new Klient("Jan", "Kowalski");
		
		KlientOperacje klientOperacje = new KlientOperacje();
		
		// zapisanie do bazy
		klientOperacje.saveKlient(k);

		//pobranie klienta
		Klient klientZBazy = klientOperacje.getKlientById(k.getNumerKlienta());
		
		// sprawdzenie 
		Assert.assertNotNull(klientZBazy);
		Assert.assertEquals("Jan", klientZBazy.getImie());
		Assert.assertEquals("Kowalski", klientZBazy.getNazwisko());
		
	}
	
	@Test
	public void testSprzeWodny(){
		
		// stworzenie kllienta
		Klient k = new Klient("Jan", "Kowalski");
		
		KlientOperacje klientOperacje = new KlientOperacje();
		
		//stworzenie sprzetu wodnego
		SprzetWodny sprzetWodny1 = new SprzetWodny("kajak", "2 osoby", 2000);
		SprzetWodny sprzetWodny2 = new SprzetWodny("kajak1", "1 osoba", 2001);
		List<SprzetWodny> listaSprzetu = new ArrayList<SprzetWodny>();
		listaSprzetu.add(sprzetWodny2);
		listaSprzetu.add(sprzetWodny1);
		k.setSprzetWodnyList(listaSprzetu);
		
		// zapisanie do bazy
		klientOperacje.saveKlient(k);

		//pobranie klienta
		Klient klientZBazy = klientOperacje.getKlientById(k.getNumerKlienta());
		
		// sprawdzenie 
		Assert.assertNotNull(klientZBazy);
		Assert.assertEquals("Jan", klientZBazy.getImie());
		Assert.assertEquals("Kowalski", klientZBazy.getNazwisko());
		Assert.assertEquals(2, klientZBazy.getSprzetWodnyList().size());
		
	}

	
	@Test
	public void testAllKlient(){
		
		// stworzenie kllienta
		Klient k = new Klient("Jan", "Kowalski");
		Klient p = new Klient("Piotr", "Nowak");
		
		KlientOperacje klientOperacje = new KlientOperacje();
		
		// zapisanie do bazy
		klientOperacje.saveKlient(k);
		klientOperacje.saveKlient(p);

		//pobranie klienta
		List<Klient> allKlient = klientOperacje.getAllKlient();
		
		// sprawdzenie 
		Assert.assertNotNull(allKlient);
		Assert.assertTrue(allKlient.size() > 2);
		
	}
	
}
