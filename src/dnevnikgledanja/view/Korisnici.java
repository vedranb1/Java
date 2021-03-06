/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnevnikgledanja.view;

import dnevnikgledanja.controller.Obrada;
import dnevnikgledanja.controller.ObradaKorisnik;
import dnevnikgledanja.model.Korisnik;
import dnevnikgledanja.model.Serija;
import dnevnikgledanja.utility.HibernateUtil;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author Veco
 */
public class Korisnici extends javax.swing.JFrame {
    
    private Border obrub;
    private ObradaKorisnik<Korisnik> obrada;
   
    public Korisnici() {
        
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        obrada = new ObradaKorisnik<>();
        
        ucitajPodatkeKorisnik();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        korisniciList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtLozinka = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtUloga = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        korisniciList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                korisniciListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(korisniciList);

        jLabel1.setText("Username");

        jLabel2.setText("Email");

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obrisi");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        jLabel3.setText("Lozinka");

        jLabel4.setText("Uloga");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(txtEmail)
                    .addComponent(jLabel2)
                    .addComponent(btnObrisi)
                    .addComponent(jLabel3)
                    .addComponent(txtLozinka)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPromjeni))
                    .addComponent(jLabel4)
                    .addComponent(txtUloga))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(9, 9, 9)
                        .addComponent(txtLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUloga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnPromjeni))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnObrisi))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void korisniciListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_korisniciListValueChanged
        
        if (evt.getValueIsAdjusting()) {
            return;
        }

        Korisnik k = korisniciList.getSelectedValue();

        if (k == null) {
            return;
        }

        txtUsername.setText(k.getUsername());
        txtLozinka.setText(k.getLozinka());
        txtEmail.setText(k.getEmail());
        txtUloga.setText(k.getUloga());
        
    }//GEN-LAST:event_korisniciListValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        
        resetirajGreske(); 
        if (!kontrola()) {
            return;
        } 
        Korisnik k = new Korisnik();
        k = napuniObjekt(k);
        obrada.save(k);
        ucitajPodatkeKorisnik();
        
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        
        Korisnik k = korisniciList.getSelectedValue();
        if (k == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite stavku");
            return;
        }

        if (txtUsername.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(getRootPane(), "Obavezno naziv");
            return;
        }

        resetirajGreske(); 
        if (!kontrola()) {
            return;
        } 
        k = napuniObjekt(k);
        obrada.save(k);
        ucitajPodatkeKorisnik();
        
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        
        Korisnik k = korisniciList.getSelectedValue();
        if (k == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite stavku");
            return;
        }
        
        obrada.delete(k);
        ucitajPodatkeKorisnik();
        
    }//GEN-LAST:event_btnObrisiActionPerformed
    
    private Korisnik napuniObjekt(Korisnik k) {
        k.setUsername(txtUsername.getText());
        k.setLozinka(txtLozinka.getText());
        k.setEmail(txtEmail.getText());
        k.setUloga(txtUloga.getText());
        
        return k;
    }
    
    private boolean kontrola(){
        
        if (txtUsername.getText().trim().length() == 0) {
            oznaciGresku(txtUsername);
            return false;
        }
        
        if (txtLozinka.getText().trim().length() == 0) {
            oznaciGresku(txtLozinka);
            return false;
        }
        
        if (txtEmail.getText().trim().length() == 0) {
            oznaciGresku(txtEmail);
            return false;
        }
        
        if (txtUloga.getText().trim().length() == 0) {
            oznaciGresku(txtUloga);
            return false;
        }
        
        return true;
    }
    
    private void oznaciGresku(JTextField polje) {
        polje.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        polje.requestFocus();
    }
    
    private void resetirajGreske() {
        txtUsername.setBorder(obrub);
        txtLozinka.setBorder(obrub);
        txtEmail.setBorder(obrub);
        txtUloga.setBorder(obrub);
    }
    
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
            java.util.logging.Logger.getLogger(Korisnici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Korisnici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Korisnici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Korisnici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Korisnici().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Korisnik> korisniciList;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLozinka;
    private javax.swing.JTextField txtUloga;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

private void ucitajPodatkeKorisnik() {
        DefaultListModel<Korisnik> modelKorisnik = new DefaultListModel<>();

        List<Korisnik> lista = HibernateUtil.getSession().createQuery(
                "from dnevnikgledanja.model.Korisnik where obrisano=false").list();

        for (Korisnik k : lista) {
            modelKorisnik.addElement(k);
        }

        this.korisniciList.setModel(modelKorisnik);

    }

}
