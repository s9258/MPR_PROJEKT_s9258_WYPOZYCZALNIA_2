package hibernate;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity //wskazanie hibernate, ze ma utworzyc tabele z klasy klient_hibernate
 public class klient {

private int numer_klienta;
private String imie_klienta;
private String nazwisko_klienta;

@Id // wskazanie primary key
public int getNumer_klienta() 

{
    return numer_klienta;
 }


public void setNumer_klienta(int numer_klienta)
{
    this.numer_klienta = numer_klienta;
}


public String getImie_klienta() 


{
    return imie_klienta;
}

public void setImie_klienta(String imie_klienta) 

{
    this.imie_klienta = imie_klienta;
}


public String getNazwisko_klienta() 

{
    return nazwisko_klienta;
}


public void setNazwisko_klienta(String nazwisko_klienta) 

{
    this.nazwisko_klienta = nazwisko_klienta;
}




}

