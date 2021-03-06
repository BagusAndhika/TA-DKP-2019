package ta;

import java.util.LinkedList;
import java.util.Queue;
public class TT1 extends javax.swing.JFrame {
    Queue<String> antrianNama = new LinkedList<String>();
    Queue<String> antrianTanggal = new LinkedList<String>();
    Queue<String> antrianBulan = new LinkedList<String>();
    Queue<String> antrianTahun = new LinkedList<String>();
    public TT1() {
        initComponents();
    }
    
    
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
        jTextField5 = new javax.swing.JTextField();
        Bln = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        Thn = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMasuk.setText("Masuk");
        btnMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasukActionPerformed(evt);
            }
        });
        getContentPane().add(btnMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 90, -1));

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 90, -1));

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 90, -1));

        kolomReport.setColumns(20);
        kolomReport.setRows(5);
        jScrollPane1.setViewportView(kolomReport);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 290, 170));

        Nama.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });
        getContentPane().add(Nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 120, 30));

        Tgl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Tgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TglActionPerformed(evt);
            }
        });
        getContentPane().add(Tgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 40, 30));

        comboServis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cek Kondisi", "Pasang Hardware", "Ganti Hardware", "Install Ulang", "Install App", " " }));
        comboServis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboServisActionPerformed(evt);
            }
        });
        getContentPane().add(comboServis, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 120, -1));

        jTextField1.setBackground(new java.awt.Color(240, 240, 240));
        jTextField1.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jTextField1.setText("Nama");
        jTextField1.setBorder(null);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 70, 20));

        jTextField2.setBackground(new java.awt.Color(240, 240, 240));
        jTextField2.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        jTextField2.setText("Bavaria Computer");
        jTextField2.setBorder(null);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jTextField3.setBackground(new java.awt.Color(240, 240, 240));
        jTextField3.setText("Tanggal Masuk");
        jTextField3.setBorder(null);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 80, 20));

        jTextField4.setBackground(new java.awt.Color(240, 240, 240));
        jTextField4.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jTextField4.setText("Servis");
        jTextField4.setBorder(null);
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 50, -1));

        jTextField5.setBackground(new java.awt.Color(240, 240, 240));
        jTextField5.setText("Bulan");
        jTextField5.setBorder(null);
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 30, -1));
        getContentPane().add(Bln, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 40, 30));

        jTextField7.setBackground(new java.awt.Color(240, 240, 240));
        jTextField7.setText("Tahun");
        jTextField7.setBorder(null);
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));
        getContentPane().add(Thn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 40, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasukActionPerformed
String nama = Nama.getText();
String tanggal = Tgl.getText();
String bulan = Bln.getText();
String tahun = Thn.getText();
int tujuan = comboServis.getSelectedIndex();
switch(tujuan){
 case (0):
 kolomReport.setText("Pesanan atas nama "+nama+" dan servis \n"+comboServis.getItemAt(tujuan)+" pada tanggal "
            +tanggal+"/"+bulan+"/"+tahun+" telah masuk. \n Silakan Menunggu" );
 antrianNama.add(nama);
 antrianTanggal.add(tanggal);
 antrianBulan.add(bulan);
 antrianTahun.add(tahun);
 System.out.println("");
 break;
 case (1) :
 kolomReport.setText("Pesanan atas nama "+nama+" dan servis \n"+comboServis.getItemAt(tujuan)+" pada tanggal "
            +tanggal+"/"+bulan+"/"+tahun+" telah masuk. \n Silakan Menunggu" );
 antrianNama.add(nama);
 antrianTanggal.add(tanggal);
 antrianBulan.add(bulan);
 antrianTahun.add(tahun);
 System.out.println("");
 break;
 case (2) :
 kolomReport.setText("Pesanan atas nama "+nama+" dan servis \n"+comboServis.getItemAt(tujuan)+" pada tanggal "
            +tanggal+"/"+bulan+"/"+tahun+" telah masuk. \n Silakan Menunggu" );
 antrianNama.add(nama);
 antrianTanggal.add(tanggal);
 antrianBulan.add(bulan);
 antrianTahun.add(tahun);
 System.out.println("");
 break;
 case (3) :
 kolomReport.setText("Pesanan atas nama "+nama+" dan servis \n"+comboServis.getItemAt(tujuan)+" pada tanggal "
            +tanggal+"/"+bulan+"/"+tahun+" telah masuk. \n Silakan Menunggu" );
 antrianNama.add(nama);
 antrianTanggal.add(tanggal);
 antrianBulan.add(bulan);
 antrianTahun.add(tahun);
 System.out.println("");
 break;
 case (4) :
 kolomReport.setText("Pesanan atas nama "+nama+" dan servis \n"+comboServis.getItemAt(tujuan)+" pada tanggal "
            +tanggal+"/"+bulan+"/"+tahun+" telah masuk. \n Silakan Menunggu" );
 antrianNama.add(nama);
 antrianTanggal.add(tanggal);
 antrianBulan.add(bulan);
 antrianTahun.add(tahun);
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

int tujuan= comboServis.getSelectedIndex();
switch(tujuan){
 case (0):
 kolomReport.setText("Pesanan atas nama "+antrianNama.poll()+" dan servis "
         + "\n"+comboServis.getItemAt(tujuan)+" pada tanggal "
            +antrianTanggal.poll()+"/"+antrianBulan.poll()+
         "/"+antrianTahun.poll()+" telah selesai. \n Silakan Diambil" );        
 break;
 case (1) :
 kolomReport.setText("Pesanan atas nama "+antrianNama.poll()+" dan servis "
         + "\n"+comboServis.getItemAt(tujuan)+" pada tanggal "
            +antrianTanggal.poll()+"/"+antrianBulan.poll()+
         "/"+antrianTahun.poll()+" telah selesai. \n Silakan Diambil" );        
 break;
 case (2) :
 kolomReport.setText("Pesanan atas nama "+antrianNama.poll()+" dan servis "
         + "\n"+comboServis.getItemAt(tujuan)+" pada tanggal "
            +antrianTanggal.poll()+"/"+antrianBulan.poll()+
         "/"+antrianTahun.poll()+" telah selesai. \n Silakan Diambil" );        
 break;
 case (3) :
 kolomReport.setText("Pesanan atas nama "+antrianNama.poll()+" dan servis "
         + "\n"+comboServis.getItemAt(tujuan)+" pada tanggal "
            +antrianTanggal.poll()+"/"+antrianBulan.poll()+
         "/"+antrianTahun.poll()+" telah selesai. \n Silakan Diambil" );        
 break;
 case (4) :
 kolomReport.setText("Pesanan atas nama "+antrianNama.poll()+" dan servis "
         + "\n"+comboServis.getItemAt(tujuan)+" pada tanggal "
            +antrianTanggal.poll()+"/"+antrianBulan.poll()+
         "/"+antrianTahun.poll()+" telah selesai. \n Silakan Diambil" );        
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
    private javax.swing.JTextField Bln;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Tgl;
    private javax.swing.JTextField Thn;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnMasuk;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> comboServis;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextArea kolomReport;
    // End of variables declaration//GEN-END:variables
}
