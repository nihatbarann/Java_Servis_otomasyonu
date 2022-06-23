package servis_otomasyonu;

import com.mysql.jdbc.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Servis_otomasyonu {

    private PreparedStatement preparedStatment = null;
    private Statement statement = null;
    Connection con = null;

    public boolean girisKontrol(String kAdi, String sifre) {
        String Sorgu = "Select * from admin where kullaniciAdi= ? and parola=? ";
        try {

            preparedStatment = con.prepareStatement(Sorgu);
            preparedStatment.setString(1, kAdi);
            preparedStatment.setString(2, sifre);
            ResultSet rst = preparedStatment.executeQuery();
            return rst.next();

        } catch (SQLException ex) {
            Logger.getLogger(Servis_otomasyonu.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
  

    public Servis_otomasyonu() {
        String url = "jdbc:Mysql://" + DataBase.host + "/" + DataBase.db_isim;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver Bulunamadı...");

        }
        try {
            con = (Connection) DriverManager.getConnection(url, DataBase.kullaniciAdi, DataBase.parola);
            System.out.println("Bağlantı Başarılı");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Bağlantı sağlanamadı");
        }

    }

    public ArrayList<PersonelClass> PersonelGetir() {
        ArrayList<PersonelClass> sonuc = new ArrayList<>();
        try {
            statement = con.createStatement();
            String Sorgu = "select * from personeltanim";
            ResultSet rs = statement.executeQuery(Sorgu);
            while (rs.next()) {
                int PrsnlID = rs.getInt("personel_id");
                String Ad = rs.getString("personel_adi");
                String Soyad = rs.getString("persone_soyadi");
                String Adres = rs.getString("personel_adres");
                String Tel = rs.getString("personel_tel");
                String Maas = rs.getString("personel_maas");
                String unvan = rs.getString("personel_unvan");
                String AracPlaka = rs.getString("Arac_plaka");
                String BaslamaTarih=rs.getString("KayitTarihi");

                sonuc.add(new PersonelClass(PrsnlID, Ad, Tel, Soyad, Adres, unvan, Maas, AracPlaka,BaslamaTarih));
            }
            return sonuc;
        } catch (SQLException ex) {
            Logger.getLogger(Servis_otomasyonu.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
   

    public ArrayList<veliClass> VeliGetir() {
        ArrayList<veliClass> sonuc = new ArrayList<>();
        try {
            statement = con.createStatement();
            String Sorgu = "select * from velitanim";
            ResultSet rs = statement.executeQuery(Sorgu);
            while (rs.next()) {
                int veliID = rs.getInt("Veli_id");
                String BabaAdi = rs.getString("Baba_adi");
                String AnneAdi = rs.getString("Anne_adi");
                String BabaTel = rs.getString("Baba_tel");
                String AnneTel = rs.getString("Anne_tel");

                sonuc.add(new veliClass(veliID, BabaAdi, AnneAdi, BabaTel, AnneTel));
            }
            return sonuc;
        } catch (SQLException ex) {
            Logger.getLogger(Servis_otomasyonu.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    } 
    public ArrayList<FaturaDetay> FaturaGetir() {
        ArrayList<FaturaDetay> sonuc = new ArrayList<>();
        try {
            statement = con.createStatement();
            String Sorgu = "select * from fatura_detay";
            ResultSet rs = statement.executeQuery(Sorgu);
            while (rs.next()) {
                int FaturaDetayID = rs.getInt("Fatura_Detay_ID");
                int FaturaID = rs.getInt("Fatura_id");
                int ogrID = rs.getInt("ogrenci_id");
                String DetayAd = rs.getString("DetayAd");
                String DetaySoyad = rs.getString("DetaySoyad");
                String DetayOkul=rs.getString("DetayOkul");
                sonuc.add(new FaturaDetay(FaturaDetayID, FaturaID, ogrID, DetayAd, DetaySoyad,DetayOkul));
            }
            return sonuc;
        } catch (SQLException ex) {
            Logger.getLogger(Servis_otomasyonu.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ArrayList<ogrenciClass> ogrenciGetir() {
        ArrayList<ogrenciClass> sonuc = new ArrayList<>();
        try {
            statement = con.createStatement();
            String Sorgu = "select * from ogrencitanim";
            ResultSet rs = statement.executeQuery(Sorgu);
            while (rs.next()) {
                int ogrID = rs.getInt("ogrenci_id");
                String Adi = rs.getString("ogrenci_adi");
                String Soyadi = rs.getString("ogrenci_soyadi");
                String Okul = rs.getString("ogrOkul");
                String Telefon = rs.getString("ogrenci_tel");
                String Adres = rs.getString("ogrenci_adres");
                Date Tarih = rs.getDate("ogrenci_KayitTarih");

                sonuc.add(new ogrenciClass(ogrID, Adi, Soyadi,Telefon, Adres, Tarih,Okul));
            }
            return sonuc;
        } catch (SQLException ex) {
            Logger.getLogger(Servis_otomasyonu.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ArrayList<okulClass> okulGetir() {
        ArrayList<okulClass> sonuc = new ArrayList<>();
        try {
            statement = con.createStatement();
            String Sorgu = "select * from okultanim";
            ResultSet rs = statement.executeQuery(Sorgu);
            while (rs.next()) {
                int okulID = rs.getInt("okul_id");
                String okulAdi = rs.getString("okul_adi");
                String okulAdres = rs.getString("okul_adres");
                Time DersSaati = rs.getTime("okul_BaslamaSaati");
                Time BitisSaati = rs.getTime("DersBitisSaati");

                sonuc.add(new okulClass(okulID, okulAdi, okulAdres, new Time(DersSaati.getTime()), new Time(BitisSaati.getTime())));
            }
            return sonuc;
        } catch (SQLException ex) {
            Logger.getLogger(Servis_otomasyonu.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void ogrenciGuncelle(int id, String yeniAd, String yeniSoyad,String Okul, String yeniTel, String yeniAdres, Date Tarih) {
        String Sorgu = "Update ogrencitanim SET  ogrenci_adi=?, ogrenci_soyadi=?,ogrOkul=?,ogrenci_tel=?, ogrenci_adres=? ,ogrenci_KayitTarih=? where ogrenci_id=? ";
        try {
            preparedStatment = con.prepareStatement(Sorgu);
            preparedStatment.setString(1, yeniAd);
            preparedStatment.setString(2, yeniSoyad);
                preparedStatment.setString(3, Okul);
            preparedStatment.setString(4, yeniTel);
            preparedStatment.setString(5, yeniAdres);
            preparedStatment.setDate(6, Tarih);
            preparedStatment.setInt(7, id);
            preparedStatment.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Servis_otomasyonu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void ogrenciEkle(String adi, String soyadi,String Okul ,String tel, String Adres, Date Tarih) {
        String Sorgu = "INSERT INTO ogrencitanim (ogrenci_adi,ogrenci_soyadi,ogrOkul,ogrenci_tel,ogrenci_adres,ogrenci_KayitTarih) values(?,?,?,?,?,?)";
        try {
            preparedStatment = con.prepareStatement(Sorgu);
            preparedStatment.setString(1, adi);
            preparedStatment.setString(2, soyadi);
             preparedStatment.setString(3, Okul);
            preparedStatment.setString(4, tel);
            preparedStatment.setString(5, Adres);
            preparedStatment.setDate(6, Tarih);
            preparedStatment.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Servis_otomasyonu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public int FaturaDetayEkle(int FaturaID, int ogrID,String Detayad ,String Detaysoyad, String Detayokul) {
        String Sorgu = "INSERT INTO fatura_detay (Fatura_id,ogrenci_id,DetayAd,DetaySoyad,DetayOkul) values(?,?,?,?,?)";
        int faturadetayID=0;
        try {
            preparedStatment = con.prepareStatement(Sorgu);
            preparedStatment.setInt(1, FaturaID);
            preparedStatment.setInt(2, ogrID);
             preparedStatment.setString(3, Detayad);
            preparedStatment.setString(4, Detaysoyad);
            preparedStatment.setString(5, Detayokul);
            preparedStatment.executeUpdate();
            String sorgu="Select * from fatura_detay";
            statement=con.createStatement();
            ResultSet rs=statement.executeQuery(sorgu);
            while(rs.next())
            {
            faturadetayID=rs.getInt("Fatura_Detay_ID");
            
            }
          return  faturadetayID;
        } catch (SQLException ex) {
            Logger.getLogger(Servis_otomasyonu.class.getName()).log(Level.SEVERE, null, ex);
        }
       return faturadetayID;
    }
      public int FaturaEkle(int PersonelID, String PersAd,String PersSoyad ,String PersTel, String PersPlaka,String Tarih,String faturaNo,String faturaSeri) {
        String Sorgu = "INSERT INTO fatura (personel_id,Adi,Soyadi,telefon,plaka,tarih,seri,FaturaNo) values(?,?,?,?,?,?,?,?)";
  int faturaID=0;
        try {
           
            preparedStatment = con.prepareStatement(Sorgu);
            preparedStatment.setInt(1, PersonelID);
            preparedStatment.setString(2, PersAd);
            preparedStatment.setString(3, PersSoyad);
            preparedStatment.setString(4, PersTel);
            preparedStatment.setString(5, PersPlaka);
            preparedStatment.setString(6, Tarih);
              preparedStatment.setString(7, faturaSeri);
                preparedStatment.setString(8, faturaNo);
            preparedStatment.executeUpdate();
            String s="select * from fatura";
            statement=con.createStatement();
            ResultSet rs=statement.executeQuery(s);
            while(rs.next()){
                    faturaID=rs.getInt("Fatura_id");
         }
return faturaID;
        } catch (SQLException ex) {
            Logger.getLogger(Servis_otomasyonu.class.getName()).log(Level.SEVERE, null, ex);
          
        }
return faturaID;
    }

    public void veliGuncelle(int id, String babaAdi, String babaTel, String AnneAdi, String AnneTel) {
        String sorgu = "UPDATE  velitanim SET Baba_adi=?,Anne_adi=?,Baba_tel=?,Anne_tel=? where veli_id=?";
        try {
            preparedStatment = con.prepareStatement(sorgu);
            preparedStatment.setString(1, babaAdi);
            preparedStatment.setString(2, AnneAdi);
            preparedStatment.setString(3, babaTel);
            preparedStatment.setString(4, AnneTel);
            preparedStatment.setInt(5, id);
            preparedStatment.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Servis_otomasyonu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void veliEkle(String BabaAdi, String BabaTel, String AnneAdi, String AnneTel) {
        String sorgu = "INSERT INTO velitanim (Baba_adi,Anne_adi,Baba_tel,Anne_tel) values (?,?,?,?)";
        try {
            preparedStatment = con.prepareStatement(sorgu);
            preparedStatment.setString(1, BabaAdi);
            preparedStatment.setString(2, AnneAdi);
            preparedStatment.setString(3, BabaTel);
            preparedStatment.setString(4, AnneTel);
            preparedStatment.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Servis_otomasyonu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void personelEkle(String adi, String Soyadi, String Tel, String Adres, String Unvan, String maas, String AracPlaka,String BaslamaTarih) {
        String sorgu = "INSERT INTO personeltanim(personel_adi,persone_soyadi,personel_tel,personel_adres,personel_unvan,personel_maas,Arac_plaka,KayitTarihi) values (?,?,?,?,?,?,?,?)";
        try {
            preparedStatment = con.prepareStatement(sorgu);
            preparedStatment.setString(1, adi);
            preparedStatment.setString(2, Soyadi);
            preparedStatment.setString(3, Tel);
            preparedStatment.setString(4, Adres);
            preparedStatment.setString(5, Unvan);
            preparedStatment.setString(6, maas);
            preparedStatment.setString(7, AracPlaka);
            preparedStatment.setString(8, BaslamaTarih);

            
            preparedStatment.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Servis_otomasyonu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void personelGuncelle(int id, String adi, String Soyadi, String Tel, String Adres, String Unvan, String maas, String AracPlaka,String BaslamaTarihi) {
        String sorgu = "UPDATE  personeltanim SET personel_adi=?, persone_soyadi=?, personel_tel=?, personel_adres=?, personel_unvan=?, personel_maas=?, Arac_plaka=? ,KayitTarihi=? where personel_id=?";
        try {
            preparedStatment = con.prepareStatement(sorgu);
            preparedStatment.setString(1, adi);
            preparedStatment.setString(2, Soyadi);
            preparedStatment.setString(3, Tel);
            preparedStatment.setString(4, Adres);
            preparedStatment.setString(5, Unvan);
            preparedStatment.setString(6, maas);
            preparedStatment.setString(7, AracPlaka);
            preparedStatment.setString(8, BaslamaTarihi);
            preparedStatment.setInt(9, id);

            preparedStatment.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Servis_otomasyonu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void okulEkle(String OkulAdi, Time BaslamaSaati, String Adres, Time BitisSaati) {
        String sorgu = "INSERT INTO okultanim (okul_adi,okul_BaslamaSaati,okul_adres,DersBitisSaati) values(?,?,?,?)";
        try {
            preparedStatment = con.prepareStatement(sorgu);
            preparedStatment.setString(1, OkulAdi);
            preparedStatment.setTime(2, BaslamaSaati);
            preparedStatment.setString(3, Adres);
            preparedStatment.setTime(4, BitisSaati);
            preparedStatment.executeUpdate();
 
        } catch (SQLException ex) {
            Logger.getLogger(Servis_otomasyonu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void okulSil(int id) {
        String sorgu = "Delete From okultanim where okul_id=?";
        try {
            preparedStatment = con.prepareStatement(sorgu);
            preparedStatment.setInt(1, id);
            preparedStatment.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Servis_otomasyonu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void personelSil(int id) {
        String sorgu = "Delete From personeltanim where personel_id=?";
        try {
            preparedStatment = con.prepareStatement(sorgu);
            preparedStatment.setInt(1, id);
            preparedStatment.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Servis_otomasyonu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void veliSil(int id) {
        String sorgu = "Delete From velitanim where veli_id=?";
        try {
            preparedStatment = con.prepareStatement(sorgu);
            preparedStatment.setInt(1, id);
            preparedStatment.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Servis_otomasyonu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ogrenciSil(int id) {
        String sorgu = "Delete From ogrencitanim where ogrenci_id=?";
        try {
            preparedStatment = con.prepareStatement(sorgu);
            preparedStatment.setInt(1, id);
            preparedStatment.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Servis_otomasyonu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void okulGuncelle(int id, String Adi, Time BaslamaSaati, Time BitisSaati, String Adres) {
        String sorgu = "Update okultanim set okul_adi=?,okul_BaslamaSaati=?,okul_adres=?,DersBitisSaati=? where okul_id=?";
        try {
            preparedStatment = con.prepareStatement(sorgu);
            preparedStatment.setString(1, Adi);
            preparedStatment.setTime(2, BaslamaSaati);
            preparedStatment.setString(3, Adres);
            preparedStatment.setTime(4, BitisSaati);
            preparedStatment.setInt(5, id);

            preparedStatment.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Servis_otomasyonu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
        Servis_otomasyonu baglanti = new Servis_otomasyonu();

    }

}
