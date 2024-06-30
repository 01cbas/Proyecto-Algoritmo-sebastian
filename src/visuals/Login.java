
package visuals;

import DAO.implementaciones.LoginDAOImpl;
import DAO.interfaces.LoginDAO;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import modelos.LoginModel;

public class Login extends javax.swing.JFrame {
    
    ImageIcon imagen;
    Icon icono;
    int xMouse, yMouse;
    private pnlAdmin admin;
    boolean isAdmin;

    public Login() {
        isAdmin=true;
        initComponents();
        this.setLocationRelativeTo(null);
        pintarImagen(lblAlan, "src/multimedia/alan.jpg");
        admin = new pnlAdmin();
        admin.setSize(400, 320);
        admin.setLocation(0, 0);
        pnlContent.removeAll();
        pnlContent.add(admin, BorderLayout.CENTER);
        pnlContent.revalidate();
        pnlContent.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        pnlLateral = new javax.swing.JPanel();
        lblAlan = new javax.swing.JLabel();
        pnlSup = new javax.swing.JPanel();
        pnlExit = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        pnlContent = new javax.swing.JPanel();
        btnAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLateral.setBackground(new java.awt.Color(51, 0, 0));

        lblAlan.setBackground(new java.awt.Color(255, 255, 255));
        lblAlan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlLateralLayout = new javax.swing.GroupLayout(pnlLateral);
        pnlLateral.setLayout(pnlLateralLayout);
        pnlLateralLayout.setHorizontalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAlan, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlLateralLayout.setVerticalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLateralLayout.createSequentialGroup()
                .addContainerGap(304, Short.MAX_VALUE)
                .addComponent(lblAlan, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bg.add(pnlLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 300, -1));

        pnlSup.setBackground(new java.awt.Color(255, 255, 255));
        pnlSup.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlSupMouseDragged(evt);
            }
        });
        pnlSup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlSupMousePressed(evt);
            }
        });

        pnlExit.setBackground(new java.awt.Color(255, 255, 255));

        lblExit.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        lblExit.setForeground(new java.awt.Color(0, 0, 0));
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setText("X");
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.setMaximumSize(new java.awt.Dimension(35, 35));
        lblExit.setMinimumSize(new java.awt.Dimension(35, 35));
        lblExit.setPreferredSize(new java.awt.Dimension(35, 35));
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlExitLayout = new javax.swing.GroupLayout(pnlExit);
        pnlExit.setLayout(pnlExitLayout);
        pnlExitLayout.setHorizontalGroup(
            pnlExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
            .addGroup(pnlExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblExit, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
        );
        pnlExitLayout.setVerticalGroup(
            pnlExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
            .addGroup(pnlExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblExit, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlSupLayout = new javax.swing.GroupLayout(pnlSup);
        pnlSup.setLayout(pnlSupLayout);
        pnlSupLayout.setHorizontalGroup(
            pnlSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSupLayout.createSequentialGroup()
                .addComponent(pnlExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 665, Short.MAX_VALUE))
        );
        pnlSupLayout.setVerticalGroup(
            pnlSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bg.add(pnlSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 35));

        lblTitulo.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("INICIAR SESIÓN");
        bg.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, -1));

        btnIngresar.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        btnIngresar.setText("INGRESAR");
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });
        bg.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 130, 40));

        btnCliente.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        btnCliente.setText("CLIENTE");
        btnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClienteMouseClicked(evt);
            }
        });
        bg.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 110, 40));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 330, 10));

        pnlContent.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        bg.add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 400, 230));

        btnAdmin.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        btnAdmin.setText("ADMIN");
        btnAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminMouseClicked(evt);
            }
        });
        bg.add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 110, 40));

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

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        pnlExit.setBackground(Color.red);
        lblExit.setForeground(Color.white);
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        pnlExit.setBackground(Color.white);
        lblExit.setForeground(Color.black);
    }//GEN-LAST:event_lblExitMouseExited

    private void pnlSupMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSupMouseDragged
        int x,y;
        x=evt.getXOnScreen();
        y=evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_pnlSupMouseDragged

    private void pnlSupMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSupMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_pnlSupMousePressed

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
        if (isAdmin) {
            String user = admin.getUsername();
            String password = admin.getPassword();
            if (user.isEmpty() || password.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Debe ingresar un usuario y una contraseña. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                admin.clearPassword();
                return;
            }
            LoginModel login = new LoginModel();
            login.setUserName(user);
            LoginDAO dao = new LoginDAOImpl();
            try {
                login = (LoginModel) dao.readBy(login);
                if(login.getPassword().equals(password)){
                    LayoutAdmin layoutAdmin = new LayoutAdmin();
                    layoutAdmin.setVisible(true);
                    this.setVisible(false);
                } else{
                    JOptionPane.showMessageDialog(null,"contraseña incorrecta");
                    admin.clearPassword();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"la cuenta no existe");
                admin.clearUserName();
                admin.clearPassword();
            }
        }else{
            LayoutCliente layoutCliente = new LayoutCliente();
            layoutCliente.setVisible(true);
        }
    }//GEN-LAST:event_btnIngresarMouseClicked

    private void btnClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseClicked
        isAdmin=false;
        pnlCliente cliente = new pnlCliente();
        cliente.setSize(400, 320);
        cliente.setLocation(0, 0);
        pnlContent.removeAll();
        pnlContent.add(cliente, BorderLayout.CENTER);
        pnlContent.revalidate();
        pnlContent.repaint();
    }//GEN-LAST:event_btnClienteMouseClicked

    private void btnAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseClicked
        isAdmin=true;
        admin = new pnlAdmin();
        admin.setSize(400, 320);
        admin.setLocation(0, 0);
        pnlContent.removeAll();
        pnlContent.add(admin, BorderLayout.CENTER);
        pnlContent.revalidate();
        pnlContent.repaint();
    }//GEN-LAST:event_btnAdminMouseClicked

    private void pintarImagen(JLabel lbl, String ruta){
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(
            this.imagen.getImage()
            .getScaledInstance(
                    lbl.getWidth(), 
                    lbl.getHeight(), 
                    Image.SCALE_DEFAULT
            )
        );
        lbl.setIcon(this.icono);
        this.repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAlan;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlExit;
    private javax.swing.JPanel pnlLateral;
    private javax.swing.JPanel pnlSup;
    // End of variables declaration//GEN-END:variables
}