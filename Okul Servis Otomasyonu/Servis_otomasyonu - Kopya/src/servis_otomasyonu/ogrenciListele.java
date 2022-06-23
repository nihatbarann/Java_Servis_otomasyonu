
package servis_otomasyonu;

import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class ogrenciListele extends javax.swing.JDialog {
    Servis_otomasyonu islemler = new Servis_otomasyonu();
    DefaultTableModel model=null;
    FaturaOlustur islem = new FaturaOlustur();
    public static String OgrAdi="",OgrSoyadi="",OgrOkul="";
    public static String gelenForm="";
    public static int OgrID=0;
    public ogrenciListele(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
          model = (DefaultTableModel) jOgrTable.getModel();
        ogrenciGoruntule();
         lblBilgi.setText("Kayıt Sayısı: "+String.valueOf(jOgrTable.getRowCount()));
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jOgrTable = new javax.swing.JTable();
        panel1 = new java.awt.Panel();
        lblArama = new javax.swing.JLabel();
        txtArama = new javax.swing.JTextField();
        lblBilgi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jOgrTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Ad", "Soyadı", "Okul", "Telefon", "Adres", "Tarih"
            }
        ));
        jOgrTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jOgrTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jOgrTable);

        panel1.setBackground(new java.awt.Color(0, 102, 102));

        lblArama.setText("Arama:");

        txtArama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAramaKeyReleased(evt);
            }
        });

        lblBilgi.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(lblArama)
                .addGap(33, 33, 33)
                .addComponent(txtArama, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBilgi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBilgi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtArama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblArama))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   public void Arama(String arama) {
        TableRowSorter<DefaultTableModel> ara = new TableRowSorter<>(model);
        jOgrTable.setRowSorter(ara);
       ara.setRowFilter(RowFilter.regexFilter(arama));
    }
    private void txtAramaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAramaKeyReleased
        String arama = txtArama.getText();
        Arama(arama);
         lblBilgi.setText("Kayıt Sayısı: "+String.valueOf(jOgrTable.getRowCount()));
    }//GEN-LAST:event_txtAramaKeyReleased

    private void jOgrTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jOgrTableMouseClicked
         if (gelenForm.equals("Fatura Satis")) {
              int secilen_satir = jOgrTable.getSelectedRow();
              OgrID = (int) model.getValueAt(secilen_satir,0);
             OgrAdi =model.getValueAt(secilen_satir, 1).toString();
             OgrSoyadi =model.getValueAt(secilen_satir, 2).toString();
             OgrOkul =model.getValueAt(secilen_satir, 3).toString();
               this.setVisible(false);
              
              
    }//GEN-LAST:event_jOgrTableMouseClicked
    }
    
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
            java.util.logging.Logger.getLogger(ogrenciListele.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ogrenciListele.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ogrenciListele.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ogrenciListele.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ogrenciListele dialog = new ogrenciListele(new javax.swing.JFrame(), true);
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
    private javax.swing.JTable jOgrTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblArama;
    private javax.swing.JLabel lblBilgi;
    private java.awt.Panel panel1;
    private javax.swing.JTextField txtArama;
    // End of variables declaration//GEN-END:variables
}
