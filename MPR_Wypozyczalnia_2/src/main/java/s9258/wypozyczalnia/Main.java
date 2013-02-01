package s9258.wypozyczalnia;

import java.util.ArrayList;
import java.util.List;

import s9258.wypozyczalnia.repository.KlientOperacje;

//import org.hibernate.cfg

public class Main {

	public static void main(String[] args) {

		List<SprzetWodny> SprzetyWodne = new ArrayList<SprzetWodny>();
		List<Klient> Klienci = new ArrayList<Klient>();

		WypozyczalniaWodna nowa = new WypozyczalniaWodna("nowa", SprzetyWodne,
				Klienci);

		nowa.dodajSprzetWodny("Kajak", "1-osobowy", 1985);
		nowa.dodajSprzetWodny("Kanadyjka", "2-osobowy", 1992);
		nowa.dodajSprzetWodny("KajakDrewniany", "3-osobowy", 1999);

		nowa.dodajSprzetWodny("Rower Wodny", "3-osobowy", 2001);
		nowa.dodajSprzetWodny("Banan", "2-osobowy", 2005);
		nowa.dodajSprzetWodny("Lodka", "4-osobowa", 2003);

		nowa.dodajKlient(1, "Krzysztof", "Raczkowski");
		nowa.dodajKlient(2, "Marek", "Nowak");
		nowa.dodajKlient(3, "Iwona", "Zawadzka");

		nowa.wyswietlSprzetyWodne();
		System.out.println("-----------------------------");
		nowa.wyswietlKlienci();
		System.out.println("-----------------------------");
		nowa.pokazSprzetyWodne_po_typie(nowa
				.znajdzSprzetWodny_po_typie("2-osobowy"));
		System.out.println("-----------------------------");

		nowa.usunKlient("Raczkowski");
		nowa.usunSprzetWodny("KajakDrewniany");

		nowa.wyswietlSprzetyWodne();
		System.out.println("-----------------------------");
		nowa.wyswietlKlienci();
		System.out.println("-----------------------------");

		nowa.zmienSprzetWodny("Kanadyjka", "2-osobowy", 1992, "Kanadyjka",
				"3-osobowy", 2012);
		nowa.zmienSprzetWodny("Banan", "2-osobowy", 1976, "Banan", "3-osobowy",
				2010);
		nowa.zmienKlient(11, "Iwona", "Zawadzka", 11, "Iwona", "Zawisza");

		nowa.wyswietlSprzetyWodne();
		System.out.println("-----------------------------");
		nowa.wyswietlKlienci();
		System.out.println("-----------------------------");

		KlientOperacje klientOperacje = new KlientOperacje();

		Klient k = new Klient(null, null);
		k.setImie("krzysztof");
		k.setNazwisko("raczkowski");

		klientOperacje.saveKlient(k);

	}
}