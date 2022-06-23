
package servis_otomasyonu;

import java.sql.Date;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author HONOR
 */
public class VeliEkran extends javax.swing.JDialog {

   Servis_otomasyonu islemler = new Servis_otomasyonu();
    DefaultTableModel model;
    public VeliEkran(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel) veliTable.getModel();
        veliGoruntule();
        durumKontrol(true);
    }
 public void veliGoruntule() {
        model.setRowCount(0);
        ArrayList<veliClass> veli = new ArrayList<>();
        veli = islemler.VeliGetir();
        if (veli != null) {
            for (veliClass Veli : veli) {
                Object[] eklenecek = {Veli.getVeli_id(),Veli.getBabaAdi(),Veli.getAnneAdi(),Veli.getBabaTel(),Veli.getAnneTel()};
                model.addRow(eklenecek);
            }
        }

    }
 public void durumKontrol(boolean durum){
txtAnneAdi.setEnabled(durum);
txtAnneTel.setEnabled(durum);
txtBabaAdi.setEnabled(durum);
txtBabaTel.setEnabled(durum);
btnVeliEkle.setEnabled(!durum);
btnTemizle.setEnabled(!durum);
btnVeliSil.setEnabled(durum);
btnVeriDüzenle.setEnabled(durum);
btnYeni.setEnabled(durum);





}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBabaAdi = new javax.swing.JTextField();
        txtAnneAdi = new javax.swing.JTextField();
        txtBabaTel = new javax.swing.JTextField();
        txtAnneTel = new javax.swing.JTextField();
        btnVeliEkle = new javax.swing.JButton();
        btnVeliSil = new javax.swing.JButton();
        btnVeriDüzenle = new javax.swing.JButton();
        btnTemizle = new javax.swing.JButton();
        lblArama = new javax.swing.JLabel();
        txtArama = new javax.swing.JTextField();
        btnYeni = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        veliTable = new javax.swing.JTable();
        lblMesaj = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setText("Baba Adı:");

        jLabel3.setText("Anne Adı:");

        jLabel4.setText("Baba Tel:");

        jLabel6.setText("Anne Tel");

        txtBabaAdi.setEnabled(false);

        txtAnneAdi.setEnabled(false);

        txtBabaTel.setEnabled(false);

        txtAnneTel.setEnabled(false);

        btnVeliEkle.setBackground(new java.awt.Color(153, 153, 153));
        btnVeliEkle.setText("Veli Ekle");
        btnVeliEkle.setEnabled(false);
        btnVeliEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeliEkleActionPerformed(evt);
            }
        });

        btnVeliSil.setBackground(new java.awt.Color(153, 153, 153));
        btnVeliSil.setText("Veli Sil");
        btnVeliSil.setEnabled(false);
        btnVeliSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeliSilActionPerformed(evt);
            }
        });

        btnVeriDüzenle.setBackground(new java.awt.Color(153, 153, 153));
        btnVeriDüzenle.setText("Veli Düzenle");
        btnVeriDüzenle.setEnabled(false);
        btnVeriDüzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeriDüzenleActionPerformed(evt);
            }
        });

        btnTemizle.setBackground(new java.awt.Color(153, 153, 153));
        btnTemizle.setText("Temizle");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(5, 5, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBabaAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBabaTel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(379, 379, 379)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(lblArama)
                                .addGap(33, 33, 33)
                                .addComponent(txtArama, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btnYeni)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnVeliEkle)
                                .addGap(26, 26, 26)
                                .addComponent(btnVeliSil)
                                .addGap(31, 31, 31)
                                .addComponent(btnVeriDüzenle)
                                .addGap(27, 27, 27)
                                .addComponent(btnTemizle)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAnneTel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnneAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(203, 203, 203))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBabaAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(txtAnneAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnneTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(txtBabaTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtArama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblArama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVeliEkle)
                    .addComponent(btnVeliSil)
                    .addComponent(btnVeriDüzenle)
                    .addComponent(btnTemizle)
                    .addComponent(btnYeni))
                .addGap(45, 45, 45))
        );

        veliTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Veli ID", "Baba Adı", "Anne Adı", "Baba Telefon", "Anne Telefon"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        veliTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                veliTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(veliTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblMesaj)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lblMesaj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVeliEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeliEkleActionPerformed
      String BabaAdi=txtBabaAdi.getText();
String BabaTel=txtBabaTel.getText();
String AnneAdi=txtAnneAdi.getText();
String AnneTel=txtAnneTel.getText();

islemler.veliEkle(BabaAdi, AnneAdi, BabaTel, AnneTel);
veliGoruntule();
    }//GEN-LAST:event_btnVeliEkleActionPerformed

    private void btnVeriDüzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeriDüzenleActionPerformed
String BabaAdi=txtBabaAdi.getText();
String BabaTel=txtBabaTel.getText();
String AnneAdi=txtAnneAdi.getText();
String AnneTel=txtAnneTel.getText();
int secilen_satir=veliTable.getSelectedRow();
         if(secilen_satir==-1){
             if(model.getRowCount()==0){
             }
            }
         else{   
             int id=(int)model.getValueAt(secilen_satir,0);
             islemler.veliGuncelle(id,BabaAdi,AnneAdi,BabaTel,AnneTel);  
             veliGoruntule();
             
         
         }
    }//GEN-LAST:event_btnVeriDüzenleActionPerformed

    private void veliTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_veliTableMouseClicked
         int secilen_satir=veliTable.getSelectedRow();
       txtBabaAdi.setText(model.getValueAt(secilen_satir, 1).toString());
       txtAnneAdi.setText(model.getValueAt(secilen_satir, 2).toString());
       txtBabaTel.setText(model.getValueAt(secilen_satir, 3).toString());
       txtAnneTel.setText(model.getValueAt(secilen_satir, 4).toString());
       btnVeriDüzenle.setEnabled(true);
       btnVeliSil.setEnabled(true);
       

       
    }//GEN-LAST:event_veliTableMouseClicked
public void temizle(){

   txtAnneAdi.setText("");
        txtBabaAdi.setText("");
        txtBabaTel.setText("");
        txtAnneTel.setText("");}
    private void btnTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemizleActionPerformed
        durumKontrol(true);
        temizle();
    }//GEN-LAST:event_btnTemizleActionPerformed

    private void btnVeliSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeliSilActionPerformed
        int secilen_satir=veliTable.getSelectedRow();
         if(secilen_satir==-1){
             if(model.getRowCount()==0){
               lblMesaj.setText("müşteri tablosu boş...");
             
             } 
             else{   lblMesaj.setText(" güncellemek için bir  müşteri seçiniz..");}
            }
         else{   
             int id=(int)model.getValueAt(secilen_satir,0);
             islemler.veliSil(id);  
             veliGoruntule();
             lblMesaj.setText(" müşteri güncellendi");
    }//GEN-LAST:event_btnVeliSilActionPerformed
    }
    public void Arama(String arama) {
        TableRowSorter<DefaultTableModel> ara = new TableRowSorter<>(model);
        veliTable.setRowSorter(ara);
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
            java.util.logging.Logger.getLogger(VeliEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VeliEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VeliEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VeliEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VeliEkran dialog = new VeliEkran(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnTemizle;
    private javax.swing.JButton btnVeliEkle;
    private javax.swing.JButton btnVeliSil;
    private javax.swing.JButton btnVeriDüzenle;
    private javax.swing.JButton btnYeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblArama;
    private javax.swing.JLabel lblMesaj;
    private javax.swing.JTextField txtAnneAdi;
    private javax.swing.JTextField txtAnneTel;
    private javax.swing.JTextField txtArama;
    private javax.swing.JTextField txtBabaAdi;
    private javax.swing.JTextField txtBabaTel;
    private javax.swing.JTable veliTable;
    // End of variables declaration//GEN-END:variables
}
