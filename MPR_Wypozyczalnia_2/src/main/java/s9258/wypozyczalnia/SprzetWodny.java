package s9258.wypozyczalnia;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SprzetWodny {
	
	@Id
	@GeneratedValue
	private int id;
	private String nazwa;
	private int rokProdukcji;
	private String typ;

	public SprzetWodny(){
		
	}
	
	public SprzetWodny(String nazwa, String typ, int rokProdukcji) {
		this.nazwa = nazwa;
		this.rokProdukcji = rokProdukcji;
		this.typ = typ;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public int getRokProdukcji() {
		return rokProdukcji;
	}

	public void setRokProdukcji(int rokProdukcji) {
		this.rokProdukcji = rokProdukcji;
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public void pokazSprzetWodny() {
		System.out.println("Nazwa: " + nazwa + " Typ: " + typ
				+ " Rok produkcji: " + rokProdukcji);
	}
}