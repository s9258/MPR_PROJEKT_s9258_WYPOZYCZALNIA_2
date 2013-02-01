package s9258.wypozyczalnia;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
// wskazanie hibernate, ze ma utworzyc tabele z klasy klient_hibernate
public class Klient {

	@Id
	// wskazanie primary key
	@GeneratedValue
	// automatyczne generowanie primary key
	private int numerKlienta;
	private String imie;
	private String nazwisko;

	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="klientId") // dolacza kolumne 'klientId' do tabeli ze SprzetemWodnym. Kolumna ta jest kluczem obcym
	private List<SprzetWodny> sprzetWodnyList;

	public Klient() {
	}
	
	public Klient(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

	public int getNumerKlienta() {
		return numerKlienta;
	}

	public void setNumerKlienta(int numerKlienta) {
		this.numerKlienta = numerKlienta;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public void pokazKlienta() {
		System.out.println("Numer klienta: " + numerKlienta
				+ " Imie i Nazwisko " + imie + " " + nazwisko);
	}

	public List<SprzetWodny> getSprzetWodnyList() {
		return sprzetWodnyList;
	}

	public void setSprzetWodnyList(List<SprzetWodny> sprzetWodnyList) {
		this.sprzetWodnyList = sprzetWodnyList;
	}

}