

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author uknow
 */
public class cetaktiket extends javax.swing.JFrame {

    /**
     * Creates new form cetaktiket
     */
    public cetaktiket() {
        initComponents();
         // tampil nama username penumpang
       if(tampilan_depan.ceklempuyangan.isSelected()){
           nama_penumpang.setText(registrasi.username);
         // tampil nama kereta
        Object comboboxL = tampilan_depan.lempuyangan.getSelectedItem();
        if (comboboxL != null)
        {
            String selectedItemStr = comboboxL.toString();
            nama_kereta.setText(selectedItemStr);
        }
        if(tampilan_depan.ceklempuyangan.isSelected()){
            stasiun.setText("Stasiun Lempuyangan");
        }
        if(tampilan_depan.jam1.isSelected()){
            String jam1="10:00";
            jam_berangkat.setText(jam1);   
        }
        if(tampilan_depan.jam2.isSelected()){
                String jam2="18:00";
                jam_berangkat.setText(jam2);
            }
        if(tampilan_depan.jam3.isSelected()){
                String jam3="15:00";
                jam_berangkat.setText(jam3);
            }
        if(tampilan_depan.jam4.isSelected()){
                String jam4="20:00";
                jam_berangkat.setText(jam4);
            }
        if(tampilan_depan.tunai.isSelected()){
            String tunai="Tunai";
            pembayaran.setText(tunai);
        }
        if(tampilan_depan.mandiri.isSelected()){
            String mandiri="Mandiri";
            pembayaran.setText(mandiri);
        }
        if(tampilan_depan.bri.isSelected()){
            String bri="BRI";
            pembayaran.setText(bri);
        }
        if(tampilan_depan.bni.isSelected()){
            String bni="BNI";
            pembayaran.setText(bni);
        }
        if(tampilan_depan.bca.isSelected()){
            String bca="BCA";
            pembayaran.setText(bca);
        }
        if(tampilan_depan.dana.isSelected()){
            String dana="DANA";
            pembayaran.setText(dana);
        }
        if(tampilan_depan.checkout.isEnabled()){
            //int TotalL=Integer.parseInt(tampilan_depan.hasil_checkout.getText());
            String TotalL=String.valueOf(tampilan_depan.hasil_checkout.getText());
            totaltiket.setText(TotalL);
        }
       }
       if(tampilan_depan.cektugu.isSelected()){
           nama_penumpang.setText(registrasi.username);
         // tampil nama kereta
        Object comboboxT = tampilan_depan.tugu.getSelectedItem();
        if (comboboxT != null)
        {
            String selectedItemStr = comboboxT.toString();
            nama_kereta.setText(selectedItemStr);
        }
        if(tampilan_depan.cektugu.isSelected()){
            stasiun.setText("Stasiun Tugu");
        }
        if(tampilan_depan.jam5.isSelected()){
            String jam5="10:00";
            jam_berangkat.setText(jam5);   
        }
        if(tampilan_depan.jam6.isSelected()){
                String jam6="18:00";
                jam_berangkat.setText(jam6);
            }
        if(tampilan_depan.jam7.isSelected()){
                String jam7="15:00";
                jam_berangkat.setText(jam7);
            }
        if(tampilan_depan.jam8.isSelected()){
                String jam8="20:00";
                jam_berangkat.setText(jam8);
            }
        if(tampilan_depan.tunai.isSelected()){
            String tunai="Tunai";
            pembayaran.setText(tunai);
        }
        if(tampilan_depan.mandiri.isSelected()){
            String mandiri="Mandiri";
            pembayaran.setText(mandiri);
        }
        if(tampilan_depan.bri.isSelected()){
            String bri="BRI";
            pembayaran.setText(bri);
        }
        if(tampilan_depan.bni.isSelected()){
            String bni="BNI";
            pembayaran.setText(bni);
        }
        if(tampilan_depan.bca.isSelected()){
            String bca="BCA";
            pembayaran.setText(bca);
        }
        if(tampilan_depan.dana.isSelected()){
            String dana="DANA";
            pembayaran.setText(dana);
        }
        if(tampilan_depan.checkout.isEnabled()){
            String TotalT=String.valueOf(tampilan_depan.hasil_checkout.getText());
            totaltiket.setText(TotalT);
        }
       }
       if(tampilan_depan.cekmaguwo.isSelected()){
           nama_penumpang.setText(registrasi.username);
         // tampil nama kereta
        Object comboboxM = tampilan_depan.maguwo.getSelectedItem();
        if (comboboxM != null)
        {
            String selectedItemStr = comboboxM.toString();
            nama_kereta.setText(selectedItemStr);
        }
        if(tampilan_depan.cekmaguwo.isSelected()){
            stasiun.setText("Stasiun Maguwo");
        }
        if(tampilan_depan.jam9.isSelected()){
            String jam9="10:00";
            jam_berangkat.setText(jam9);   
        }
        if(tampilan_depan.jam10.isSelected()){
                String jam10="18:00";
                jam_berangkat.setText(jam10);
            }
        if(tampilan_depan.jam11.isSelected()){
                String jam11="15:00";
                jam_berangkat.setText(jam11);
            }
        if(tampilan_depan.jam12.isSelected()){
                String jam12="20:00";
                jam_berangkat.setText(jam12);
            }
        if(tampilan_depan.tunai.isSelected()){
            String tunai="Tunai";
            pembayaran.setText(tunai);
        }
        if(tampilan_depan.mandiri.isSelected()){
            String mandiri="Mandiri";
            pembayaran.setText(mandiri);
        }
        if(tampilan_depan.bri.isSelected()){
            String bri="BRI";
            pembayaran.setText(bri);
        }
        if(tampilan_depan.bni.isSelected()){
            String bni="BNI";
            pembayaran.setText(bni);
        }
        if(tampilan_depan.bca.isSelected()){
            String bca="BCA";
            pembayaran.setText(bca);
        }
        if(tampilan_depan.dana.isSelected()){
            String dana="DANA";
            pembayaran.setText(dana);
        }
        if(tampilan_depan.checkout.isEnabled()){
            String TotalM=String.valueOf(tampilan_depan.hasil_checkout.getText());
            totaltiket.setText(TotalM);
        }
       }
       if(tampilan_depan.ceksentolo.isSelected()){
           nama_penumpang.setText(registrasi.username);
         // tampil nama kereta
        Object comboboxS = tampilan_depan.sentolo.getSelectedItem();
        if (comboboxS != null)
        {
            String selectedItemStr = comboboxS.toString();
            nama_kereta.setText(selectedItemStr);
        }
        if(tampilan_depan.ceksentolo.isSelected()){
            stasiun.setText("Stasiun Sentolo");
        }
        if(tampilan_depan.jam13.isSelected()){
            String jam13="10:00";
            jam_berangkat.setText(jam13);   
        }
        if(tampilan_depan.jam14.isSelected()){
                String jam14="18:00";
                jam_berangkat.setText(jam14);
            }
        if(tampilan_depan.jam15.isSelected()){
                String jam15="15:00";
                jam_berangkat.setText(jam15);
            }
        if(tampilan_depan.jam16.isSelected()){
                String jam16="20:00";
                jam_berangkat.setText(jam16);
            }
        if(tampilan_depan.tunai.isSelected()){
            String tunai="Tunai";
            pembayaran.setText(tunai);
        }
        if(tampilan_depan.mandiri.isSelected()){
            String mandiri="Mandiri";
            pembayaran.setText(mandiri);
        }
        if(tampilan_depan.bri.isSelected()){
            String bri="BRI";
            pembayaran.setText(bri);
        }
        if(tampilan_depan.bni.isSelected()){
            String bni="BNI";
            pembayaran.setText(bni);
        }
        if(tampilan_depan.bca.isSelected()){
            String bca="BCA";
            pembayaran.setText(bca);
        }
        if(tampilan_depan.dana.isSelected()){
            String dana="DANA";
            pembayaran.setText(dana);
        }
        if(tampilan_depan.checkout.isEnabled()){
            String TotalS=String.valueOf(tampilan_depan.hasil_checkout.getText());
            totaltiket.setText(TotalS);
        }
       }
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
        jLabel13 = new javax.swing.JLabel();
        kembali = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        nama_penumpang = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        nama_kereta = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        stasiun = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jam_berangkat = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        pembayaran = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        totaltiket = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(null);

        jLabel13.setFont(new java.awt.Font("URW Bookman L", 1, 40)); // NOI18N
        jLabel13.setText("THREE TICKET.COM");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(240, 0, 441, 53);

        kembali.setBackground(new java.awt.Color(254, 254, 254));
        kembali.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        kembali.setForeground(new java.awt.Color(1, 1, 1));
        kembali.setText("Kembali");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        jPanel1.add(kembali);
        kembali.setBounds(0, 0, 90, 28);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 60);

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Fira Code SemiBold", 1, 15)); // NOI18N
        jLabel7.setText("Total");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 230, 140, 18);

        jLabel8.setFont(new java.awt.Font("Fira Code SemiBold", 1, 15)); // NOI18N
        jLabel8.setText("Nama Penumpang");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 30, 140, 20);

        jLabel9.setFont(new java.awt.Font("Fira Code SemiBold", 1, 15)); // NOI18N
        jLabel9.setText("Nama Kereta");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 70, 140, 18);

        jLabel10.setFont(new java.awt.Font("Fira Code SemiBold", 1, 15)); // NOI18N
        jLabel10.setText("Stasiun Tujuan");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 110, 140, 18);

        jLabel11.setFont(new java.awt.Font("Fira Code SemiBold", 1, 15)); // NOI18N
        jLabel11.setText("Jam Keberangkatan");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 150, 160, 18);

        jLabel12.setFont(new java.awt.Font("Fira Code SemiBold", 1, 15)); // NOI18N
        jLabel12.setText("Metode Pembayaran");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 190, 160, 18);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 50, 170, 250);

        jPanel3.setBackground(new java.awt.Color(128, 128, 128));
        jPanel3.setLayout(null);
        jPanel3.add(nama_penumpang);
        nama_penumpang.setBounds(10, 0, 320, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(170, 60, 730, 40);

        jPanel4.setBackground(new java.awt.Color(254, 254, 254));
        jPanel4.setLayout(null);
        jPanel4.add(nama_kereta);
        nama_kereta.setBounds(10, 0, 320, 40);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(167, 100, 740, 40);

        jPanel5.setBackground(new java.awt.Color(128, 128, 128));
        jPanel5.setLayout(null);
        jPanel5.add(stasiun);
        stasiun.setBounds(10, 0, 320, 40);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(169, 140, 730, 40);

        jPanel6.setBackground(new java.awt.Color(254, 254, 254));
        jPanel6.setLayout(null);
        jPanel6.add(jam_berangkat);
        jam_berangkat.setBounds(10, 0, 320, 40);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(170, 179, 730, 40);

        jPanel7.setBackground(new java.awt.Color(128, 128, 128));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(400, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pembayaran, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel7);
        jPanel7.setBounds(170, 220, 730, 40);

        jPanel8.setBackground(new java.awt.Color(254, 254, 254));
        jPanel8.setLayout(null);
        jPanel8.add(totaltiket);
        totaltiket.setBounds(10, 0, 320, 40);

        getContentPane().add(jPanel8);
        jPanel8.setBounds(169, 260, 730, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
        login lg=new login();
            lg.setVisible(true);
            lg.pack();
            lg.setLocationRelativeTo(null);
            lg.setDefaultCloseOperation(cetaktiket.EXIT_ON_CLOSE);
    }//GEN-LAST:event_kembaliActionPerformed

    /**
     *
     */
    
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
            java.util.logging.Logger.getLogger(cetaktiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cetaktiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cetaktiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cetaktiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cetaktiket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel jam_berangkat;
    private javax.swing.JButton kembali;
    private javax.swing.JLabel nama_kereta;
    private javax.swing.JLabel nama_penumpang;
    private javax.swing.JLabel pembayaran;
    private javax.swing.JLabel stasiun;
    private javax.swing.JLabel totaltiket;
    // End of variables declaration//GEN-END:variables

    private void Foo(String selectedItemStr) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
