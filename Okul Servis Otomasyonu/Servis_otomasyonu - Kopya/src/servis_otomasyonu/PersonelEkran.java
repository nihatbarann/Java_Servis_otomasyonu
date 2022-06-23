package servis_otomasyonu;

import java.sql.Date;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class PersonelEkran extends javax.swing.JDialog {

    Servis_otomasyonu islemler = new Servis_otomasyonu();
    DefaultTableModel model;

    public PersonelEkran(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel) PersonelTable.getModel();
        PersonelGoruntule();
        durumKontrol(true);
    }

    public void PersonelGoruntule() {
        model.setRowCount(0);
        ArrayList<PersonelClass> personel = new ArrayList<>();
        personel = islemler.PersonelGetir();
        if (personel != null) {
            for (PersonelClass pers : personel) {
                Object[] eklenecek = {pers.getPrsnlID(),pers.getAd(),pers.getTel(), pers.getSoyad(), pers.getAdres(),pers.getMaas(),pers.getAracPlaka(),pers.getUnvan(),pers.getBaslamaTarih()};
                model.addRow(eklenecek);
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        PersonelTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPersMaas = new javax.swing.JTextField();
        txtPersAdı = new javax.swing.JTextField();
        txtPersSoyadi = new javax.swing.JTextField();
        txtPersTel = new javax.swing.JTextField();
        txtPersPlaka = new javax.swing.JTextField();
        txtPersUnvan = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPersAdres = new javax.swing.JTextArea();
        btnPersEkle = new javax.swing.JButton();
        btnPersSil = new javax.swing.JButton();
        btnPersDuzenle = new javax.swing.JButton();
        lblMesaj = new javax.swing.JLabel();
        btnTemizle = new javax.swing.JButton();
        lblArama = new javax.swing.JLabel();
        txtArama = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTarih = new javax.swing.JTextField();
        btnYeni = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PersonelTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Adı:", "Soyadı", "Telefon", "Adres", "Maas", "Plaka", "unvan", "İşe Başlama Tarihi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PersonelTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PersonelTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PersonelTable);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setText("Personel Adı:");

        jLabel2.setText("Personel Maaş:");

        jLabel3.setText("Personel Soyadı:");

        jLabel4.setText("Personel Telefon:");

        jLabel5.setText("Unvanı:");

        jLabel6.setText("Arac Plaka:");

        jLabel7.setText("Adres");

        txtPersMaas.setEnabled(false);

        txtPersAdı.setEnabled(false);

        txtPersSoyadi.setEnabled(false);

        txtPersTel.setEnabled(false);

        txtPersPlaka.setEnabled(false);

        txtPersUnvan.setEnabled(false);

        txtPersAdres.setColumns(20);
        txtPersAdres.setRows(5);
        txtPersAdres.setEnabled(false);
        jScrollPane2.setViewportView(txtPersAdres);

        btnPersEkle.setBackground(new java.awt.Color(153, 153, 153));
        btnPersEkle.setText("Personel Ekle");
        btnPersEkle.setEnabled(false);
        btnPersEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersEkleActionPerformed(evt);
            }
        });

        btnPersSil.setBackground(new java.awt.Color(153, 153, 153));
        btnPersSil.setText("Personel Sil");
        btnPersSil.setEnabled(false);
        btnPersSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersSilActionPerformed(evt);
            }
        });

        btnPersDuzenle.setBackground(new java.awt.Color(153, 153, 153));
        btnPersDuzenle.setText("Personel Düzenle");
        btnPersDuzenle.setEnabled(false);
        btnPersDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersDuzenleActionPerformed(evt);
            }
        });

        lblMesaj.setText("jLabel8");

        btnTemizle.setBackground(new java.awt.Color(153, 153, 153));
        btnTemizle.setText("Vazgeç");
        btnTemizle.setEnabled(false);
        btnTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemizleActionPerformed(evt);
            }
        });

        lblArama.setText("Arama:");

        txtArama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAramaKeyReleased(evt);
            }
        });

        jLabel8.setText("İşe Başlama Tarih:");

        txtTarih.setEnabled(false);

        btnYeni.setBackground(new java.awt.Color(204, 204, 204));
        btnYeni.setText("Yeni");
        btnYeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYeniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPersMaas, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPersAdı, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPersTel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPersSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 331, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel8)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPersPlaka, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTarih, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPersUnvan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)))
                        .addGap(218, 218, 218))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblArama)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtArama, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblMesaj)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnYeni)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnPersEkle)
                                    .addGap(12, 12, 12)
                                    .addComponent(btnPersSil)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnPersDuzenle))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTemizle)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPersAdı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPersSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPersTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtTarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPersPlaka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPersUnvan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPersMaas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnYeni)
                            .addComponent(btnPersEkle)
                            .addComponent(btnPersSil)
                            .addComponent(btnPersDuzenle)
                            .addComponent(btnTemizle)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtArama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblArama))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)))
                .addComponent(lblMesaj)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPersEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersEkleActionPerformed
       String ad=txtPersAdı.getText();
       String soyadi=txtPersSoyadi.getText();
       String Tel=txtPersTel.getText();
       String adres=txtPersAdres.getText();
       String maas=txtPersMaas.getText();
       String plaka=txtPersPlaka.getText();
       String unvan=txtPersUnvan.getText();
       String Tarih=txtTarih.getText();

       
       islemler.personelEkle(ad, soyadi, Tel, adres, unvan,maas, plaka,Tarih);
       PersonelGoruntule();
    }//GEN-LAST:event_btnPersEkleActionPerformed

    private void btnPersDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersDuzenleActionPerformed
        String ad=txtPersAdı.getText();
       String soyadi=txtPersSoyadi.getText();
       String Tel=txtPersTel.getText();
       String adres=txtPersAdres.getText();
       String maas=txtPersMaas.getText();
       String plaka=txtPersPlaka.getText();
       String unvan=txtPersUnvan.getText();
         String Tarih=txtTarih.getText();

       
       int secilen_satir=PersonelTable.getSelectedRow();
         if(secilen_satir==-1){
             if(model.getRowCount()==0){
             lblMesaj.setText("müşteri tablosu boş...");
             
             } 
              else{   lblMesaj.setText(" güncellemek için bir  müşteri seçiniz..");}
            }
         else{
             
             int id=(int)model.getValueAt(secilen_satir,0);
             islemler.personelGuncelle(id,ad,soyadi,Tel,adres,unvan,maas,plaka,Tarih);  
             PersonelGoruntule();
           lblMesaj.setText(" müşteri güncellendi");
         
         }
         lblMesaj.setText("hata");
    }//GEN-LAST:event_btnPersDuzenleActionPerformed
private void durumKontrol(boolean durum){
txtPersAdres.setEnabled(durum);
txtPersAdı.setEnabled(durum);
txtPersMaas.setEnabled(durum);
txtPersPlaka.setEnabled(durum);
txtPersSoyadi.setEnabled(durum);
txtPersTel.setEnabled(durum);
txtPersUnvan.setEnabled(durum);
txtTarih.setEnabled(durum);


PersonelTable.setEnabled(durum);
btnPersEkle.setEnabled(!durum);
btnTemizle.setEnabled(!durum);
btnPersDuzenle.setEnabled(durum);
btnPersSil.setEnabled(durum);
btnYeni.setEnabled(durum);






}
    private void PersonelTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PersonelTableMouseClicked
       int secilen_satir=PersonelTable.getSelectedRow();
       txtPersAdı.setText(model.getValueAt(secilen_satir, 1).toString());
       txtPersSoyadi.setText(model.getValueAt(secilen_satir, 2).toString());
       txtPersTel.setText(model.getValueAt(secilen_satir, 3).toString());
       txtPersAdres.setText(model.getValueAt(secilen_satir, 4).toString());
       txtPersMaas.setText(model.getValueAt(secilen_satir, 5).toString());
       txtPersPlaka.setText(model.getValueAt(secilen_satir, 6).toString());
       txtPersUnvan.setText(model.getValueAt(secilen_satir, 7).toString());
       txtTarih.setText(model.getValueAt(secilen_satir, 8).toString());
       btnPersDuzenle.setEnabled(true);
       btnPersSil.setEnabled(true);
       
    }//GEN-LAST:event_PersonelTableMouseClicked
public void temizle(){
 txtPersAdres.setText("");
        txtPersAdı.setText("");
        txtPersMaas.setText("");
        txtPersPlaka.setText("");
        txtPersSoyadi.setText("");
        txtPersUnvan.setText("");
        txtPersTel.setText("");
        txtTarih.setText("");}
    private void btnTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemizleActionPerformed
        durumKontrol(true);
        temizle();

    }//GEN-LAST:event_btnTemizleActionPerformed

    private void btnPersSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersSilActionPerformed
          int secilen_satir=PersonelTable.getSelectedRow();
         if(secilen_satir==-1){
             if(model.getRowCount()==0){
               lblMesaj.setText("müşteri tablosu boş...");
             
             } 
             else{   lblMesaj.setText(" güncellemek için bir  müşteri seçiniz..");}
            }
         else{   
             int id=(int)model.getValueAt(secilen_satir,0);
             islemler.personelSil(id);  
             PersonelGoruntule();
             lblMesaj.setText(" müşteri güncellendi");
    }//GEN-LAST:event_btnPersSilActionPerformed
    }
    public void Arama(String arama) {
        TableRowSorter<DefaultTableModel> ara = new TableRowSorter<>(model);
        PersonelTable.setRowSorter(ara);
        ara.setRowFilter(RowFilter.regexFilter(arama));
    }
    private void txtAramaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAramaKeyReleased
        String arama = txtArama.getText();
        Arama(arama);
    }//GEN-LAST:event_txtAramaKeyReleased

    private void btnYeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYeniActionPerformed
     durumKontrol(false);
    }//GEN-LAST:event_btnYeniActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(PersonelEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonelEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonelEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonelEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PersonelEkran dialog = new PersonelEkran(new javax.swing.JFrame(), true);
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
    private javax.swing.JTable PersonelTable;
    private javax.swing.JButton btnPersDuzenle;
    private javax.swing.JButton btnPersEkle;
    private javax.swing.JButton btnPersSil;
    private javax.swing.JButton btnTemizle;
    private javax.swing.JButton btnYeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lblArama;
    private javax.swing.JLabel lblMesaj;
    private javax.swing.JTextField txtArama;
    private javax.swing.JTextArea txtPersAdres;
    private javax.swing.JTextField txtPersAdı;
    private javax.swing.JTextField txtPersMaas;
    private javax.swing.JTextField txtPersPlaka;
    private javax.swing.JTextField txtPersSoyadi;
    private javax.swing.JTextField txtPersTel;
    private javax.swing.JTextField txtPersUnvan;
    private javax.swing.JTextField txtTarih;
    // End of variables declaration//GEN-END:variables
}
