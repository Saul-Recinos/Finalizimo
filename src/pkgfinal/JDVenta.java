/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.sql.Connection;

/**
 *
 * @author saulr
 */
public class JDVenta extends javax.swing.JDialog {
    Conexion cx = new Conexion();
    Connection cc = cx.conectar();
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
        txtagregar = new javax.swing.JButton();
        txteliminar = new javax.swing.JButton();
        txtfin = new javax.swing.JButton();
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
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));
        getContentPane().add(txtventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 82, 150, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre Producto");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));
        getContentPane().add(txtproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 150, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio Unitario");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        txtpu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpuActionPerformed(evt);
            }
        });
        getContentPane().add(txtpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 160, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));
        getContentPane().add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 150, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nit");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, -1, -1));

        txtnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnitActionPerformed(evt);
            }
        });
        getContentPane().add(txtnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 160, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nombre");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, -1, -1));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, 240, 50));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

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
        jScrollPane2.setViewportView(tproducto);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, -1, -1));

        txtagregar.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtagregar.setForeground(new java.awt.Color(255, 255, 255));
        txtagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/Imagenes/car.png"))); // NOI18N
        txtagregar.setText("Agregar");
        txtagregar.setContentAreaFilled(false);
        getContentPane().add(txtagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        txteliminar.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txteliminar.setForeground(new java.awt.Color(255, 255, 255));
        txteliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/Imagenes/carx.png"))); // NOI18N
        txteliminar.setText("Eliminar");
        txteliminar.setContentAreaFilled(false);
        getContentPane().add(txteliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));

        txtfin.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtfin.setForeground(new java.awt.Color(255, 255, 255));
        txtfin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/Imagenes/listo.png"))); // NOI18N
        txtfin.setText("Finalizar");
        txtfin.setContentAreaFilled(false);
        txtfin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfinActionPerformed(evt);
            }
        });
        getContentPane().add(txtfin, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 180, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/Imagenes/stonk.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnitActionPerformed

    private void txtfinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfinActionPerformed

    private void txtpuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpuActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tproducto;
    private javax.swing.JTable tventa;
    private javax.swing.JButton txtagregar;
    private javax.swing.JButton txteliminar;
    private javax.swing.JButton txtfin;
    private javax.swing.JTextField txtnit;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtproducto;
    private javax.swing.JTextField txtpu;
    private javax.swing.JTextField txttotal;
    private javax.swing.JTextField txtventa;
    // End of variables declaration//GEN-END:variables
}
