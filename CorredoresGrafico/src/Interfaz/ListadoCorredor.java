/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Interfaz.Tablemodels.TableModelCorredores;
import Logica.GestionArchivosCSV;
import Logica.GestionDeCarreras;
import Logica.GestionDeCorredores;
import Modelo.Corredor;
import java.io.IOException;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alumnop
 */
public class ListadoCorredor extends javax.swing.JDialog {

    private GestionDeCorredores gdCorredores;
    private GestionDeCarreras gdCarreras;
    private GestionArchivosCSV gacsv;
    private int numMax, idCarrera;

    /**
     * Creates new form ListadoCorredor
     */
    public ListadoCorredor(java.awt.Frame parent, boolean modal,
            GestionDeCorredores gdCorredores, GestionArchivosCSV gacsv) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.gdCorredores = gdCorredores;
        this.gacsv = gacsv;
        rellenarTablaCorredores();
    }

    public ListadoCorredor(java.awt.Dialog parent, boolean modal,
            GestionDeCarreras gdCarreras, GestionDeCorredores gdCorredores, int idCarrera) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.gdCarreras = gdCarreras;
        this.gdCorredores = gdCorredores;
        this.idCarrera = idCarrera;
        this.numMax = gdCarreras.getListaCarreras().get(idCarrera).getNumMaxParticipantes();
        jButtonModificar.setText("Agregar corredores");
        jButtonBorrar.setVisible(false);
        rellenarTablaCorredores();
    }

    private void rellenarTablaCorredores() {
        jTableCorredores.setModel(new TableModelCorredores(gdCorredores.getCorredores()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCorredores = new javax.swing.JTable();
        jLabelTitle = new javax.swing.JLabel();
        jButtonBorrar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableCorredores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane2.setViewportView(jTableCorredores);

        jLabelTitle.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Listado de corredores");

        jButtonBorrar.setText("Borrar");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jButtonBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jLabelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jLabelTitle)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jButtonModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonBorrar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        int seleccionado = jTableCorredores.getSelectedRow();
        if (seleccionado == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona un corredor");
        } else {
            Corredor corredorSeleccionado = gdCorredores.getCorredores().get(seleccionado);
            gdCorredores.borrarCorredor(corredorSeleccionado.getDni());
            rellenarTablaCorredores();
            gacsv.abrirFicheroEscritura("corredores.txt", false);
            try {
                gacsv.escribirCadena(gdCorredores.cadenaCsv());
            } catch (IOException ex) {
                Logger.getLogger(ListadoCorredor.class.getName()).log(Level.SEVERE, null, ex);
            }
            gacsv.cerrarFicheroEscritura();
        }
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        if (gdCarreras != null) {
            if (numMax > gdCarreras.getListaCarreras().get(idCarrera).getListaCorredores().size()) {
                int seleccionado = jTableCorredores.getSelectedRow();
                if (seleccionado == -1) {
                    JOptionPane.showMessageDialog(this, "Selecciona un corredor");
                } else {
                    Corredor corredorSeleccionado = gdCorredores.getCorredores().get(seleccionado);
                    boolean agregarCorredor = gdCarreras.agregarCorredor(idCarrera, corredorSeleccionado);
                    if (agregarCorredor) {
                        JOptionPane.showMessageDialog(this, "Corredor agregado");
                    } else {
                        JOptionPane.showMessageDialog(this, " El corredor ya paraticipa en la carrera");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "No quedan plazas");
            }

        } else {
            int seleccionado = jTableCorredores.getSelectedRow();
            if (seleccionado == -1) {
                JOptionPane.showMessageDialog(this, "Selecciona un corredor");
            } else {
                Corredor corredorSeleccionado = gdCorredores.getCorredores().get(seleccionado);
                AltaCorredor altaCorredorModificar = new AltaCorredor(this, true, corredorSeleccionado);
                altaCorredorModificar.setVisible(true);
                rellenarTablaCorredores();
                gacsv.abrirFicheroEscritura("corredores.txt", false);
                try {
                    gacsv.escribirCadena(gdCorredores.cadenaCsv());
                } catch (IOException ex) {
                    Logger.getLogger(ListadoCorredor.class.getName()).log(Level.SEVERE, null, ex);
                }
                gacsv.cerrarFicheroEscritura();
            }
        }

    }//GEN-LAST:event_jButtonModificarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCorredores;
    // End of variables declaration//GEN-END:variables
}
