package servis_otomasyonu;

import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class PersonelListele extends javax.swing.JDialog {

    Servis_otomasyonu islemler = new Servis_otomasyonu();
    DefaultTableModel model;
    FaturaOlustur islem = new FaturaOlustur();
    public String gelenForm;
    public int satir;
            
    
    public PersonelListele(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel) PersonelTable.getModel();
        PersonelGoruntule();
         lblBilgi.setText("Kayıt Sayısı: "+String.valueOf(PersonelTable.getRowCount()));
    }
    
    public void PersonelGoruntule() {
        model.setRowCount(0);
        ArrayList<PersonelClass> personel = new ArrayList<>();
        personel = islemler.PersonelGetir();
        if (personel != null) {
            for (PersonelClass pers : personel) {
                Object[] eklenecek = {pers.getPrsnlID(), pers.getAd(), pers.getTel(), pers.getSoyad(), pers.getAdres(), pers.getMaas(), pers.getAracPlaka(), pers.getUnvan(), pers.getBaslamaTarih()};
                model.addRow(eklenecek);
            }
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        PersonelTable = new javax.swing.JTable();
        panel1 = new java.awt.Panel();
        lblArama = new javax.swing.JLabel();
        txtArama = new javax.swing.JTextField();
        lblBilgi = new javax.swing.JLabel();

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

        panel1.setBackground(new java.awt.Color(0, 102, 102));

        lblArama.setText("Arama:");

        txtArama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAramaActionPerformed(evt);
            }
        });
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
                .addGap(334, 334, 334)
                .addComponent(lblArama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtArama, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(359, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBilgi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBilgi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtArama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblArama))
                .addGap(34, 34, 34))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PersonelTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PersonelTableMouseClicked
   
          if (gelenForm.equals("Fatura Satis")) {
      
              int secilen_satir = PersonelTable.getSelectedRow();
              satir=secilen_satir;
            /*  mid = (int) model.getValueAt(secilen_satir,0);
              Adi = model.getValueAt(secilen_satir, 1).toString();
              soyadi = model.getValueAt(secilen_satir, 2).toString();
              tel = model.getValueAt(secilen_satir, 3).toString();
              plaka = model.getValueAt(secilen_satir, 6).toString();
              islem.mid=mid;
              islem.Ad=Adi;
              islem.Soyadi=soyadi;
              islem.Plaka=plaka;
              islem.Tel=tel;
              */
              this.setVisible(false);   
                  } 
          
    }//GEN-LAST:event_PersonelTableMouseClicked
    public void Arama(String arama) {
        TableRowSorter<DefaultTableModel> ara = new TableRowSorter<>(model);
        PersonelTable.setRowSorter(ara);
        ara.setRowFilter(RowFilter.regexFilter(arama));
    }
    private void txtAramaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAramaKeyReleased
        String arama = txtArama.getText();
        Arama(arama);
         lblBilgi.setText("Kayıt Sayısı: "+String.valueOf(PersonelTable.getRowCount()));
    }//GEN-LAST:event_txtAramaKeyReleased

    private void txtAramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAramaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAramaActionPerformed

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
            java.util.logging.Logger.getLogger(PersonelListele.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonelListele.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonelListele.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonelListele.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PersonelListele dialog = new PersonelListele(new javax.swing.JFrame(), true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblArama;
    private javax.swing.JLabel lblBilgi;
    private java.awt.Panel panel1;
    private javax.swing.JTextField txtArama;
    // End of variables declaration//GEN-END:variables
}
