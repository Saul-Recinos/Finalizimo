/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saulr
 */
public class JDVenta extends javax.swing.JDialog {
    Conexion cx = new Conexion();
    Connection cc = cx.conectar();
    DefaultTableModel model = new DefaultTableModel();
    DefaultTableModel tx = null;
    /**
     * Creates new form JDVenta
     */
    public JDVenta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtventa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtproducto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtpu = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtnit = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tventa = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tproducto = new javax.swing.JTable();
        btnagregar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnfin = new javax.swing.JButton();
        btnmostar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Venta");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Id Venta");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));
        getContentPane().add(txtventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 150, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre Producto");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        txtproducto.setEnabled(false);
        getContentPane().add(txtproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 150, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio Unitario");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, -1, -1));

        txtpu.setEnabled(false);
        txtpu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpuActionPerformed(evt);
            }
        });
        getContentPane().add(txtpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 160, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, -1, -1));

        txttotal.setEnabled(false);
        getContentPane().add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, 150, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nit");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        txtnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnitActionPerformed(evt);
            }
        });
        getContentPane().add(txtnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 160, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nombre");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 240, 50));

        tventa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tventa);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 520, -1));

        tproducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tproducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tproductoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tproducto);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, -1, 310));

        btnagregar.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnagregar.setForeground(new java.awt.Color(255, 255, 255));
        btnagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/Imagenes/car.png"))); // NOI18N
        btnagregar.setText("Agregar");
        btnagregar.setContentAreaFilled(false);
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        btneliminar.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btneliminar.setForeground(new java.awt.Color(255, 255, 255));
        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/Imagenes/carx.png"))); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.setContentAreaFilled(false);
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));

        btnfin.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnfin.setForeground(new java.awt.Color(255, 255, 255));
        btnfin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/Imagenes/listo.png"))); // NOI18N
        btnfin.setText("Finalizar");
        btnfin.setContentAreaFilled(false);
        btnfin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinActionPerformed(evt);
            }
        });
        getContentPane().add(btnfin, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 180, 50));

        btnmostar.setText("Mostar Productos");
        btnmostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostarActionPerformed(evt);
            }
        });
        getContentPane().add(btnmostar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Visualizaci??n de Productos");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cantidad");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));
        getContentPane().add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 172, 140, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/Imagenes/stonk.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnitActionPerformed

    private void btnfinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnfinActionPerformed

    private void txtpuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpuActionPerformed

    private void tproductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tproductoMouseClicked
        // TODO add your handling code here:
        int fila = tproducto.getSelectedRow();
        //Hacemos una condicional para saber si el numero es mayor o igual a 0, esto porque el numero de la fila no puede ser negativo
        String NombreProducto = tproducto.getValueAt(fila, 1).toString();
        String PrecioVenta = tproducto.getValueAt(fila, 2).toString();
        txtproducto.setText(NombreProducto);
        txtpu.setText(PrecioVenta);      
    }//GEN-LAST:event_tproductoMouseClicked
public void mostrar() {
        String[] titulos = {"IdProducto","NombreProducto","PrecioVenta"};
        String[] re = new String[3];
        String sql = "select*from productos";
        tx = new DefaultTableModel(null, titulos);
        try {          
            Statement st = cc.createStatement();
            ResultSet r = st.executeQuery(sql);
            while (r.next()) {
                re[0] = r.getString("IdProducto");
                re[1] = r.getString("NombreProducto");
                re[2] = r.getString("PrecioVenta");
                tx.addRow(re);
            }
            tproducto.setModel(tx);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
      public void mostrar1() {
        String[] titulos = {"IdVenta","NombreProducto", "Cantidad", "PrecioUnitario", "Total", "Nit", "Nombre"};
        String[] re = new String[7];
        String sql = "select*from venta";
        tx = new DefaultTableModel(null, titulos);
        try {          
            Statement st = cc.createStatement();
            ResultSet r = st.executeQuery(sql);
            while (r.next()) {
                re[0] = r.getString("IdVenta");
                re[1] = r.getString("NombreProducto");
                re[2] = r.getString("Cantidad");
                re[3] = r.getString("PrecioUnitario");
                re[4] = r.getString("Total");
                re[5] = r.getString("Nit");
                re[6] = r.getString("Nombre");
                tx.addRow(re);
            }
            tventa.setModel(tx);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void btnmostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostarActionPerformed
        // TODO add your handling code here:
        mostrar();
    }//GEN-LAST:event_btnmostarActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // TODO add your handling code here:
        double v1,v2,mult;
     v1=Double.parseDouble(txtpu.getText());
     v2=Double.parseDouble(txtcantidad.getText());
     mult=v1*v2; 
     txttotal.setText(""+mult);
     try {
            String sql = "Insert into venta values('" + txtventa.getText() + "','" + txtproducto.getText() + "','" + txtcantidad.getText() + "','" + txtpu.getText() + "','"
                    + txttotal.getText() + "','"
                    + txtnit.getText() + "','"
                    + txtnombre.getText() + "')";
            PreparedStatement pp = cc.prepareStatement(sql);
            pp.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos insertados");
            mostrar1();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        
    }    
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "delete from venta where IdVenta='" + txtventa.getText() + "'";
            PreparedStatement p = cc.prepareStatement(sql);
            p.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Eliminados");
            mostrar1();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btneliminarActionPerformed

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
            java.util.logging.Logger.getLogger(JDVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDVenta dialog = new JDVenta(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnfin;
    private javax.swing.JButton btnmostar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tproducto;
    private javax.swing.JTable tventa;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtnit;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtproducto;
    private javax.swing.JTextField txtpu;
    private javax.swing.JTextField txttotal;
    private javax.swing.JTextField txtventa;
    // End of variables declaration//GEN-END:variables
}
