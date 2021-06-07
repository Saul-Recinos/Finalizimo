/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author saulr
 */
public class Conexion {
    public Connection conectar() {
        Connection cx = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            cx = DriverManager.getConnection("jdbc:mysql://localhost/basefinal", "root", "");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return cx;
    }
}
