package servis_otomasyonu;

import java.sql.Date;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class OgrenciEkran extends javax.swing.JDialog {

    Servis_otomasyonu islemler = new Servis_otomasyonu();
    DefaultTableModel model;

    public OgrenciEkran(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel) ogrTable.getModel();
        ogrenciGoruntule();
        durumKontrol(true);
    }

    public void ogrenciGoruntule() {
        model.setRowCount(0);
        ArrayList<ogrenciClass> ogrenci = new ArrayList<>();
        ogrenci = islemler.ogrenciGetir();
        if (ogrenci != null) {
            for (ogrenciClass ogr : ogrenci) {
                Object[] eklenecek = {ogr.getOgrID(), ogr.getOgrAdi(), ogr.getOgrSoyadi(),ogr.getOkul(), ogr.getTel(), ogr.getAdres(), ogr.getTarih()};
                model.addRow(eklenecek);
            }
        }

    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMesaj = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtOgrAdi = new javax.swing.JTextField();
        txtOgrSoyadi = new javax.swing.JTextField();
        txtOgrTel = new javax.swing.JTextField();
        txtOgrTarih = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtOgrAdres = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txtArama = new javax.swing.JTextField();
        lblArama = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtOkul = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ogrTable = new javax.swing.JTable();
        btnOgrDuzenle = new javax.swing.JButton();
        btnOgrSil = new javax.swing.JButton();
        btnOgrEkle = new javax.swing.JButton();
        jLblMesaj = new javax.swing.JLabel();
        btnTemizle = new javax.swing.JButton();
        jlblMesaj = new javax.swing.JLabel();
        btnYeni = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblMesaj.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setText("Öğrenci Adı:");

        jLabel3.setText("Öğrenci Soyadı:");

        jLabel4.setText("Öğrenci Tel:");

        jLabel6.setText("Kayıt Tarihi:");

        jLabel7.setText("Adres");

        txtOgrAdi.setEnabled(false);

        txtOgrSoyadi.setEnabled(false);

        txtOgrTel.setEnabled(false);

        txtOgrTarih.setEnabled(false);

        txtOgrAdres.setColumns(20);
        txtOgrAdres.setRows(5);
        txtOgrAdres.setEnabled(false);
        jScrollPane2.setViewportView(txtOgrAdres);

        txtArama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAramaKeyReleased(evt);
            }
        });

        lblArama.setText("Arama:");

        jLabel5.setText("Okul:");

        txtOkul.setEnabled(false);

        javax.swing.GroupLayout lblMesajLayout = new javax.swing.GroupLayout(lblMesaj);
        lblMesaj.setLayout(lblMesajLayout);
        lblMesajLayout.setHorizontalGroup(
            lblMesajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblMesajLayout.createSequentialGroup()
                .addGroup(lblMesajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblMesajLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(lblMesajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addGroup(lblMesajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4))
                            .addComponent(jLabel5))
                        .addGap(53, 96, Short.MAX_VALUE)
                        .addGroup(lblMesajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lblMesajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(lblMesajLayout.createSequentialGroup()
                                    .addComponent(txtOgrAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(321, 321, 321)
                                    .addComponent(jLabel6))
                                .addComponent(txtOgrSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblMesajLayout.createSequentialGroup()
                                    .addComponent(txtOgrTel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7)))
                            .addComponent(txtOkul, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(lblMesajLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblArama)
                        .addGap(33, 33, 33)
                        .addComponent(txtArama, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(lblMesajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOgrTarih, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(129, 129, 129))
        );
        lblMesajLayout.setVerticalGroup(
            lblMesajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblMesajLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblMesajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtOgrAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOgrTarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(lblMesajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblMesajLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(lblMesajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(lblMesajLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(lblMesajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOgrSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(lblMesajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtOgrTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(lblMesajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtOkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(lblMesajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtArama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblArama))
                        .addGap(28, 28, 28))))
        );

        ogrTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Ogrenci ID", "Adı", "Soyadı", "Okul", "Telefon", "Adres", "Kayıt Tarihi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ogrTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ogrTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ogrTable);

        btnOgrDuzenle.setBackground(new java.awt.Color(153, 153, 153));
        btnOgrDuzenle.setText("Öğrenci Düzenle");
        btnOgrDuzenle.setEnabled(false);
        btnOgrDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOgrDuzenleActionPerformed(evt);
            }
        });

        btnOgrSil.setBackground(new java.awt.Color(153, 153, 153));
        btnOgrSil.setText("Öğrenci Sil");
        btnOgrSil.setEnabled(false);
        btnOgrSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOgrSilActionPerformed(evt);
            }
        });

        btnOgrEkle.setBackground(new java.awt.Color(153, 153, 153));
        btnOgrEkle.setText("Öğrenci Ekle");
        btnOgrEkle.setEnabled(false);
        btnOgrEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOgrEkleActionPerformed(evt);
            }
        });

        btnTemizle.setBackground(new java.awt.Color(153, 153, 153));
        btnTemizle.setText("Vazgeç");
        btnTemizle.setEnabled(false);
        btnTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemizleActionPerformed(evt);
            }
        });

        btnYeni.setText("Yeni");
        btnYeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYeniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLblMesaj)
                .addGap(769, 769, 769))
            .addComponent(lblMesaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnYeni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOgrEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOgrSil, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOgrDuzenle)
                        .addGap(18, 18, 18)
                        .addComponent(btnTemizle, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jlblMesaj)))
                .addContainerGap(480, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblMesaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOgrEkle)
                    .addComponent(btnOgrSil)
                    .addComponent(btnOgrDuzenle)
                    .addComponent(btnTemizle)
                    .addComponent(btnYeni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLblMesaj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblMesaj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOgrEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOgrEkleActionPerformed
        String ad = txtOgrAdi.getText();
        String Soyadi = txtOgrSoyadi.getText();
        String Okul = txtOkul.getText();
        String Tel = txtOgrTel.getText();
        String Adres = txtOgrAdres.getText();
        Date Tarih = Date.valueOf(txtOgrTarih.getText());
        islemler.ogrenciEkle(ad, Soyadi,Okul, Tel, Adres, Tarih);
        ogrenciGoruntule();


    }//GEN-LAST:event_btnOgrEkleActionPerformed

    private void btnOgrDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOgrDuzenleActionPerformed
        String ad = txtOgrAdi.getText();
        String Soyadi = txtOgrSoyadi.getText();
          String Okul = txtOkul.getText();
        String Tel = txtOgrTel.getText();
        String Adres = txtOgrAdres.getText();
        Date Tarih = Date.valueOf(txtOgrTarih.getText());
        int secilen_satir = ogrTable.getSelectedRow();
        if (secilen_satir == -1) {
            if (model.getRowCount() == 0) {
                jLblMesaj.setText("müşteri tablosu boş...");

            } else {
                jLblMesaj.setText(" güncellemek için bir  müşteri seçiniz..");
            }
        } else {
            int id = (int) model.getValueAt(secilen_satir, 0);
            islemler.ogrenciGuncelle(id, ad, Soyadi, Okul,Tel, Adres, Tarih);
            ogrenciGoruntule();
            jLblMesaj.setText(" müşteri güncellendi");

        }
    }//GEN-LAST:event_btnOgrDuzenleActionPerformed

    private void ogrTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ogrTableMouseClicked
        int secilen_satir = ogrTable.getSelectedRow();
        txtOgrAdi.setText(model.getValueAt(secilen_satir, 1).toString());
        txtOgrSoyadi.setText(model.getValueAt(secilen_satir, 2).toString());
        txtOkul.setText(model.getValueAt(secilen_satir, 3).toString());
        txtOgrTel.setText(model.getValueAt(secilen_satir, 4).toString());
        txtOgrAdres.setText(model.getValueAt(secilen_satir, 5).toString());
        txtOgrTarih.setText(model.getValueAt(secilen_satir, 6).toString());
        btnOgrDuzenle.setEnabled(true);
                btnOgrSil.setEnabled(true);

      

    }//GEN-LAST:event_ogrTableMouseClicked

    private void btnTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemizleActionPerformed
        durumKontrol(true);
        temizle();
    }//GEN-LAST:event_btnTemizleActionPerformed

    private void btnOgrSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOgrSilActionPerformed
        int secilen_satir = ogrTable.getSelectedRow();
        if (secilen_satir == -1) {
            if (model.getRowCount() == 0) {

            } else {
            }
        } else {
            int id = (int) model.getValueAt(secilen_satir, 0);
            islemler.ogrenciSil(id);
            ogrenciGoruntule();
            //  lblMesaj.setText(" müşteri güncellendi");
        }
    }//GEN-LAST:event_btnOgrSilActionPerformed
    public void Arama(String arama) {
        TableRowSorter<DefaultTableModel> ara = new TableRowSorter<>(model);
        ogrTable.setRowSorter(ara);
       ara.setRowFilter(RowFilter.regexFilter(arama));
    }
    private void txtAramaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAramaKeyReleased
        String arama = txtArama.getText();
        Arama(arama);
    }//GEN-LAST:event_txtAramaKeyReleased
public void durumKontrol(boolean durum){
txtOgrAdi.setEnabled(!durum);
txtOgrAdres.setEnabled(!durum);
txtOgrSoyadi.setEnabled(!durum);
txtOgrTarih.setEnabled(!durum);
txtOgrTel.setEnabled(!durum);
  txtOkul.setEditable(!durum);

btnOgrEkle.setEnabled(!durum);
btnTemizle.setEnabled(!durum);
btnYeni.setEnabled(durum);
btnOgrDuzenle.setEnabled(durum);
btnOgrSil.setEnabled(durum);
ogrTable.setEnabled(durum);


}

public void temizle(){
  txtOgrAdi.setText("");
        txtOgrSoyadi.setText("");
        txtOgrTarih.setText("");
        txtOgrTel.setText("");
        txtOgrAdres.setText("");
        txtOkul.setText("");

}


    private void btnYeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYeniActionPerformed
       durumKontrol(false);
    }//GEN-LAST:event_btnYeniActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(OgrenciEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OgrenciEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OgrenciEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OgrenciEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                OgrenciEkran dialog = new OgrenciEkran(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOgrDuzenle;
    private javax.swing.JButton btnOgrEkle;
    private javax.swing.JButton btnOgrSil;
    private javax.swing.JButton btnTemizle;
    private javax.swing.JButton btnYeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLblMesaj;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlblMesaj;
    private javax.swing.JLabel lblArama;
    private javax.swing.JPanel lblMesaj;
    private javax.swing.JTable ogrTable;
    private javax.swing.JTextField txtArama;
    private javax.swing.JTextField txtOgrAdi;
    private javax.swing.JTextArea txtOgrAdres;
    private javax.swing.JTextField txtOgrSoyadi;
    private javax.swing.JTextField txtOgrTarih;
    private javax.swing.JTextField txtOgrTel;
    private javax.swing.JTextField txtOkul;
    // End of variables declaration//GEN-END:variables
}
