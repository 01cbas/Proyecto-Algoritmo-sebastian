package visuals;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import slots.AdministarProductos;
import slots.Inventario;
import slots.Proveedores;
import slots.Usuarios;

public class LayoutAdmin extends javax.swing.JFrame {
    
    private static LayoutAdmin instance;

    public LayoutAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        instance = this;
        Inventario inventario = new Inventario();
        switchPanel(inventario);
    }
    
    public static LayoutAdmin getInstance() {
        return instance;
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
        btnInventario = new javax.swing.JButton();
        btnAdministrar = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
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
        lblUserType.setForeground(new java.awt.Color(255, 255, 255));
        lblUserType.setText("Administrador");
        pnlNavLat.add(lblUserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, 25));

        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setText("Admin01");
        pnlNavLat.add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 170, 25));
        pnlNavLat.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 280, 45));

        iconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/iconAdmin.png"))); // NOI18N
        pnlNavLat.add(iconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 80));

        btnInventario.setBackground(new java.awt.Color(51, 0, 0));
        btnInventario.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnInventario.setForeground(new java.awt.Color(255, 255, 255));
        btnInventario.setText("INVENTARIO");
        btnInventario.setBorder(null);
        btnInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInventarioMouseClicked(evt);
            }
        });
        pnlNavLat.add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 300, 80));

        btnAdministrar.setBackground(new java.awt.Color(51, 0, 0));
        btnAdministrar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnAdministrar.setForeground(new java.awt.Color(255, 255, 255));
        btnAdministrar.setText("ADMINISTRAR PRODUCTOS");
        btnAdministrar.setBorder(null);
        btnAdministrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdministrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdministrarMouseClicked(evt);
            }
        });
        pnlNavLat.add(btnAdministrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 300, 80));

        btnUsuarios.setBackground(new java.awt.Color(51, 0, 0));
        btnUsuarios.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setText("USUARIOS");
        btnUsuarios.setBorder(null);
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseClicked(evt);
            }
        });
        pnlNavLat.add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 300, 80));

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

        btnProveedores.setBackground(new java.awt.Color(51, 0, 0));
        btnProveedores.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnProveedores.setForeground(new java.awt.Color(255, 255, 255));
        btnProveedores.setText("PROVEEDORES");
        btnProveedores.setBorder(null);
        btnProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProveedoresMouseClicked(evt);
            }
        });
        pnlNavLat.add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 300, 80));

        bg.add(pnlNavLat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 768));

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

    private void btnInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventarioMouseClicked
        Inventario inventario = new Inventario();
        switchPanel(inventario);
    }//GEN-LAST:event_btnInventarioMouseClicked

    private void btnAdministrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdministrarMouseClicked
        AdministarProductos administrar = new AdministarProductos();
        switchPanel(administrar);
    }//GEN-LAST:event_btnAdministrarMouseClicked

    private void btnUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseClicked
        Usuarios usuarios = new Usuarios();
        switchPanel(usuarios);
    }//GEN-LAST:event_btnUsuariosMouseClicked

    private void btnProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresMouseClicked
        Proveedores proveedores = new Proveedores();
        switchPanel(proveedores);
    }//GEN-LAST:event_btnProveedoresMouseClicked
    
    public final void switchPanel(JPanel panel) {
        panel.setSize(1066, 668);
        panel.setLocation(0, 0);
        pnlBody.removeAll();
        pnlBody.add(panel, BorderLayout.CENTER);
        pnlBody.revalidate();
        pnlBody.repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAdministrar;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnUsuarios;
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