/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnevnikgledanja.view;


import dnevnikgledanja.view.Izbornik;
import dnevnikgledanja.controller.Obrada;
import dnevnikgledanja.model.Korisnik;
import dnevnikgledanja.model.Serija;
import static dnevnikgledanja.model.Serija_.korisnik;
import dnevnikgledanja.model.Sezona;
import dnevnikgledanja.utility.HibernateUtil;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Veco
 */
public class Serije extends javax.swing.JFrame {
    
   Korisnik k = new Korisnik();
   private int sifraKorisnika;  
   private Border obrub;
   private Obrada<Serija> obrada;
   private Obrada<Sezona> obradaSezona;
   private int sifraSerije;
   private long ukupnaOcjena;
   private long ukupnoSezona;
   private long prosjecnaOcjena; 
   
    public Serije(Korisnik k) {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.k=k;
        sifraKorisnika=this.k.getSifra();
        System.out.println(sifraKorisnika);
        obrada = new Obrada<>();
        obradaSezona = new Obrada<>();
        
        ucitajPodatkeSerija();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        brojSezonaLabel = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        sezoneList = new javax.swing.JList<>();
        nazivLabel = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        btnSelect = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        serijeList = new javax.swing.JList<>();
        nazivSezoneLabel = new javax.swing.JLabel();
        txtNazivSezone = new javax.swing.JTextField();
        brojEpizodaLabel = new javax.swing.JLabel();
        txtBrojEpizoda = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRedniBroj = new javax.swing.JTextField();
        btnDodajSezonu = new javax.swing.JButton();
        btnPromjeniSezonu = new javax.swing.JButton();
        btnObrisiSezonu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtPogledano = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtUkupanBrojEpizoda = new javax.swing.JTextField();
        btnPlus = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtOcjenaSezone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        LabelPrikaz = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtProsjek = new javax.swing.JTextField();

        brojSezonaLabel.setText("Broj sezona");

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        sezoneList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                sezoneListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(sezoneList);

        nazivLabel.setText("Naziv");

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

        btnSelect.setText("Select");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        serijeList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                serijeListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(serijeList);

        nazivSezoneLabel.setText("Naziv");

        brojEpizodaLabel.setText("Broj epizoda");

        jLabel2.setText("Redni broj");

        btnDodajSezonu.setText("Dodaj");
        btnDodajSezonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajSezonuActionPerformed(evt);
            }
        });

        btnPromjeniSezonu.setText("Promjeni");
        btnPromjeniSezonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniSezonuActionPerformed(evt);
            }
        });

        btnObrisiSezonu.setText("Obrisi");
        btnObrisiSezonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiSezonuActionPerformed(evt);
            }
        });

        jLabel3.setText("Pogledano / Broj epizoda");

        jLabel4.setText("/");

        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnMinus.setText("-");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        jLabel5.setText("Ocjena sezone");

        jLabel6.setText("Prikazujem podatke za :");

        jLabel7.setText("Popis serija");

        jLabel8.setText("Prosjecna ocjena serije");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(49, 49, 49)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nazivLabel)
                                    .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDodaj)
                                    .addComponent(btnSelect)
                                    .addComponent(btnPromjeni))
                                .addGap(46, 46, 46))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnObrisi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtProsjek, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtOcjenaSezone, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(LabelPrikaz, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNazivSezone, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(txtBrojEpizoda)
                    .addComponent(txtRedniBroj)
                    .addComponent(nazivSezoneLabel)
                    .addComponent(brojEpizodaLabel)
                    .addComponent(jLabel2)
                    .addComponent(btnObrisiSezonu)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPogledano, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addComponent(btnDodajSezonu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPromjeniSezonu)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtUkupanBrojEpizoda, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPlus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMinus)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(nazivLabel))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProsjek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nazivSezoneLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNazivSezone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(brojEpizodaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBrojEpizoda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRedniBroj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPogledano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUkupanBrojEpizoda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(btnPlus)
                                    .addComponent(btnMinus))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnDodajSezonu)
                                    .addComponent(btnPromjeniSezonu))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnObrisiSezonu))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDodaj)
                                        .addGap(41, 41, 41)
                                        .addComponent(btnSelect)
                                        .addGap(39, 39, 39)
                                        .addComponent(btnPromjeni)
                                        .addGap(35, 35, 35)
                                        .addComponent(btnObrisi))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(LabelPrikaz, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtOcjenaSezone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
       
        resetirajGreskeSerija();
        if (!kontrolaSerija()) {
            return;
        }
        Serija s = new Serija();
        System.out.println(sifraKorisnika);
        s.setKorisnik(String.valueOf(sifraKorisnika));
        s = napuniObjekt(s);
        obrada.save(s);
        ucitajPodatkeSerija();
    }//GEN-LAST:event_btnDodajActionPerformed
    
    private Serija napuniObjekt(Serija ser) {
        ser.setNaziv(txtNaziv.getText());
        return ser;
    }
    
    private Sezona napuniObjektSezona(Sezona sez) {
        Serija ser = serijeList.getSelectedValue();
        sifraSerije = ser.getSifra();
        sez.setSerija(sifraSerije);
        sez.setNaziv(txtNazivSezone.getText());
        sez.setRednibroj(Integer.parseInt(txtRedniBroj.getText()));
        sez.setBrojepizoda(Integer.parseInt(txtBrojEpizoda.getText()));
       
        return sez;
    }
    
    private boolean kontrolaSerija() {
        if (txtNaziv.getText().trim().length() == 0) {
            oznaciGresku(txtNaziv);
            return false;
        }
          
        return true;
    }
    
    private boolean kontrolaSezona() {
        if (txtNazivSezone.getText().trim().length() == 0) {
            oznaciGresku(txtNazivSezone);
            return false;
        }
        
        if (txtBrojEpizoda.getText().trim().length() == 0) {
            oznaciGresku(txtBrojEpizoda);
            return false;
        }
        
        try {
            Integer.parseInt(txtBrojEpizoda.getText());
        } catch (Exception e) {
            oznaciGresku(txtBrojEpizoda);
            return false;
        }
        
        if (txtRedniBroj.getText().trim().length() == 0) {
            oznaciGresku(txtRedniBroj);
            return false;
        }
        
        try {
            Integer.parseInt(txtRedniBroj.getText());
        } catch (Exception e) {
            oznaciGresku(txtRedniBroj);
            return false;
        }

        return true;
    }

    private void oznaciGresku(JTextField polje) {
        polje.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        polje.requestFocus();
    }
    
    
    private void resetirajGreskeSerija() {
        txtNaziv.setBorder(obrub);
    }
    
    private void resetirajGreskeSezona() {
        txtNazivSezone.setBorder(obrub);
        txtBrojEpizoda.setBorder(obrub);
        txtRedniBroj.setBorder(obrub);
        txtOcjenaSezone.setBorder(obrub);
    }
    
    
    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
         
        Serija s = serijeList.getSelectedValue();
        if (s == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite stavku");
            return;
        }

        if (txtNaziv.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(getRootPane(), "Obavezno naziv");
            return;
        }

        resetirajGreskeSerija(); 
        if (!kontrolaSerija()) {
            return;
        }
        s = napuniObjekt(s);
        obrada.save(s);
        ucitajPodatkeSerija();
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void sezoneListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_sezoneListValueChanged
        
        if (evt.getValueIsAdjusting()) {
            return;
        }

        Sezona s = sezoneList.getSelectedValue();

        if (s == null) {
            return;
        }

        txtNazivSezone.setText(s.getNaziv());
        txtBrojEpizoda.setText(String.valueOf(s.getBrojepizoda()));
        txtRedniBroj.setText(String.valueOf(s.getRednibroj()));
        txtUkupanBrojEpizoda.setText(String.valueOf(s.getBrojepizoda()));
        txtPogledano.setText(String.valueOf(s.getPogledano()));
        txtOcjenaSezone.setText(String.valueOf(s.getOcjena()));
        
        if(Integer.parseInt(txtPogledano.getText())>Integer.parseInt(txtBrojEpizoda.getText())){
                txtPogledano.setText(String.valueOf(s.getBrojepizoda()));;
            }
    }//GEN-LAST:event_sezoneListValueChanged

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
       
        Serija s = serijeList.getSelectedValue();
        if (s == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite stavku");
            return;
        }
        
        obrada.delete(s);
        ucitajPodatkeSerija();
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
         
         ucitajPodatkeSezona();
         LabelPrikaz.setText(txtNaziv.getText());
         
    }//GEN-LAST:event_btnSelectActionPerformed

    private void serijeListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_serijeListValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }
        
        Serija s = serijeList.getSelectedValue();
        sifraSerije = s.getSifra();

        if (s == null) {
            return;
        }

        txtNaziv.setText(s.getNaziv());
        Query query = HibernateUtil.getSession().createQuery(
                "select sum(ocjena) from dnevnikgledanja.model.Sezona where serija=:serija and ocjena>0 and obrisano=false").setInteger("serija", sifraSerije);
        ukupnaOcjena = (Long)query.uniqueResult();
        query = HibernateUtil.getSession().createQuery(
                "select count(sifra) from dnevnikgledanja.model.Sezona where serija=:serija and ocjena>0 and obrisano=false").setInteger("serija", sifraSerije);
        ukupnoSezona = (Long)query.uniqueResult();
        prosjecnaOcjena = ukupnaOcjena / ukupnoSezona;
        txtProsjek.setText(String.valueOf(prosjecnaOcjena));
    }//GEN-LAST:event_serijeListValueChanged

    private void btnDodajSezonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajSezonuActionPerformed
        
        resetirajGreskeSezona();
        if (!kontrolaSezona()) {
            return;
        }
        Sezona sez = new Sezona();
        sez = napuniObjektSezona(sez);
        obradaSezona.save(sez);
        ucitajPodatkeSezona();
        
    }//GEN-LAST:event_btnDodajSezonuActionPerformed

    private void btnPromjeniSezonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniSezonuActionPerformed
       
        Sezona s = sezoneList.getSelectedValue();
        if (s == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite stavku");
            return;
        }

        if (txtNazivSezone.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(getRootPane(), "Obavezno naziv");
            return;
        }

        resetirajGreskeSezona();
        if (!kontrolaSezona()) {
            return;
        }
        s = napuniObjektSezona(s);
        s.setOcjena(Integer.parseInt(txtOcjenaSezone.getText()));
        obradaSezona.save(s);
        ucitajPodatkeSezona();
        
    }//GEN-LAST:event_btnPromjeniSezonuActionPerformed

    private void btnObrisiSezonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiSezonuActionPerformed
         
        Sezona s = sezoneList.getSelectedValue();
        if (s == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite stavku");
            return;
        }
        
        obradaSezona.delete(s);
        ucitajPodatkeSezona();
        
    }//GEN-LAST:event_btnObrisiSezonuActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed

        Sezona s = sezoneList.getSelectedValue();
        if(Integer.parseInt(txtPogledano.getText())==Integer.parseInt(txtBrojEpizoda.getText())){
             JOptionPane.showMessageDialog(getRootPane(), "Vrijednost ne moze biti veca od ukupnog broja epizoda.");
        }else {
            txtPogledano.setText(String.valueOf(s.getPogledano()+1));
            s.setPogledano(Integer.parseInt(txtPogledano.getText()));
            obradaSezona.save(s);
            if(Integer.parseInt(txtPogledano.getText())==Integer.parseInt(txtBrojEpizoda.getText())){
                String ocjena = JOptionPane.showInputDialog("Ocijenite sezonu. 1-10");
                while(Integer.parseInt(ocjena)>10 || Integer.parseInt(ocjena)<1){
                    ocjena = JOptionPane.showInputDialog("Ocijenite sezonu. 1-10");
                }
                s.setOcjena(Integer.parseInt(ocjena));
                txtOcjenaSezone.setText(String.valueOf(s.getOcjena()));
                obradaSezona.save(s);
            }
            
        }
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        
        Sezona s = sezoneList.getSelectedValue();
        if(Integer.parseInt(txtPogledano.getText())==1){
            JOptionPane.showMessageDialog(getRootPane(), "Vrijednost ne moze biti manja od 1.");
        } else {
            txtPogledano.setText(String.valueOf(s.getPogledano()-1));
            s.setPogledano(Integer.parseInt(txtPogledano.getText()));
            obradaSezona.save(s);
        }
        
    }//GEN-LAST:event_btnMinusActionPerformed


    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelPrikaz;
    private javax.swing.JLabel brojEpizodaLabel;
    private javax.swing.JLabel brojSezonaLabel;
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnDodajSezonu;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnObrisiSezonu;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JButton btnPromjeniSezonu;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nazivLabel;
    private javax.swing.JLabel nazivSezoneLabel;
    private javax.swing.JList<Serija> serijeList;
    private javax.swing.JList<Sezona> sezoneList;
    private javax.swing.JTextField txtBrojEpizoda;
    private javax.swing.JTextField txtNaziv;
    private javax.swing.JTextField txtNazivSezone;
    private javax.swing.JTextField txtOcjenaSezone;
    private javax.swing.JTextField txtPogledano;
    private javax.swing.JTextField txtProsjek;
    private javax.swing.JTextField txtRedniBroj;
    private javax.swing.JTextField txtUkupanBrojEpizoda;
    // End of variables declaration//GEN-END:variables
    
     private void ucitajPodatkeSerija() {
        DefaultListModel<Serija> modelSerija = new DefaultListModel<>();
        List<Serija> lista = HibernateUtil.getSession().createQuery(
                "from dnevnikgledanja.model.Serija where korisnik=:korisnik and obrisano=false").setInteger("korisnik", sifraKorisnika).list();

        for (Serija s : lista) {
            modelSerija.addElement(s);
        }

        this.serijeList.setModel(modelSerija);

    }
     
    private void ucitajPodatkeSezona() {
        Serija ser = serijeList.getSelectedValue();
        sifraSerije = ser.getSifra();
        DefaultListModel<Sezona> modelSezona = new DefaultListModel<>();

        List<Sezona> lista = HibernateUtil.getSession().createQuery(
                "from dnevnikgledanja.model.Sezona where serija=:serija and obrisano=false").setInteger("serija", sifraSerije).list();

        for (Sezona s : lista) {
            modelSezona.addElement(s);
        }

        this.sezoneList.setModel(modelSezona);

    }
    
}