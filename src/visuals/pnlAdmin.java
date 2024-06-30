package visuals;

public class pnlAdmin extends javax.swing.JPanel {

    public pnlAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(51, 51, 51));
        lblUsuario.setText("USUARIO");
        add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 290, 30));

        lblContraseña.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(51, 51, 51));
        lblContraseña.setText("CONTRASEÑA");
        add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        txtContraseña.setBackground(new java.awt.Color(255, 255, 255));
        txtContraseña.setForeground(new java.awt.Color(0, 0, 0));
        add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 290, 30));
    }// </editor-fold>//GEN-END:initComponents

    public String getUsername() {
        return txtUsuario.getText();
    }

    public String getPassword() {
        return new String(txtContraseña.getPassword());
    }
    
    public void clearPassword() {
        txtContraseña.setText("");
    }
    public void clearUserName() {
        txtUsuario.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
