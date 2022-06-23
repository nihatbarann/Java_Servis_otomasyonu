
package servis_otomasyonu;

public class FaturaClass {
   private int FaturaID;
   private int PersonelID;
   private String Adi;
   private String soyadi;
   private String telefon;
   private String plaka;
   private String tarih;
   private String FaturaSeri;
   private String FaturaNo;

    public FaturaClass(int FaturaID, int PersonelID, String Adi, String soyadi, String telefon, String plaka, String tarih,String faturaNo,String faturaSeri) {
        this.FaturaID = FaturaID;
        this.PersonelID = PersonelID;
        this.Adi = Adi;
        this.soyadi = soyadi;
        this.telefon = telefon;
        this.plaka = plaka;
        this.tarih = tarih;
        this.FaturaNo=faturaNo;
        this.FaturaSeri=faturaSeri;
    }

    public String getFaturaSeri() {
        return FaturaSeri;
    }

    public void setFaturaSeri(String FaturaSeri) {
        this.FaturaSeri = FaturaSeri;
    }

    public String getFaturaNo() {
        return FaturaNo;
    }

    public void setFaturaNo(String FaturaNo) {
        this.FaturaNo = FaturaNo;
    }

    public int getFaturaID() {
        return FaturaID;
    }

    public void setFaturaID(int FaturaID) {
        this.FaturaID = FaturaID;
    }

    public int getPersonelID() {
        return PersonelID;
    }

    public void setPersonelID(int PersonelID) {
        this.PersonelID = PersonelID;
    }

    public String getAdi() {
        return Adi;
    }

    public void setAdi(String Adi) {
        this.Adi = Adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }
    
   
   
}
