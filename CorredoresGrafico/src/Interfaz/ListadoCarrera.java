/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Interfaz.Tablemodels.TableModelCarreras;
import Logica.GestionDeCarreras;
import Logica.GestionDeCorredores;
import javax.swing.JOptionPane;

/**
 *
 * @author Mario
 */
public class ListadoCarrera extends javax.swing.JDialog {

    private GestionDeCarreras gdCarreras;
    private GestionDeCorredores gdCorredores;

    /**
     * Creates new form ListadoCarrera
     */
    public ListadoCarrera(java.awt.Frame parent, boolean modal, GestionDeCarreras gdCarreras, GestionDeCorredores gdCorredores) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.gdCarreras = gdCarreras;
        this.gdCorredores = gdCorredores;
        this.setLocationRelativeTo(null);
        rellenarTablaCarreras();
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
        jTableCarrera = new javax.swing.JTable();
        jLabelTitle = new javax.swing.JLabel();
        jButtonAgregar = new javax.swing.JButton();
        jButtonVerCorredores = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableCarrera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableCarrera);

        jLabelTitle.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabelTitle.setText("Listado de carreras");

        jButtonAgregar.setText("Inscribir corredores");
        jButtonAgregar.setActionCommand("Inscribir corredores en carrare");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButtonVerCorredores.setText("Ver corredores inscritos en carrera");
        jButtonVerCorredores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerCorredoresActionPerformed(evt);
            }
        });

        jButtonBorrar.setText("Borrar carrera");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jButtonModificar.setText("Modificar carrera");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jButtonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVerCorredores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonVerCorredores)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        ListadoCorredor listadoCorredor = null;
        int selectedRow = jTableCarrera.getSelectedRow();
        listadoCorredor = new ListadoCorredor(this, true, gdCarreras, gdCorredores,
                gdCarreras.getListaCarreras().get(selectedRow).getNumMaxParticipantes());
        listadoCorredor.setVisible(true);
        gdCarreras.agregarDorsalesCorredoresCarrera(gdCarreras.getListaCarreras().get(selectedRow));
        gdCarreras.borrarCorredores();
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonVerCorredoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerCorredoresActionPerformed
        int selectedRow = jTableCarrera.getSelectedRow();
        ListadoCorredorCarrera istadoCorredorCarrera = new ListadoCorredorCarrera(this, true, gdCarreras, selectedRow);
        istadoCorredorCarrera.setVisible(true);
    }//GEN-LAST:event_jButtonVerCorredoresActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        int selectedRow = jTableCarrera.getSelectedRow();
        gdCarreras.borrarCarrera(selectedRow);
        rellenarTablaCarreras();
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        int selectedRow = jTableCarrera.getSelectedRow();
        if (selectedRow != -1) {
            AltaCarrera modificarCarrera = new AltaCarrera(this, true, gdCarreras, selectedRow);
            modificarCarrera.setVisible(true);
            rellenarTablaCarreras();
        }else{
        JOptionPane.showMessageDialog(this, "Seleccione una carrera");
        }

    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void rellenarTablaCarreras() {
        jTableCarrera.setModel(new TableModelCarreras(gdCarreras.getListaCarreras()));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonVerCorredores;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCarrera;
    // End of variables declaration//GEN-END:variables
}
