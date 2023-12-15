
package product.management;

import Database.*;

public class Frame_main extends javax.swing.JFrame {

  
    public Frame_main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnLogInMenu = new javax.swing.JRadioButtonMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        jMenu7.setText("File");
        jMenuBar2.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar2.add(jMenu8);

        jMenu9.setText("File");
        jMenuBar3.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar3.add(jMenu10);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trang chủ");
        setLocation(new java.awt.Point(300, 100));

        jMenu1.setText("Tài khoản");

        btnLogInMenu.setSelected(true);
        btnLogInMenu.setText("Đăng nhập");
        btnLogInMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInMenuActionPerformed(evt);
            }
        });
        jMenu1.add(btnLogInMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lý");
        jMenu2.setEnabled(false);
        jMenuBar1.add(jMenu2);

        jMenu5.setText("Mua hàng");
        jMenu5.setEnabled(false);
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Trợ giúp");
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 696, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogInMenuActionPerformed(java.awt.event.ActionEvent evt) {                                             
        Frame_login frameLogIn = new Frame_login();
        frameLogIn.setVisible(true);
        frameLogIn.setLocationRelativeTo(null);
    }

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_main().setVisible(true);
            }
        });
        Connect.connectDB();

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButtonMenuItem btnLogInMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    // End of variables declaration//GEN-END:variables
}
