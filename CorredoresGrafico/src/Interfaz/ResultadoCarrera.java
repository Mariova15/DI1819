/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Interfaz.Tablemodels.TableModelCarreras;
import Interfaz.Tablemodels.TableModelResultado;
import Logica.GestionArchivosCSV;
import Logica.GestionDeCarreras;
import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.openide.util.Exceptions;

/**
 *
 * @author Mario
 */
public class ResultadoCarrera extends javax.swing.JDialog {

    private GestionDeCarreras gdCarreras;
    private int idCarrera;
    private GestionArchivosCSV gacsv;

    /**
     * Creates new form ResultadoCarrera
     */
    public ResultadoCarrera(java.awt.Dialog parent, boolean modal, GestionDeCarreras gdCarreras, int idCarrera) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.gdCarreras = gdCarreras;
        this.idCarrera = idCarrera;
        
        gacsv = new GestionArchivosCSV();
        jLabelNomCarrera.setText(gdCarreras.getListaCarreras().get(idCarrera).getNombre());
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

        jPanel = new javax.swing.JPanel();
        jLabelNomCarrera = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableResultadoCarrera = new javax.swing.JTable();
        jButtonExportarResultado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelNomCarrera.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabelNomCarrera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNomCarrera.setText("jLabel1");

        jTableResultadoCarrera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jScrollPane1.setViewportView(jTableResultadoCarrera);

        jButtonExportarResultado.setText("Exportar resultado");
        jButtonExportarResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExportarResultadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNomCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                    .addComponent(jButtonExportarResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNomCarrera)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonExportarResultado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExportarResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportarResultadoActionPerformed
        try {
            System.out.println(gdCarreras.resultadoCarrera(idCarrera));
            gacsv.abrirFicheroEscritura(seleccionarDirectorio(this) + 
                    File.separator + "ResultadoCarrera" + 
                    gdCarreras.getListaCarreras().get(idCarrera).getNombre() + ".txt", false);
            gacsv.escribirCadena(gdCarreras.resultadoCarrera(idCarrera));
            gacsv.cerrarFicheroEscritura();
            JOptionPane.showMessageDialog(this, "Resultado exportado");
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }//GEN-LAST:event_jButtonExportarResultadoActionPerformed

    public String seleccionarDirectorio(Component pantalla) {
        File file = null;
        JFileChooser jc = new JFileChooser();
        this.setLocationRelativeTo(null);
        jc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int seleccion = jc.showOpenDialog(pantalla);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            file = jc.getSelectedFile();
        }
        return file.getAbsolutePath();
    }

    private void rellenarTablaCarreras() {
        jTableResultadoCarrera.setModel(new TableModelResultado(gdCarreras.getListaCarreras().get(idCarrera).getListaCorredores()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExportarResultado;
    private javax.swing.JLabel jLabelNomCarrera;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableResultadoCarrera;
    // End of variables declaration//GEN-END:variables
}
