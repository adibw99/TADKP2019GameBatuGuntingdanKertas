/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.jankenpo;

import java.awt.Component;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class JankenpoFIX extends javax.swing.JFrame {
 Double b ;
    String  a;
    /**
     * Creates new form JankenpoFIX
     */
    public JankenpoFIX() {
        initComponents();
    }

void popup(){
    JOptionPane.showMessageDialog(this, "Selamat datang "+keluaranNama.getText()+"\nDengan NIM terakhir anda "+keluaranNIM.getText());
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pilihanInput = new javax.swing.JComboBox<>();
        submitPilihan = new javax.swing.JButton();
        hasilCPU = new javax.swing.JTextField();
        inputUser = new javax.swing.JTextField();
        keluaranNama = new javax.swing.JTextField();
        keluaranNIM = new javax.swing.JTextField();
        input = new javax.swing.JButton();
        inputanNIM = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        hasilPertandingan = new javax.swing.JTextArea();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Game Batu Gunting dan Kertas");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pilihanInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Batu", "Gunting", "Kertas"}));
        getContentPane().add(pilihanInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 260, 50));

        submitPilihan.setText("SUBMIT");
        submitPilihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitPilihanActionPerformed(evt);
            }
        });
        getContentPane().add(submitPilihan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 240, 60));

        hasilCPU.setText(" ");
        getContentPane().add(hasilCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 250, 50));

        inputUser.setText(" ");
        getContentPane().add(inputUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 240, 50));

        keluaranNama.setText(" ");
        getContentPane().add(keluaranNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 200, 30));

        keluaranNIM.setText(" ");
        getContentPane().add(keluaranNIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 200, 30));

        input.setText("Input Nama");
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });
        getContentPane().add(input, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 110, 40));

        inputanNIM.setText("Input NIM");
        inputanNIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputanNIMActionPerformed(evt);
            }
        });
        getContentPane().add(inputanNIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 110, 40));

        hasilPertandingan.setColumns(20);
        hasilPertandingan.setRows(5);
        jScrollPane1.setViewportView(hasilPertandingan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 580, 180));

        exit.setBackground(new java.awt.Color(255, 0, 51));
        exit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        exit.setText("X");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 60, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/jankenpo/JankenpoFIX.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
      NewClass keluar = new NewClass("Muhammad Adib Bowo L");
      keluar.exit();
    }//GEN-LAST:event_exitActionPerformed

    private void submitPilihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitPilihanActionPerformed
        // TODO add your handling code here:
        int angka ;
    angka = pilihanInput.getSelectedIndex();
    Random komp = new Random();
    String [] arr= {"Batu", "Gunting", "Kertas"};
    int komputer=komp.nextInt(arr.length);
    int i= komputer;
if (angka==0) 
{ 
    hasilCPU.setText(arr[komputer]);
       switch (i) 
           {
               case 0:
                hasilPertandingan.setText("Hallo "+keluaranNama.getText()+"\nHasil Permainan Anda Draw" );
                   break;
               case 1:
                hasilPertandingan.setText("Selamat "+keluaranNama.getText()+"\nAnda Menang");
                   break;
               default:
                hasilPertandingan.setText("Maaf "+keluaranNama.getText()+"\nAnda Kalah");  
           }
}
if (angka ==1)
{
    hasilCPU.setText(arr[komputer]);
           switch (i) 
           {
               case 0:
                   hasilPertandingan.setText("Maaf "+keluaranNama.getText()+"\nAnda Kalah" );
                   break;
               case 1:
                   hasilPertandingan.setText("Hallo "+keluaranNama.getText()+"\nHasil Permainan Anda Draw" );
                   break;
               case 2:
                   hasilPertandingan.setText("Selamat "+keluaranNama.getText()+"\nAnda Menang");
                   break;
               default:
                   break;
           }
}
 if (angka ==2) 
 {  
     hasilCPU.setText(arr[komputer]);
               switch (i) 
               {    
                   case 0:
                       hasilPertandingan.setText("Selamat "+keluaranNama.getText()+"\nAnda Menang");
                       break;
                   case 1:
                       hasilPertandingan.setText("Maaf "+keluaranNama.getText()+"\nAnda Kalah" );
                       break;
                   case 2:
                       hasilPertandingan.setText("Hallo "+keluaranNama.getText()+"\nHasil Permainan Anda Draw" );
                       break;
                   default:
                       break;
               }    
 }
    }//GEN-LAST:event_submitPilihanActionPerformed

    private void inputanNIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputanNIMActionPerformed
        // TODO add your handling code here:
        try{
        a = inputUser.getText();
        NewClass aa = new NewClass(a);
        aa.setNIM(a);
        keluaranNIM.setText(aa.getNIM());
        popup();
        }
        catch (Exception e){
          JOptionPane.showMessageDialog(this, "Harus masukkan angka!!!!!!!");  
        }
    }//GEN-LAST:event_inputanNIMActionPerformed

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // TODO add your handling code here:
        NewClass aa = new NewClass(inputUser.getText());
        keluaranNama.setText(aa.nama());
        JOptionPane.showMessageDialog(this, "Selamat datang "+keluaranNama.getText()+"\nHarap masukkan 7 digit NIM terakhir");
    }//GEN-LAST:event_inputActionPerformed

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
            java.util.logging.Logger.getLogger(JankenpoFIX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JankenpoFIX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JankenpoFIX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JankenpoFIX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JankenpoFIX().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JTextField hasilCPU;
    private javax.swing.JTextArea hasilPertandingan;
    private javax.swing.JButton input;
    private javax.swing.JTextField inputUser;
    private javax.swing.JButton inputanNIM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField keluaranNIM;
    private javax.swing.JTextField keluaranNama;
    private javax.swing.JComboBox<String> pilihanInput;
    private javax.swing.JButton submitPilihan;
    // End of variables declaration//GEN-END:variables
}
