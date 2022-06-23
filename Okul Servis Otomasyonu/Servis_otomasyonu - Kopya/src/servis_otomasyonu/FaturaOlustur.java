package servis_otomasyonu;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class FaturaOlustur extends javax.swing.JFrame {
         int fID=0;
         int f_detayid=0;
    private int persID=0;

    Servis_otomasyonu islemler = new Servis_otomasyonu();
   
    DefaultTableModel model = null;
    public FaturaOlustur() {

        initComponents();
        model = (DefaultTableModel) FaturaTable.getModel();

    }

    public void FaturaGoruntule() {
        model.setRowCount(0);
        ArrayList<FaturaDetay> Fatura = new ArrayList<>();
        Fatura = islemler.FaturaGetir();
        if (Fatura != null) {
            for (FaturaDetay fatura : Fatura) {
                Object[] eklenecek = {fatura.getFaturaDetayID(), fatura.getFaturaID(), fatura.getOgrID(), fatura.getDetayAd(), fatura.getDetaySoyad(), fatura.getDetayOkul()};
                model.addRow(eklenecek);
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtAdi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPlaka = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSoyadi = new javax.swing.JTextField();
        btnPersonel = new javax.swing.JButton();
        btnOgr = new javax.swing.JButton();
        btnKaydet = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        btnVazgec = new javax.swing.JButton();
        txtTarih = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnYeni = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtFaturaNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSeriNo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FaturaTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));

        jLabel1.setText("Şöfor Soyadı:");

        txtAdi.setEnabled(false);

        jLabel2.setText("Şoför Adı:");

        txtPlaka.setEnabled(false);

        jLabel3.setText("Şöfor Telefon:");

        txtTel.setEnabled(false);
        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });

        jLabel4.setText("Şöfor Arac Plaka:");

        txtSoyadi.setEnabled(false);

        btnPersonel.setText("Personel Listesi");
        btnPersonel.setEnabled(false);
        btnPersonel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonelActionPerformed(evt);
            }
        });

        btnOgr.setText("Öğrenci Listesi");
        btnOgr.setEnabled(false);
        btnOgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOgrActionPerformed(evt);
            }
        });

        btnKaydet.setText("Kaydet");
        btnKaydet.setEnabled(false);
        btnKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydetActionPerformed(evt);
            }
        });

        btnSil.setText("Sil");
        btnSil.setEnabled(false);
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        btnVazgec.setText("Vazgeç");
        btnVazgec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVazgecActionPerformed(evt);
            }
        });

        txtTarih.setEnabled(false);

        jLabel5.setText("Tarih:");

        btnYeni.setText("Yeni");
        btnYeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYeniActionPerformed(evt);
            }
        });

        jLabel6.setText("Fatura No:");

        jLabel7.setText("Seri No:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtSoyadi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAdi, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnYeni)
                        .addGap(18, 18, 18)
                        .addComponent(btnKaydet)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSil)
                        .addGap(31, 31, 31)
                        .addComponent(btnVazgec)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlaka, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel5)
                        .addGap(29, 29, 29)
                        .addComponent(txtTarih, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFaturaNo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(9, 9, 9)
                        .addComponent(txtSeriNo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(120, 120, 120)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOgr, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPersonel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnOgr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtTarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(btnPersonel))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txtSeriNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtFaturaNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPlaka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)))
                        .addGap(92, 92, 92)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKaydet)
                    .addComponent(btnSil)
                    .addComponent(btnVazgec)
                    .addComponent(btnYeni))
                .addContainerGap())
        );

        FaturaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fatura Detay ID", "Fatura ID", "Ogrenci ID", "Ogrenci Adi", "Ogrenci Soyadi", "Ogrenci Okul"
            }
        ));
        jScrollPane1.setViewportView(FaturaTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void ButonKontrol(boolean durum) {
        btnKaydet.setEnabled(durum);
        btnPersonel.setEnabled(durum);
        btnOgr.setEnabled(durum);
        btnSil.setEnabled(durum);

    }
    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed

    }//GEN-LAST:event_txtTelActionPerformed

    private void btnPersonelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonelActionPerformed

        PersonelListele yeni = new PersonelListele(this, true);
        yeni.gelenForm = "Fatura Satis";
        yeni.setVisible(true);

        persID = (int) yeni.model.getValueAt(yeni.satir, 0);
        txtAdi.setText(yeni.model.getValueAt(yeni.satir, 1).toString());
        txtSoyadi.setText(yeni.model.getValueAt(yeni.satir, 2).toString());
        txtTel.setText(yeni.model.getValueAt(yeni.satir, 3).toString());
        txtPlaka.setText(yeni.model.getValueAt(yeni.satir, 6).toString());

    }//GEN-LAST:event_btnPersonelActionPerformed
private void object(){


    Object[] a = {f_detayid,fID, ogrenciListele.OgrID, ogrenciListele.OgrAdi, ogrenciListele.OgrSoyadi, ogrenciListele.OgrOkul};
        model.addRow(a);
}
    private void btnOgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOgrActionPerformed
 ogrenciListele ogrList = new ogrenciListele(this, true);
        ogrList.gelenForm = "Fatura Satis";
        ogrList.setVisible(true);
      
      object();
    }//GEN-LAST:event_btnOgrActionPerformed

    private void btnYeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYeniActionPerformed
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        txtTarih.setText(dtf.format(now));
        ButonKontrol(true);
    }//GEN-LAST:event_btnYeniActionPerformed

    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed

        String PersonelAd = txtAdi.getText();
        String PersonelSoyad = txtSoyadi.getText();
        String PersonelTelefon = txtTel.getText();
        String PersonelPlaka = txtPlaka.getText();
        String PersonelTarih = txtTarih.getText();
        String FaturaNo = txtFaturaNo.getText();
        String SeriNo = txtSeriNo.getText();
      
        fID=islemler.FaturaEkle(persID, PersonelAd, PersonelSoyad, PersonelTelefon, PersonelPlaka, PersonelTarih, SeriNo, FaturaNo);

         for(int i=0; i<model.getRowCount(); i++){
              f_detayid =islemler.FaturaDetayEkle(fID, (int) model.getValueAt(i,2), model.getValueAt(i,3).toString(), model.getValueAt(i,4).toString(), model.getValueAt(i,5).toString());
         model.setValueAt(f_detayid, i, 0);
         model.setValueAt(fID, i, 1);
        
         
         }
    }//GEN-LAST:event_btnKaydetActionPerformed

    private void btnVazgecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVazgecActionPerformed
        model.setRowCount(0);
    }//GEN-LAST:event_btnVazgecActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        int secilen_satir=FaturaTable.getSelectedRow();
        if(secilen_satir!=-1){
        model.removeRow(secilen_satir);
        
        
        }
        
    }//GEN-LAST:event_btnSilActionPerformed

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FaturaOlustur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FaturaOlustur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FaturaOlustur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FaturaOlustur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FaturaOlustur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable FaturaTable;
    private javax.swing.JButton btnKaydet;
    private javax.swing.JButton btnOgr;
    private javax.swing.JButton btnPersonel;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnVazgec;
    private javax.swing.JButton btnYeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAdi;
    private javax.swing.JTextField txtFaturaNo;
    private javax.swing.JTextField txtPlaka;
    private javax.swing.JTextField txtSeriNo;
    private javax.swing.JTextField txtSoyadi;
    private javax.swing.JTextField txtTarih;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
