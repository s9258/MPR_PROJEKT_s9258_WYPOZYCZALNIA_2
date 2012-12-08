package s9258.wypozyczalnia_2;

public class SprzetWodny {

private String Nazwa;
private int Rok_produkcji;
private String Typ;


public SprzetWodny(String nazwa, String typ, int rok_produkcji) 

{
this.Nazwa = nazwa;
this.Rok_produkcji = rok_produkcji;
this.Typ = typ;
}

public String getNazwa() 
{
return Nazwa;
}

public void setNazwa(String nazwa) 
{
Nazwa = nazwa;
}

public int getRok_produkcji() 
{
return Rok_produkcji;
}

public void setRok_produkcji(int rok_produkcji) 
{
Rok_produkcji = rok_produkcji;
}

public String getTyp() 
{
return Typ;
}

public void setTyp(String typ) 
{
this.Typ = typ;
}

public void pokazSprzetWodny()
{
System.out.println("Nazwa: " + Nazwa + " Typ: " + Typ + " Rok produkcji: " + Rok_produkcji);
}
}