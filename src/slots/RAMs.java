package slots;

import visuals.LayoutAdmin;

import DAO.implementaciones.RamDAOImpl;
import DAO.interfaces.RamDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.RamModel;

public class RAMs extends javax.swing.JPanel {

    public RAMs() {
        initComponents();
        tablaRAMs();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaRams = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
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

        TablaRams.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Proveedor", "Nombre", "Tipo", "Capacidad", "Velocidad", "Latencia", "Voltaje", "Cantidad"
            }
        ));
        TablaRams.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaRamsMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TablaRams);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 790, -1));

        jButton1.setText("VOLVER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AdministarProductos ingreso = new AdministarProductos();
        LayoutAdmin.getInstance().switchPanel(ingreso);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEditarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarStockActionPerformed
        int rowUser = TablaRams.getSelectedRow();
        if(rowUser == -1){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar una fila de la tabla de usuarios. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        RamModel ram = new RamModel();
        ram.setRamId((String) TablaRams.getValueAt(rowUser, 0));
        ram.setSupplierId((Integer) TablaRams.getValueAt(rowUser, 1));
        ram.setName((String) TablaRams.getValueAt(rowUser, 2));
        ram.setType((String) TablaRams.getValueAt(rowUser, 3));
        ram.setCapacity((Integer) TablaRams.getValueAt(rowUser, 4));
        ram.setSpeed((int) TablaRams.getValueAt(rowUser, 5));
        ram.setLatency((String) TablaRams.getValueAt(rowUser, 6));
        ram.setVoltage((double) TablaRams.getValueAt(rowUser, 7));
        ram.setQuantity((int) txtCantidad.getValue());
        RamDAO dao = new RamDAOImpl();
        try {
            dao.update(ram);
            JOptionPane.showMessageDialog(null, "Disco actualizado correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ah ocurrido un error");
            System.err.println(e);
        } finally{
            RAMs rams = new RAMs();
            LayoutAdmin.getInstance().switchPanel(rams);
        }
    }//GEN-LAST:event_btnEditarStockActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int rowRam = TablaRams.getSelectedRow();
        if(rowRam == -1){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar una fila de la tabla. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        RamModel ram = new RamModel();
        String ramId = (String) TablaRams.getValueAt(rowRam, 0);
        ram.setRamId(ramId);
        RamDAO dao = new RamDAOImpl();
        try {
            dao.delete(ram);
            JOptionPane.showMessageDialog(null, "Eliminado correctamente");
            tablaRAMs();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ah ocurrido un error, el no se a eliminado");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        RegistrarRam regRam = new RegistrarRam();
        LayoutAdmin.getInstance().switchPanel(regRam);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int rowUser = TablaRams.getSelectedRow();
        if(rowUser == -1){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar una fila de la tabla. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        RamModel ram = new RamModel();
        ram.setRamId((String) TablaRams.getValueAt(rowUser, 0));
        ram.setSupplierId((Integer) TablaRams.getValueAt(rowUser, 1));
        ram.setName((String) TablaRams.getValueAt(rowUser, 2));
        ram.setType((String) TablaRams.getValueAt(rowUser, 3));
        ram.setCapacity((Integer) TablaRams.getValueAt(rowUser, 4));
        ram.setSpeed((int) TablaRams.getValueAt(rowUser, 5));
        ram.setLatency((String) TablaRams.getValueAt(rowUser, 6));
        ram.setVoltage((double) TablaRams.getValueAt(rowUser, 7));
        ram.setQuantity((int) TablaRams.getValueAt(rowUser, 8));
        EditarRam editRam = new EditarRam(ram);
        LayoutAdmin.getInstance().switchPanel(editRam);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void TablaRamsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaRamsMousePressed
        int rowDisk = TablaRams.getSelectedRow();
        if (rowDisk != -1) {
            txtId.setText((String) TablaRams.getValueAt(rowDisk, 0));
        }
    }//GEN-LAST:event_TablaRamsMousePressed

    private void tablaRAMs(){
        try {
            RamDAO dao = new RamDAOImpl();
            DefaultTableModel model = (DefaultTableModel) TablaRams.getModel();
            model.setRowCount(0);
            dao.readAll().forEach((u -> model.addRow(new Object[]{
                u.getRamId(),
                u.getSupplierId(),
                u.getName(),
                u.getType(),
                u.getCapacity(),
                u.getSpeed(),
                u.getLatency(),
                u.getVoltage(),
                u.getQuantity(),
            })));
        } catch (Exception e) {
            System.err.print(e);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaRams;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditarStock;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner txtCantidad;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
