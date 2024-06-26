/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.consultas;


import java.sql.DriverManager;

import com.funciones.Api;
import com.login.biblio_funciones;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.Desktop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;



public class Consultas extends javax.swing.JInternalFrame {

        public static JPanel rentas_por_periodo = new JPanel();
        public static JPanel compras_por_periodo = new JPanel();
        public static JPanel localizar_libro = new JPanel();
        public static String consulta = "";
        //Jspinner con modelo de fecha
        public static JSpinner fecha_inicio = new JSpinner(new javax.swing.SpinnerDateModel());
        public static JSpinner fecha_fin = new JSpinner(new javax.swing.SpinnerDateModel());
        public static JSpinner fecha_inicio2 = new JSpinner(new javax.swing.SpinnerDateModel());
        public static JSpinner fecha_fin2 = new JSpinner(new javax.swing.SpinnerDateModel());


    public Consultas() {
        initComponents();

        //Rentas por periodo
        rentas_por_periodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Rentas por periodo"));
        rentas_por_periodo.add(new javax.swing.JLabel("Fecha inicio:"));
        rentas_por_periodo.add(fecha_inicio);
        rentas_por_periodo.add(new javax.swing.JLabel("Fecha fin:"));
        rentas_por_periodo.add(fecha_fin);

        //Compras por periodo
        compras_por_periodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Compras por periodo"));
        compras_por_periodo.add(new javax.swing.JLabel("Fecha inicio:"));
        compras_por_periodo.add(fecha_inicio2);
        compras_por_periodo.add(new javax.swing.JLabel("Fecha fin:"));
        compras_por_periodo.add(fecha_fin2);

        
        jInternalFrame1.setLayout(new GridLayout(1,1));
        jInternalFrame1.setBackground(new Color(255, 255, 255, 0));
        jInternalFrame1.setTitle("INGRESE LOS PARAMETROS QUE SE SOLICITAN");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jButton1 = new javax.swing.JButton();

        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        background.setBackground(new java.awt.Color(0, 102, 153));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CONSULTAS");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setText("Seleccione una consulta:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ventas/Rentas en un periodo.", "Compras en un periodo.", "Localizacion Libros", "Autores", "Proveedores" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
        );

        jButton1.setText("CONSULTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 530, 380));

        getContentPane().add(background);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        //Cuando se seleccione una opcion del combobox se mostrara el panel correspondiente con los parametros necesarios
        switch(jComboBox1.getSelectedIndex()){
            case 0 -> {
                limpiar();
                consulta = "rentas_por_periodo";
                jInternalFrame1.add(rentas_por_periodo);
                rentas_por_periodo.setVisible(true);
                jInternalFrame1.pack();
            }
            case 1 -> {
                limpiar();
                consulta = "compras_por_periodo";
                jInternalFrame1.add(compras_por_periodo);
                compras_por_periodo.setVisible(true);
                jInternalFrame1.pack();

            }

        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Api a = new Api();
          switch(jComboBox1.getSelectedIndex()){
            case 0 -> {
                limpiar();
                consulta = "rentas_por_periodo";
                //Sacar los datos de los jspiner y darles formato (yyyy-mm-dd)
                SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                String fechaini = formato.format(fecha_inicio.getValue());
                String fechafin = formato.format(fecha_inicio.getValue());

                //Obtener los datos de la consulta
                String pdfBase64=a.obtener("/obtener_reservaciones/"+fechaini+"/"+fechafin);
                //Convertir el base64 a pdf
                String nombre_pdf="rentas_por_periodo";
                base64ToPdf(pdfBase64, "rentas_por_periodo");
                //Abrir el pdf  sin bibliofunciones
                mostrarPDF(nombre_pdf);

            }
            case 1 -> {
                limpiar();
   
                SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                String fechaini = formato.format(fecha_inicio2.getValue());
                String fechafin = formato.format(fecha_fin2.getValue());
                  //Obtener los datos de la consulta
                String pdfBase64=a.obtener("/obtener_compras/"+fechaini+"/"+fechafin);
                //Convertir el base64 a pdf
                String nombre_pdf="compras_por_periodo";
                base64ToPdf(pdfBase64, "compras_por_periodo");
                //Abrir el pdf  sin bibliofunciones
                mostrarPDF(nombre_pdf);
            }
            case 2 -> {
                limpiar();
                String pdfBase64=a.obtener("/localizarLibros");
                //Convertir el base64 a pdf
                String nombre_pdf="librosEstantes";
                base64ToPdf(pdfBase64, "librosEstantes");
                //Abrir el pdf  sin bibliofunciones
                mostrarPDF(nombre_pdf);
            }
            case 3 -> {
                limpiar();
                String pdfBase64=a.obtener("/reporteAutores");
                //Convertir el base64 a pdf
                String nombre_pdf="reporteAutores";
                base64ToPdf(pdfBase64, "reporteAutores");
                //Abrir el pdf  sin bibliofunciones
                mostrarPDF(nombre_pdf);
            }
            case 4 -> {
                limpiar();
                String pdfBase64=a.obtener("/reporteProveedores");
                //Convertir el base64 a pdf
                String nombre_pdf="reporteProveedores";
                base64ToPdf(pdfBase64, "reporteProveedores");
                //Abrir el pdf  sin bibliofunciones
                mostrarPDF(nombre_pdf);
            
            }
            default -> biblio_funciones.mensaje("Opcion no valida", "ERROR", 2);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void base64ToPdf(String base64,String nombre)
    {
        try {
            byte[] decodedBytes = Base64.getDecoder().decode(base64);
            FileOutputStream fos = new FileOutputStream("src/Reportes/"+nombre+".pdf");
            fos.write(decodedBytes);
            fos.flush();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void mostrarPDF(String nombre){
        try {
            File path = new File ("src/Reportes/"+nombre+".pdf");
            Desktop.getDesktop().open(path);
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void limpiar(){
        //Verificar cual es la consulta seleccionada y limpiar los campos correspondientes
        //Si no se ha seleccionado ninguna consulta no se hara nada
            switch(consulta){
                case "rentas_por_periodo" -> jInternalFrame1.remove(rentas_por_periodo);
                case "compras_por_periodo" -> jInternalFrame1.remove(compras_por_periodo);
                
            }
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
