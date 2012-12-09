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
	public void setUp() throws Exception 
	{
		
		klient.add(new Klient(1, "imie1", "nazwisko1"));
		klient.add(new Klient(2, "imie2", "nazwisko2"));
		klient.add(new Klient(3, "imie3", "nazwisko3"));
		
		sprzetwodny.add(new SprzetWodny ("nazwa1", "typ1", 2001));
		sprzetwodny.add(new SprzetWodny ("nazwa2", "typ2", 1998));
		
	}


	@After
	public void tearDown() throws Exception {}

	@Test
	public void testWypozyczalnia_Wodna()
	{
		assertTrue(Test.getNazwa().equals("Test"));
		assertSame(Test.getKlienci(), klient);
		assertEquals(Test.getSprzetyWodne(), sprzetwodny);
	}
	
	@Test
	public void testGetNazwa() 
	{
		assertTrue(Test.getNazwa().equals("Test"));
	}

	@Test
	public void testSetNazwa() 
	{
		Test.setNazwa("Test1");
		assertTrue(Test.getNazwa().equals("Test1"));
		assertSame("Test1", Test.getNazwa());
	}

	@Test
	public void testGetSprzetyWodne()
	{
		assertTrue(Test.getSprzetyWodne().equals(sprzetwodny));
		
	}

	@Test
	public void testSetSprzetyWodne()
	{
		Test.setSprzetyWodne(sprzetwodny);
		assertSame(sprzetwodny, Test.getSprzetyWodne());
		assertEquals(Test.getSprzetyWodne(), sprzetwodny);
	}

	@Test
	public void testGetKlienci()
	{
		assertTrue(Test.getKlienci().equals(klient));
	}

	@Test
	public void testSetKlienci() 
	{
		Test.setKlienci(klient);
		assertTrue(Test.getKlienci().equals(klient));
		assertEquals(Test.getKlienci(), klient);
	}

	@Test
	public void testDodajSprzetWodny()
	{
		assertTrue(sprzetwodny.size()==2);
	}

	@Test
	public void testDodajKlient() 
	{
		assertFalse(klient.size()==1);
		assertTrue(klient.size()==3);

	}

	@Test
	public void testWyswietlSprzetyWodne()
	{
		assertFalse(sprzetwodny.size()==1);
		assertTrue(sprzetwodny.size()==2);
		
	}

	@Test
	public void testWyswietlKlienci() 
	{
		assertFalse(klient.size()==4);
		assertTrue(klient.size()==3);
	}

	@Test
	public void testZnajdzSprzetWodny()
	{
		assertNull(Test.znajdzSprzetWodny("imie1"));
		assertNotNull(Test.znajdzSprzetWodny("nazwa1"));
	}

	@Test
	public void testZnajdzSprzetWodny_po_gatunku() 
	{
		assertNull(Test.znajdzSprzetWodny_po_typie("typ3"));
		assertNotNull(Test.znajdzSprzetWodny_po_typie("typ1"));
	}

	@Test
	public void testZnajdzKlienta()
	{
		assertNotNull(Test.znajdzKlienta("nazwisko1"));
	}

	@Test
	public void testUsunSprzetWodny()
	{
		Test.usunSprzetWodny("nazwa2");
		assertTrue(sprzetwodny.size()==1);
	}

	@Test
	public void testUsunKlient()
	{
		Test.usunKlient("nazwisko2");
		assertTrue(klient.size()==2);
	}

	@Test
	public void testZmienSprzetWodny() 
	{

	Test.zmienSprzetWodny("nazwa1", "typ1", 2001, "nazwa1", "typ2", 2001);
	assertFalse(sprzetwodny.get(0).getTyp()=="typ1");
	assertTrue(sprzetwodny.get(0).getTyp()=="typ2");
	
	
	}

	@Test
	public void testZmienKlient()
	{
		Test.zmienKlient(1, "imie1", "nazwisko1", 2, "nowe_imie", "nazwisko1");
		assertFalse(klient.get(0).getImie()=="imie1");
		assertTrue(klient.get(0).getNumer_klienta()==2);
		assertSame("nowe_imie", Test.znajdzKlienta("nazwisko1").getImie());
	}

	@Test
	public void testPokazSprzetyWodne_po_gatunku()
	{
		assertFalse(sprzetwodny.size()==1);
		assertTrue(sprzetwodny.size()==2);
	}



}
	
