/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Logica.GestionArchivosCSV;
import Logica.GestionDeCarreras;
import Logica.GestionDeCorredores;
import Logica.SingletonGestionCarreras;
import Logica.SingletonGestionCorredores;
import Modelo.Corredor;
import java.io.IOException;
import java.text.ParseException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alumnop
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    private GestionDeCorredores gdCorredores;
    private GestionDeCarreras gdCarreras;
    private GestionArchivosCSV gacsv;

    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        //gdc = new GestionDeCorredores();
        gdCorredores = SingletonGestionCorredores.getInstance();
        gdCarreras = SingletonGestionCarreras.getInstance();
        gacsv = new GestionArchivosCSV();
        try {
            gdCorredores.importarCorredores(gacsv.leerFichero("corredores.txt"));
        } catch (ParseException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanelCorredor = new javax.swing.JPanel();
        jLabelCorredores = new javax.swing.JLabel();
        jButtonAlta = new javax.swing.JButton();
        jButtonListadoCoredores = new javax.swing.JButton();
        jPanelCarreras = new javax.swing.JPanel();
        jLabelCarreras = new javax.swing.JLabel();
        jButtonAltaCarrera = new javax.swing.JButton();
        jButtonListadoCarrera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelCorredores.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabelCorredores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCorredores.setText("Corredores");

        jButtonAlta.setText("Alta de corredores");
        jButtonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltaActionPerformed(evt);
            }
        });

        jButtonListadoCoredores.setText("Listado de corredores");
        jButtonListadoCoredores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListadoCoredoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCorredorLayout = new javax.swing.GroupLayout(jPanelCorredor);
        jPanelCorredor.setLayout(jPanelCorredorLayout);
        jPanelCorredorLayout.setHorizontalGroup(
            jPanelCorredorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCorredorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCorredorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCorredores, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                    .addComponent(jButtonAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonListadoCoredores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelCorredorLayout.setVerticalGroup(
            jPanelCorredorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCorredorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCorredores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAlta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonListadoCoredores)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelCarreras.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabelCarreras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCarreras.setText("Carreras");

        jButtonAltaCarrera.setText("Alta de carreras");
        jButtonAltaCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltaCarreraActionPerformed(evt);
            }
        });

        jButtonListadoCarrera.setText("Listado de carreras");
        jButtonListadoCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListadoCarreraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCarrerasLayout = new javax.swing.GroupLayout(jPanelCarreras);
        jPanelCarreras.setLayout(jPanelCarrerasLayout);
        jPanelCarrerasLayout.setHorizontalGroup(
            jPanelCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCarrerasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCarreras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAltaCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonListadoCarrera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelCarrerasLayout.setVerticalGroup(
            jPanelCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCarrerasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCarreras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAltaCarrera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonListadoCarrera)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelCarreras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCorredor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltaActionPerformed
        AltaCorredor altacorredor = new AltaCorredor(this, true, gdCorredores, gacsv);
        altacorredor.setVisible(true);
        gacsv.abrirFicheroEscritura("corredores.txt", false);
        try {
            gacsv.escribirCadena(gdCorredores.cadenaCsv());
        } catch (IOException ex) {
            Logger.getLogger(ListadoCorredor.class.getName()).log(Level.SEVERE, null, ex);
        }
        gacsv.cerrarFicheroEscritura();
    }//GEN-LAST:event_jButtonAltaActionPerformed

    private void jButtonListadoCoredoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListadoCoredoresActionPerformed
        ListadoCorredor listadoCorredor = null;
        try {
            listadoCorredor = new ListadoCorredor(this, true, gdCorredores, gacsv);
        } catch (ParseException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        listadoCorredor.setVisible(true);
    }//GEN-LAST:event_jButtonListadoCoredoresActionPerformed

    private void jButtonAltaCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltaCarreraActionPerformed
        AltaCarrera altaCarrera = new AltaCarrera(this, true, gdCarreras);
        altaCarrera.setVisible(true);
    }//GEN-LAST:event_jButtonAltaCarreraActionPerformed

    private void jButtonListadoCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListadoCarreraActionPerformed
        ListadoCarrera listadoCarrera = new ListadoCarrera(this, true);
        listadoCarrera.setVisible(true);
    }//GEN-LAST:event_jButtonListadoCarreraActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Locale.setDefault(new Locale("es", "ES"));
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlta;
    private javax.swing.JButton jButtonAltaCarrera;
    private javax.swing.JButton jButtonListadoCarrera;
    private javax.swing.JButton jButtonListadoCoredores;
    private javax.swing.JLabel jLabelCarreras;
    private javax.swing.JLabel jLabelCorredores;
    private javax.swing.JPanel jPanelCarreras;
    private javax.swing.JPanel jPanelCorredor;
    // End of variables declaration//GEN-END:variables
}
