package s9258.wypozyczalnia_2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import s9258.wypozyczalnia_2.SprzetWodny;
import s9258.wypozyczalnia_2.Klient;
import s9258.wypozyczalnia_2.Wypozyczalnia_Wodna;


public class Wypozyczalnia_WodnaTest {
	private List<Klient> klient= new ArrayList<Klient>();
	private List<SprzetWodny> sprzetwodny= new ArrayList<SprzetWodny>();
	private Wypozyczalnia_Wodna Test = new Wypozyczalnia_Wodna ("Test", sprzetwodny, klient);

	@Before
	public void setUp() throws Exception {}


	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testWypozyczalnia_Wodna() {
		assertTrue(Test.getNazwa().equals("Test"));
		assertSame(Test.getKlienci(), klient);
		assertEquals(Test.getSprzetyWodne(), sprzetwodny);
	}
	
	
	
}