
package product.management;

import javax.swing.JOptionPane;

import Database.*;

public class Frame_main extends javax.swing.JFrame {

    private String strUserName;
    private String strRoleName;
    private String email;

    public Frame_main(String email, String titleRole, String emailLogin) {
        this.strUserName = email;
        this.strRoleName = titleRole;
        this.email = emailLogin;
        initComponents();
    }

    public Frame_main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        lblUserName = new javax.swing.JLabel();
        lblUserRole = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnLogOutMenu = new javax.swing.JRadioButtonMenuItem();
        btnManageMenu = new javax.swing.JMenu();
        btnAccountMenu = new javax.swing.JRadioButtonMenuItem();
        btnProductMenu = new javax.swing.JRadioButtonMenuItem();
        btnBillMenu = new javax.swing.JRadioButtonMenuItem();
        btnBillDetailMenu = new javax.swing.JRadioButtonMenuItem();
        btnCategoryMenu = new javax.swing.JRadioButtonMenuItem();
        btnRoleMenu = new javax.swing.JRadioButtonMenuItem();
        btnPurchaseMenu = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        jMenu7.setText("File");
        jMenuBar2.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar2.add(jMenu8);

        jMenu9.setText("File");
        jMenuBar3.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar3.add(jMenu10);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Trang chủ");
        setLocation(new java.awt.Point(300, 100));

        lblUserName.setBackground(new java.awt.Color(102, 255, 102));
        lblUserName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblUserName.setText(this.strUserName);

        lblUserRole.setBackground(new java.awt.Color(102, 255, 102));
        lblUserRole.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblUserRole.setText(this.strRoleName);

        jMenu1.setText("Tài khoản");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // jMenu1ActionPerformed(evt);
            }
        });

        btnLogOutMenu.setSelected(true);
        btnLogOutMenu.setText("Đăng xuất");
        btnLogOutMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutMenuActionPerformed(evt);
            }
        });
        jMenu1.add(btnLogOutMenu);

        jMenuBar1.add(jMenu1);

        btnManageMenu.setText("Quản lý");

        btnAccountMenu.setSelected(true);
        btnAccountMenu.setText("Quản lý tài khoản");
        btnManageMenu.add(btnAccountMenu);

        btnProductMenu.setSelected(true);
        btnProductMenu.setText("Quản lý sản phẩm");
        btnManageMenu.add(btnProductMenu);

        btnBillMenu.setSelected(true);
        btnBillMenu.setText("Quản lý hóa đơn");
        btnManageMenu.add(btnBillMenu);

        btnBillDetailMenu.setSelected(true);
        btnBillDetailMenu.setText("Quản lý chi tiết hóa đơn");
        btnManageMenu.add(btnBillDetailMenu);

        btnCategoryMenu.setSelected(true);
        btnCategoryMenu.setText("Quản lý danh mục sản phẩm");
        btnManageMenu.add(btnCategoryMenu);

        btnRoleMenu.setSelected(true);
        btnRoleMenu.setText("Phân quyền");
        btnManageMenu.add(btnRoleMenu);

        jMenuBar1.add(btnManageMenu);

        btnPurchaseMenu.setText("Mua hàng");
        jMenuBar1.add(btnPurchaseMenu);

        jMenu6.setText("Trợ giúp");
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);



        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(584, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUserRole)
                    .addComponent(lblUserName))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUserRole)
                .addContainerGap(399, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String getEmail() {
        return this.strUserName;
    }

    public String getRoleName() {
        return this.strRoleName;
    }

    private void btnLogOutMenuActionPerformed(java.awt.event.ActionEvent evt) {
        int dialogResult = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn đăng xuất?", "Xác nhận đăng xuất",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            this.dispose();
            Frame_login frameLogIn = new Frame_login();
            frameLogIn.setVisible(true);
            frameLogIn.setLocationRelativeTo(null);
        }
    }
    public static void main(String args[]) {

        // java.awt.EventQueue.invokeLater(new Runnable() {
        // public void run() {
        // Frame_main framMain = new Frame_main();
        // String email = framMain.getEmail();
        // String role = framMain.getRoleName();
        // System.out.println(email);
        // System.out.println(role);
        // framMain.lblUserName.setText("1234");
        // framMain.lblUserRole.setText("234");
        // }
        // });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButtonMenuItem btnAccountMenu;
    private javax.swing.JRadioButtonMenuItem btnBillDetailMenu;
    private javax.swing.JRadioButtonMenuItem btnBillMenu;
    private javax.swing.JRadioButtonMenuItem btnCategoryMenu;
    private javax.swing.JRadioButtonMenuItem btnLogOutMenu;
    private javax.swing.JMenu btnManageMenu;
    private javax.swing.JRadioButtonMenuItem btnProductMenu;
    private javax.swing.JMenu btnPurchaseMenu;
    private javax.swing.JRadioButtonMenuItem btnRoleMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUserRole;
    // End of variables declaration//GEN-END:variables
}
