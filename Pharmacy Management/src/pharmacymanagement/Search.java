package pharmacymanagement;

import java.awt.Dimension;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Search extends JFrame {

    public Search() {
        JLabel jLabel1 = new javax.swing.JLabel();
        TextField textField1 = new java.awt.TextField();
        JButton jButton1 = new javax.swing.JButton();
        JButton jButton3 = new javax.swing.JButton();
        JLabel jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Search Medicine");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, 43));

        textField1.setText("");
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });
        getContentPane().add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 135, 386, 37));

        jButton1.setText("Search");
        jButton1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                searchMedicine(textField1.getText());
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(832, 133, 80, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Back");
        jButton3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                setVisible(false);
                new Homepage();
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 620, -1, -1));

        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 770));
        setSize(new Dimension(1081, 800));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void searchMedicine(String medicineName) {
        if ("Napa".equalsIgnoreCase(medicineName)) {
            setVisible(false);
            new Napa();
        } else if ("Pantobex".equalsIgnoreCase(medicineName)) {
            setVisible(false);
            new Pantobexx();
        } else if ("Ace".equalsIgnoreCase(medicineName)) {
            setVisible(false);
            new Ace();
        } else if ("Ambrox".equalsIgnoreCase(medicineName)) {
            setVisible(false);
            new Ambroxx();
        } else if ("Seclo".equalsIgnoreCase(medicineName)) {
            setVisible(false);
            new Secloo();
        } else if ("Fexo".equalsIgnoreCase(medicineName)) {
            setVisible(false);
            new Fexoo();
        }else {
            // Handle case where medicine is not found
            JOptionPane.showMessageDialog(null, "Product not available");
        }
    }

    public static void main(String[] args) {
        new Search();
    }
}
