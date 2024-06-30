package visuals;

public class LayoutCliente extends javax.swing.JFrame {

    public LayoutCliente() {
        initComponents();
        this.setLocationRelativeTo(bg);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        bg = new javax.swing.JPanel();
        pnlNavLat = new javax.swing.JPanel();
        lblUserType = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        iconUser = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        pnlNavSup = new javax.swing.JPanel();
        pnlBody = new javax.swing.JPanel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlNavLat.setBackground(new java.awt.Color(51, 0, 0));
        pnlNavLat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUserType.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblUserType.setText("Cliente");
        pnlNavLat.add(lblUserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, 25));

        lblUserName.setText("User01");
        pnlNavLat.add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 170, 25));
        pnlNavLat.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 280, 45));

        iconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/iconUser.png"))); // NOI18N
        pnlNavLat.add(iconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 80));

        btnCerrarSesion.setBackground(new java.awt.Color(102, 0, 0));
        btnCerrarSesion.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("CERRAR SESIÓN");
        btnCerrarSesion.setBorder(null);
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseClicked(evt);
            }
        });
        pnlNavLat.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 660, 160, 50));

        bg.add(pnlNavLat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 768));

        pnlNavSup.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout pnlNavSupLayout = new javax.swing.GroupLayout(pnlNavSup);
        pnlNavSup.setLayout(pnlNavSupLayout);
        pnlNavSupLayout.setHorizontalGroup(
            pnlNavSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1066, Short.MAX_VALUE)
        );
        pnlNavSupLayout.setVerticalGroup(
            pnlNavSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        bg.add(pnlNavSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1066, -1));

        pnlBody.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlBodyLayout = new javax.swing.GroupLayout(pnlBody);
        pnlBody.setLayout(pnlBodyLayout);
        pnlBodyLayout.setHorizontalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1066, Short.MAX_VALUE)
        );
        pnlBodyLayout.setVerticalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );

        bg.add(pnlBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 1066, 668));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        this.setVisible(false);
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JLabel iconUser;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUserType;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JPanel pnlNavLat;
    private javax.swing.JPanel pnlNavSup;
    // End of variables declaration//GEN-END:variables
}
