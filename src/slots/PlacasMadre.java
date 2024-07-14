package slots;

import DAO.implementaciones.PlacaMadreDAOImpl;
import DAO.interfaces.PlacaMadreDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.PlacaMadreModel;
import visuals.LayoutAdmin;

public class PlacasMadre extends javax.swing.JPanel {

    public PlacasMadre() {
        initComponents();
        tablaPlacas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPlacas = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        btnEditarStock = new javax.swing.JButton();
        txtCantidad = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaPlacas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Proveedor", "Nombre", "Socket", "Tipo RAM", "RAM max", "PCIe", "Puertos", "Cantidad", "SATA", "NCME"
            }
        ));
        TablaPlacas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaPlacasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TablaPlacas);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 790, -1));

        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        btnEditarStock.setText("EDITAR STOCK");
        btnEditarStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarStockActionPerformed(evt);
            }
        });
        add(btnEditarStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 350, -1, -1));
        add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 270, 110, 50));

        jLabel1.setText("CANTIDAD");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 280, 70, 30));

        jLabel2.setText("ID");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, 30, -1));

        txtId.setEditable(false);
        txtId.setText("ID");
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 212, 110, 40));

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, -1, -1));

        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, -1, -1));

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void TablaPlacasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaPlacasMousePressed
        int rowDisk = TablaPlacas.getSelectedRow();
        if (rowDisk != -1) {
            txtId.setText((String) TablaPlacas.getValueAt(rowDisk, 0));
        }
    }//GEN-LAST:event_TablaPlacasMousePressed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        AdministarProductos administrarProductos = new AdministarProductos();
        LayoutAdmin.getInstance().switchPanel(administrarProductos);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnEditarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarStockActionPerformed
        int rowUser = TablaPlacas.getSelectedRow();
        if(rowUser == -1){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar una fila de la tabla de usuarios. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        PlacaMadreModel placa = new PlacaMadreModel();
        placa.setMotherboardId((String) TablaPlacas.getValueAt(rowUser, 0));
        placa.setSupplierId((int) TablaPlacas.getValueAt(rowUser, 1));
        placa.setName((String) TablaPlacas.getValueAt(rowUser, 2));
        placa.setSocket((String) TablaPlacas.getValueAt(rowUser, 3));
        placa.setRamType((String) TablaPlacas.getValueAt(rowUser, 4));
        placa.setMaxRam((int) TablaPlacas.getValueAt(rowUser, 5));
        placa.setPCIe((int) TablaPlacas.getValueAt(rowUser, 6));
        placa.setStoragePorts((int) TablaPlacas.getValueAt(rowUser, 7));
        placa.setQuantity((int) txtCantidad.getValue());
        placa.setCompatibleWithSATA((boolean) TablaPlacas.getValueAt(rowUser, 9));
        placa.setCompatibleWithNVMe((boolean) TablaPlacas.getValueAt(rowUser, 10));
        PlacaMadreDAO dao = new PlacaMadreDAOImpl();
        try {
            dao.update(placa);
            JOptionPane.showMessageDialog(null, "Disco actualizado correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ah ocurrido un error");
            System.err.println(e);
        } finally{
            PlacasMadre placas = new PlacasMadre();
            LayoutAdmin.getInstance().switchPanel(placas);
        }
    }//GEN-LAST:event_btnEditarStockActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int rowRam = TablaPlacas.getSelectedRow();
        if(rowRam == -1){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar una fila de la tabla. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        PlacaMadreModel placa = new PlacaMadreModel();
        String MotherboardId = (String) TablaPlacas.getValueAt(rowRam, 0);
        placa.setMotherboardId(MotherboardId);
        PlacaMadreDAO dao = new PlacaMadreDAOImpl();
        try {
            dao.delete(placa);
            JOptionPane.showMessageDialog(null, "Eliminado correctamente");
            tablaPlacas();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ah ocurrido un error, el no se a eliminado");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        RegistrarPlacaMadre regPlaca = new RegistrarPlacaMadre();
        LayoutAdmin.getInstance().switchPanel(regPlaca);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int rowUser = TablaPlacas.getSelectedRow();
        if(rowUser == -1){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar una fila de la tabla. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        PlacaMadreModel placa = new PlacaMadreModel();
        placa.setMotherboardId((String) TablaPlacas.getValueAt(rowUser, 0));
        placa.setSupplierId((Integer) TablaPlacas.getValueAt(rowUser, 1));
        placa.setName((String) TablaPlacas.getValueAt(rowUser, 2));
        placa.setSocket((String) TablaPlacas.getValueAt(rowUser, 3));
        placa.setRamType((String) TablaPlacas.getValueAt(rowUser, 4));
        placa.setMaxRam((int) TablaPlacas.getValueAt(rowUser, 5));
        placa.setPCIe((int) TablaPlacas.getValueAt(rowUser, 6));
        placa.setStoragePorts((int) TablaPlacas.getValueAt(rowUser, 7));
        placa.setQuantity((int) TablaPlacas.getValueAt(rowUser, 8));
        placa.setCompatibleWithSATA((boolean) TablaPlacas.getValueAt(rowUser, 9));
        placa.setCompatibleWithNVMe((boolean) TablaPlacas.getValueAt(rowUser, 10));
        EditarPlacaMadre editPlaca = new EditarPlacaMadre(placa);
        LayoutAdmin.getInstance().switchPanel(editPlaca);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tablaPlacas(){
        try {
            PlacaMadreDAO dao = new PlacaMadreDAOImpl();
            DefaultTableModel model = (DefaultTableModel) TablaPlacas.getModel();
            model.setRowCount(0);
            dao.readAll().forEach((u -> model.addRow(new Object[]{
                u.getMotherboardId(),
                u.getSupplierId(),
                u.getName(),
                u.getSocket(),
                u.getRamType(),
                u.getMaxRam(),
                u.getPCIe(),
                u.getStoragePorts(),
                u.getQuantity(),
                u.isCompatibleWithSATA(),
                u.isCompatibleWithNVMe()
            })));
        } catch (Exception e) {
            System.err.print(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaPlacas;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditarStock;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner txtCantidad;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
