
package servis_otomasyonu;

import java.sql.Date;
import java.sql.Time;


public class okulClass {
 private int OkulID;
 private String OkulAdi;
 private String Adres;
 private Time BaslamaSaati;
 private Time BitisSaati;

    public okulClass(int OkulID, String OkulAdi, String Adres, Time BaslamaSaati, Time BitisSaati) {
        this.OkulID = OkulID;
        this.OkulAdi = OkulAdi;
        this.Adres = Adres;
        this.BaslamaSaati = BaslamaSaati;
        this.BitisSaati=BitisSaati;
    }

    public Time getBitisSaati() {
        return BitisSaati;
    }

    public void setBitisSaati(Time BitisSaati) {
        this.BitisSaati = BitisSaati;
    }

    public int getOkulID() {
        return OkulID;
    }

    public void setOkulID(int OkulID) {
        this.OkulID = OkulID;
    }

    public String getOkulAdi() {
        return OkulAdi;
    }

    public void setOkulAdi(String OkulAdi) {
        this.OkulAdi = OkulAdi;
    }

    public String getAdres() {
        return Adres;
    }

    public void setAdres(String Adres) {
        this.Adres = Adres;
    }

    public Time getBaslamaSaati() {
        return BaslamaSaati;
    }

    public void setBaslamaSaati(Time BaslamaSaati) {
        this.BaslamaSaati = BaslamaSaati;
    }

    
 
 
 
    
}
