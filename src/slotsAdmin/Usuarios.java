
package slotsAdmin;

import DAO.implementaciones.UserDAOImpl;
import DAO.interfaces.UserDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.UserModel;

public class Usuarios extends javax.swing.JPanel {

    public Usuarios(){
        initComponents();
        tablaUsers();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaUsers = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(820, 530));
        setPreferredSize(new java.awt.Dimension(820, 530));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre", "Apellido", "Usuario", "Contraseña"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaUsersMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TablaUsers);
        if (TablaUsers.getColumnModel().getColumnCount() > 0) {
            TablaUsers.getColumnModel().getColumn(0).setResizable(false);
            TablaUsers.getColumnModel().getColumn(0).setPreferredWidth(10);
            TablaUsers.getColumnModel().getColumn(1).setResizable(false);
            TablaUsers.getColumnModel().getColumn(2).setResizable(false);
            TablaUsers.getColumnModel().getColumn(3).setResizable(false);
            TablaUsers.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 610, 570));

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 550, 100, 50));

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 550, 100, 50));

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 550, 100, 50));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMINISTRAR USUARIOS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 290, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 320, 40));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel3.setText("NOMBRE:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, -1, -1));
        add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, 320, 40));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel6.setText("APELLIDO:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, -1, -1));
        add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, 320, 40));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel7.setText("NOMBRE DE USUARIO:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel8.setText("CONTRASEÑA:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, -1, -1));
        add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 400, 320, 40));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 290, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String name = txtNombre.getText();
        String lastName = txtApellido.getText();
        String userName = txtNombreUsuario.getText();
        String password = new String(txtContraseña.getPassword());
        if(lastName.isEmpty() || userName.isEmpty() || password.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe ingresar un usuario y una contraseña. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        UserModel user = new UserModel();
        user.setName(name);
        user.setLastName(lastName);
        user.setUserName(userName);
        user.setPassword(password);
        UserDAO dao = new UserDAOImpl();
        try {
            dao.create(user);
            JOptionPane.showMessageDialog(null, "Usuario creado correctamente");
            tablaUsers();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ah ocurrido un error, el usuario no se a creado");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int rowUser = TablaUsers.getSelectedRow();
        if(rowUser == -1){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar una fila de la tabla de usuarios. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        UserModel user = new UserModel();
        int idUser = (int) TablaUsers.getValueAt(rowUser, 0);
        user.setIdUser(idUser);
        UserDAO dao = new UserDAOImpl();
        try {
            dao.delete(user);
            JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
            tablaUsers();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ah ocurrido un error, el usuario no se a eliminado");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int rowUser = TablaUsers.getSelectedRow();
                if(rowUser == -1){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar una fila de la tabla de usuarios. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        int idUser = (int) TablaUsers.getValueAt(rowUser, 0);
        String name = txtNombre.getText();
        String lastName = txtApellido.getText();
        String userName = txtNombreUsuario.getText();
        String password = new String(txtContraseña.getPassword());
        if(lastName.isEmpty() || userName.isEmpty() || password.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe ingresar un usuario y una contraseña. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        UserModel user = new UserModel();
        user.setIdUser(idUser);
        user.setName(name);
        user.setLastName(lastName);
        user.setUserName(userName);
        user.setPassword(password);
        System.out.println(user.getIdUser() + user.getName() + user.getLastName() + user.getUserName() + user.getPassword());
        UserDAO dao = new UserDAOImpl();
        try {
            dao.update(user);
            JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");
            tablaUsers();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ah ocurrido un error, el usuario no se a actualizado");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void TablaUsersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaUsersMousePressed
        int rowUser = TablaUsers.getSelectedRow();
        if (rowUser != -1) {
            txtNombre.setText((String) TablaUsers.getValueAt(rowUser, 1));
            txtApellido.setText((String) TablaUsers.getValueAt(rowUser, 2));
            txtNombreUsuario.setText((String) TablaUsers.getValueAt(rowUser, 3));
            txtContraseña.setText((String) TablaUsers.getValueAt(rowUser, 4));
        }
    }//GEN-LAST:event_TablaUsersMousePressed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void tablaUsers(){
        try {
            UserDAO dao = new UserDAOImpl();
            DefaultTableModel model = (DefaultTableModel) TablaUsers.getModel();
            model.setRowCount(0);
            dao.readAll().forEach((u -> model.addRow(new Object[]{
                u.getIdUser(), 
                u.getName(),
                u.getLastName(),
                u.getUserName(),
                u.getPassword()
                
            })));
        } catch (Exception e) {
            System.err.print(e);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaUsers;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}