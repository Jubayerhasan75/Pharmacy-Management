/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagement;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class Inventory extends JFrame {
    public Inventory() {
        JPanel jPanel1 = new javax.swing.JPanel();
        JLabel jLabel1 = new javax.swing.JLabel();
        JLabel jLabel3 = new javax.swing.JLabel();
        JLabel jLabel4 = new javax.swing.JLabel();
        JLabel jLabel12 = new javax.swing.JLabel();
        JLabel jLabel15 = new javax.swing.JLabel();
        JLabel jLabel16 = new javax.swing.JLabel();
        JLabel jLabel17 = new javax.swing.JLabel();
        JLabel jLabel18 = new javax.swing.JLabel();
        JTextField jTextField1 = new javax.swing.JTextField();
        JTextField jTextField2 = new javax.swing.JTextField();
        JTextField jTextField3 = new javax.swing.JTextField();
        JSpinner jSpinner1 = new javax.swing.JSpinner();
        JTextField jTextField4 = new javax.swing.JTextField();
        JTextField jTextField5 = new javax.swing.JTextField();
        JTextField jTextField7 = new javax.swing.JTextField();
        JButton jButton1 = new javax.swing.JButton();
        JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        JTable jTable1 = new javax.swing.JTable();
        JButton jButton2 = new javax.swing.JButton();
        JButton jButton3 = new javax.swing.JButton();
        JButton jButton4 = new javax.swing.JButton();
        JButton jButton6 = new javax.swing.JButton();
        JLabel jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1314, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("                       Inventory");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 780, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Drug Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, 30));


        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Price");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 70, 20));


        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 147, -1, 30));


        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 166, 80, 20));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("All Price");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(731, 230, 70, 30));


        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(733, 307, 60, 30));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 380, 30));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 380, 30));


        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 230, 380, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Add");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, -1, -1));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DrugName", "Price", "Full Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 700, 370));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Print Invoice");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 400, -1, -1));


        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Back");
        jButton3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                setVisible(false);
                new Homepage();
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 720, -1, -1));


        
        setSize(new Dimension(1310, 810));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
