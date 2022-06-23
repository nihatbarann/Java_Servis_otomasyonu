
package servis_otomasyonu;

public class FaturaDetay {
    private int FaturaDetayID;
    private int FaturaID;
    private int ogrID;
    private String DetayAd;
    private String DetaySoyad;
    private String DetayOkul;

    public FaturaDetay(int FaturaDetayID, int FaturaID, int ogrID, String DetayAd, String DetaySoyad, String DetayOkul) {
        this.FaturaDetayID = FaturaDetayID;
        this.FaturaID = FaturaID;
        this.ogrID = ogrID;
        this.DetayAd = DetayAd;
        this.DetaySoyad = DetaySoyad;
        this.DetayOkul = DetayOkul;
    }

    public int getFaturaDetayID() {
        return FaturaDetayID;
    }

    public void setFaturaDetayID(int FaturaDetayID) {
        this.FaturaDetayID = FaturaDetayID;
    }

    public int getFaturaID() {
        return FaturaID;
    }

    public void setFaturaID(int FaturaID) {
        this.FaturaID = FaturaID;
    }

    public int getOgrID() {
        return ogrID;
    }

    public void setOgrID(int ogrID) {
        this.ogrID = ogrID;
    }

    public String getDetayAd() {
        return DetayAd;
    }

    public void setDetayAd(String DetayAd) {
        this.DetayAd = DetayAd;
    }

    public String getDetaySoyad() {
        return DetaySoyad;
    }

    public void setDetaySoyad(String DetaySoyad) {
        this.DetaySoyad = DetaySoyad;
    }

    public String getDetayOkul() {
        return DetayOkul;
    }

    public void setDetayOkul(String DetayOkul) {
        this.DetayOkul = DetayOkul;
    }
   
}
