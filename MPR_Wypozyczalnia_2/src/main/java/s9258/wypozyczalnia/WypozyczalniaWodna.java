package s9258.wypozyczalnia;

import java.util.ArrayList;
import java.util.List;

public class WypozyczalniaWodna {

	private String Nazwa;
	List<SprzetWodny> SprzetyWodne = new ArrayList<SprzetWodny>();
	List<Klient> Klienci = new ArrayList<Klient>();

	public WypozyczalniaWodna(String nazwa,
			List<s9258.wypozyczalnia.SprzetWodny> sprzetwodny,
			List<s9258.wypozyczalnia.Klient> klient) {
		this.Nazwa = nazwa;
		SprzetyWodne = sprzetwodny;
		Klienci = klient;
	}

	public String getNazwa() {
		return Nazwa;
	}

	public void setNazwa(String nazwa) {
		Nazwa = nazwa;
	}

	public List<SprzetWodny> getSprzetyWodne() {
		return SprzetyWodne;
	}

	public void setSprzetyWodne(List<SprzetWodny> sprzetywodne) {
		SprzetyWodne = sprzetywodne;
	}

	public List<Klient> getKlienci() {
		return Klienci;
	}

	public void setKlienci(List<Klient> klienci) {
		Klienci = klienci;
	}

	public void dodajSprzetWodny(String nazwa, String typ, int rok_produkcji) {
		SprzetyWodne.add(new SprzetWodny(nazwa, typ, rok_produkcji));
	}

	public void dodajKlient(int numer_klienta, String imie, String nazwisko) {
		Klienci.add(new Klient(imie, nazwisko));
	}

	public void wyswietlSprzetyWodne() {
		System.out.println("Lista sprzetow wodnych:");
		System.out.println();

		for (SprzetWodny f : SprzetyWodne) {
			f.pokazSprzetWodny();
		}
	}

	public void wyswietlKlienci() {
		System.out.println("Lista klientów:");
		System.out.println();
		for (Klient k : Klienci) {
			k.pokazKlienta();
		}
	}

	public SprzetWodny znajdzSprzetWodny(String nazwa) {
		for (SprzetWodny f : SprzetyWodne) {
			if (f.getNazwa().equals(nazwa))
				return f;
		}
		return null;
	}

	public SprzetWodny znajdzSprzetWodny_po_typie(String typ) {
		for (SprzetWodny f : SprzetyWodne) {
			if (f.getTyp().equals(typ))
				return f;
		}
		return null;
	}

	public Klient znajdzKlienta(String nazwisko) {
		for (Klient k : Klienci) {
			if (k.getNazwisko().equals(nazwisko))
				return k;

		}
		return null;
	}

	public void usunSprzetWodny(String nazwa) {
		SprzetyWodne.remove(znajdzSprzetWodny(nazwa));
	}

	public void usunKlient(String nazwisko) {
		Klienci.remove(znajdzKlienta(nazwisko));
	}

	public void zmienSprzetWodny(String nazwa, String typ, int rok_produkcji,
			String nowa_nazwa, String nowy_typ, int nowy_rok_produkcji) {
		SprzetyWodne.set(SprzetyWodne.indexOf(znajdzSprzetWodny(nazwa)),
				new SprzetWodny(nowa_nazwa, nowy_typ, nowy_rok_produkcji));
	}

	public void zmienKlient(int numer_klienta, String imie, String nazwisko,
			int nowy_numer_klienta, String nowy_imie, String nowy_nazwisko) {
		Klienci.set(Klienci.indexOf(znajdzKlienta(nazwisko)), new Klient(
				nowy_imie, nowy_nazwisko));
	}

	public void pokazSprzetyWodne_po_typie(SprzetWodny f) {

		for (SprzetWodny sprzetwodny : SprzetyWodne) {
			if (f.getTyp().equals(sprzetwodny.getTyp()))
				sprzetwodny.pokazSprzetWodny();
		}
	}
}