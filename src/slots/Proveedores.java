package slots;

import DAO.implementaciones.ProveedorDAOlmpl;
import DAO.interfaces.ProveedorDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.ProveedorModel;

public class Proveedores extends javax.swing.JPanel {

    public Proveedores() {
        initComponents();
        tablaProveedor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProveedor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtContacto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre", "Contacto", "Direccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaProveedorMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProveedor);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 610, 570));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMINISTRAR PROVEEDORES");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 360, -1));
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 320, 40));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel3.setText("NOMBRE:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, -1, -1));
        add(txtContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, 320, 40));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel6.setText("CONTACTO:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, -1, -1));
        add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, 320, 40));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel7.setText("DIRECCIÓN:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 360, -1));

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

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 550, 100, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void tablaProveedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProveedorMousePressed
        int rowUser = tablaProveedor.getSelectedRow();
        if (rowUser != -1) {
            txtNombre.setText((String) tablaProveedor.getValueAt(rowUser, 1));
            txtContacto.setText((String) tablaProveedor.getValueAt(rowUser, 2));
            txtDireccion.setText((String) tablaProveedor.getValueAt(rowUser, 3));
        }
    }//GEN-LAST:event_tablaProveedorMousePressed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String name = txtNombre.getText();
        String contact = txtContacto.getText();
        String address = txtDireccion.getText();
        if(name.isEmpty() || contact.isEmpty() || address.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe ingresar todos los datos pedidos. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        ProveedorModel proveedor = new ProveedorModel();
        proveedor.setName(name);
        proveedor.setContact(contact);
        proveedor.setAddress(address);
        ProveedorDAO dao = new ProveedorDAOlmpl();
        try {
            dao.create(proveedor);
            JOptionPane.showMessageDialog(null, "Proveedor agregado correctamente");
            tablaProveedor();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ah ocurrido un error, el proveedor no se ah agregado");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int rowSupplier = tablaProveedor.getSelectedRow();
        if(rowSupplier == -1){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar una fila de la tabla de proveedores. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        int idSupplier = (int) tablaProveedor.getValueAt(rowSupplier, 0);
        String name = txtNombre.getText();
        String contact = txtContacto.getText();
        String address = txtDireccion.getText();
        if(name.isEmpty() || contact.isEmpty() || address.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe ingresar un usuario y una contraseña. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        ProveedorModel proveedor = new ProveedorModel();
        proveedor.setSupplierId(idSupplier);
        proveedor.setName(name);
        proveedor.setContact(contact);
        proveedor.setAddress(address);
        ProveedorDAO dao = new ProveedorDAOlmpl();
        try {
            dao.update(proveedor);
            JOptionPane.showMessageDialog(null, "Proveedor actualizado correctamente");
            tablaProveedor();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ah ocurrido un error, el Proveedor no se ah actualizado");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int rowSupplier = tablaProveedor.getSelectedRow();
        if(rowSupplier == -1){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar una fila de la tabla de usuarios. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        ProveedorModel proveedor = new ProveedorModel();
        int idSupplier = (int) tablaProveedor.getValueAt(rowSupplier, 0);
        proveedor.setSupplierId(idSupplier);
        ProveedorDAO dao = new ProveedorDAOlmpl();
        try {
            dao.delete(proveedor);
            JOptionPane.showMessageDialog(null, "Proveedor eliminado correctamente");
            tablaProveedor();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ah ocurrido un error, el Proveedor no se a eliminado");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tablaProveedor() {
        try {
            ProveedorDAO dao = new ProveedorDAOlmpl();
            DefaultTableModel model = (DefaultTableModel) tablaProveedor.getModel();
            model.setRowCount(0);
            dao.readAll().forEach((u -> model.addRow(new Object[]{
                u.getSupplierId(),
                u.getName(),
                u.getAddress(),
                u.getContact()
            })));
        } catch (Exception e) {
            System.err.print(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaProveedor;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
