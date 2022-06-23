
package servis_otomasyonu;


public class veliClass {
    
    private int veli_id;
    private String BabaAdi;
    private String AnneAdi;
    private String AnneTel;
   private String BabaTel;    

    public veliClass(int veli_id, String BabaAdi, String AnneAdi, String AnneTel, String BabaTel) {
        this.veli_id = veli_id;
        this.BabaAdi = BabaAdi;
        this.AnneAdi = AnneAdi;
        this.AnneTel = AnneTel;
        this.BabaTel = BabaTel;
    }

    public int getVeli_id() {
        return veli_id;
    }

    public void setVeli_id(int veli_id) {
        this.veli_id = veli_id;
    }

    public String getBabaAdi() {
        return BabaAdi;
    }

    public void setBabaAdi(String BabaAdi) {
        this.BabaAdi = BabaAdi;
    }

    public String getAnneAdi() {
        return AnneAdi;
    }

    public void setAnneAdi(String AnneAdi) {
        this.AnneAdi = AnneAdi;
    }

    public String getAnneTel() {
        return AnneTel;
    }

    public void setAnneTel(String AnneTel) {
        this.AnneTel = AnneTel;
    }

    public String getBabaTel() {
        return BabaTel;
    }

    public void setBabaTel(String BabaTel) {
        this.BabaTel = BabaTel;
    }

  
}
