package ta;

import java.util.LinkedList;
import java.util.Queue;
public class TT1 extends javax.swing.JFrame {

    public TT1() {
        initComponents();
    }
    Queue<String> antrian = new LinkedList<String>();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMasuk = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        kolomReport = new javax.swing.JTextArea();
        Nama = new javax.swing.JTextField();
        Tgl = new javax.swing.JTextField();
        comboServis = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMasuk.setText("Masuk");
        btnMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasukActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        kolomReport.setColumns(20);
        kolomReport.setRows(5);
        jScrollPane1.setViewportView(kolomReport);

        Nama.setBorder(null);
        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });

        Tgl.setBorder(null);
        Tgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TglActionPerformed(evt);
            }
        });

        comboServis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cek Kondisi", "Pasang Hardware", "Ganti Hardware", "Install Ulang", "Install App", " " }));
        comboServis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboServisActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(240, 240, 240));
        jTextField1.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jTextField1.setText("Nama");
        jTextField1.setBorder(null);

        jTextField2.setBackground(new java.awt.Color(240, 240, 240));
        jTextField2.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        jTextField2.setText("Bavaria Computer");
        jTextField2.setBorder(null);

        jTextField3.setBackground(new java.awt.Color(240, 240, 240));
        jTextField3.setText("Tanggal Masuk");
        jTextField3.setBorder(null);

        jTextField4.setBackground(new java.awt.Color(240, 240, 240));
        jTextField4.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jTextField4.setText("Servis");
        jTextField4.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(comboServis, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(Tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboServis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnMasuk)
                        .addGap(17, 17, 17)
                        .addComponent(btnReset)
                        .addGap(17, 17, 17)
                        .addComponent(btnKeluar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasukActionPerformed
String nama = Nama.getText();
String tanggal = Tgl.getText();
int tujuan = comboServis.getSelectedIndex();
switch(tujuan){
 case (0):
 kolomReport.setText("Pesanan atas nama "+nama+" dan servis "+comboServis.getItemAt(tujuan)+" pada tanggal "
         +tanggal+" telah masuk. \n Silakan Menunggu" );
 antrian.add(nama);
 antrian.add(tanggal);
 System.out.println("");
 break;
 case (1) :
 kolomReport.setText("Pesanan atas nama "+nama+" dan servis "+comboServis.getItemAt(tujuan)+" pada tanggal "
         +tanggal+" telah masuk. \n Silakan Menunggu" ); antrian.add(nama);
 antrian.add(tanggal);
 System.out.println("");
 break;
 case (2) :
 kolomReport.setText("Pesanan atas nama "+nama+" dan servis "+comboServis.getItemAt(tujuan)+" pada tanggal "
         +tanggal+" telah masuk. \n Silakan Menunggu" );  antrian.add(nama);
 antrian.add(tanggal);
 System.out.println("");
 break;
 case (3) :
 kolomReport.setText("Pesanan atas nama "+nama+" dan servis "+comboServis.getItemAt(tujuan)+" pada tanggal "
         +tanggal+" telah masuk. \n Silakan Menunggu" );  antrian.add(nama);
 antrian.add(tanggal);
 System.out.println("");
 break;
 case (4) :
 kolomReport.setText("Pesanan atas nama "+nama+" dan servis "+comboServis.getItemAt(tujuan)+" pada tanggal "
         +tanggal+" telah masuk. \n Silakan Menunggu" );  antrian.add(nama);
 antrian.add(tanggal);
 System.out.println("");
 break;
 }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMasukActionPerformed

    private void comboServisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboServisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboServisActionPerformed

    private void TglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TglActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TglActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
Nama.setText("");
Tgl.setText("");
kolomReport.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
String nama = Nama.getText();
String tanggal = Tgl.getText();
int tujuan= comboServis.getSelectedIndex();
switch(tujuan){
 case (0):
 antrian.poll();
 kolomReport.setText("Pesanan atas nama "+nama+" dan servis "+comboServis.getItemAt(tujuan)+" pada tanggal "
         +tanggal+" telah selesai. \n Silakan Diambil" );
 break;
 case (1) :
 kolomReport.setText("Pesanan atas nama "+nama+" dan servis "+comboServis.getItemAt(tujuan)+" pada tanggal "
         +tanggal+" telah selesai. \n Silakan Diambil" );
 antrian.poll();
 break;
 case (2) :
 kolomReport.setText("Pesanan atas nama "+nama+" dan servis "+comboServis.getItemAt(tujuan)+" pada tanggal "
         +tanggal+" telah selesai. \n Silakan Diambil" );
 antrian.poll();
 break;
 case (3) :
 kolomReport.setText("Pesanan atas nama "+nama+" dan servis "+comboServis.getItemAt(tujuan)+" pada tanggal "
         +tanggal+" telah selesai. \n Silakan Diambil" );
 antrian.poll();
 break;
 case (4) :
 kolomReport.setText("Pesanan atas nama "+nama+" dan servis "+comboServis.getItemAt(tujuan)+" pada tanggal "
         +tanggal+" telah selesai. \n Silakan Diambil" );
 antrian.poll();
 break;
 }
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaActionPerformed

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
            java.util.logging.Logger.getLogger(TT1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TT1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TT1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TT1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TT1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Tgl;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnMasuk;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> comboServis;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextArea kolomReport;
    // End of variables declaration//GEN-END:variables
}