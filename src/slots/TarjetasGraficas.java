package slots;

import DAO.implementaciones.TarjetaGraficaDAOImpl;
import DAO.interfaces.TarjetaGraficaDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.TarjetaGraficaModel;
import visuals.LayoutAdmin;

public class TarjetasGraficas extends javax.swing.JPanel {

    public TarjetasGraficas() {
        initComponents();
        tablaTarjetas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaTarjetas = new javax.swing.JTable();
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

        TablaTarjetas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Proveedor", "Nombre", "PCIe", "Memoria", "Tipo de memoria", "Ancho de banda", "Cantidad"
            }
        ));
        TablaTarjetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaTarjetasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TablaTarjetas);

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
        add(btnEditarStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 350, -1, -1));
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

    private void TablaTarjetasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaTarjetasMousePressed
        int rowDisk = TablaTarjetas.getSelectedRow();
        if (rowDisk != -1) {
            txtId.setText((String) TablaTarjetas.getValueAt(rowDisk, 0));
        }
    }//GEN-LAST:event_TablaTarjetasMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AdministarProductos ingreso = new AdministarProductos();
        LayoutAdmin.getInstance().switchPanel(ingreso);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEditarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarStockActionPerformed
        int rowTarjeta = TablaTarjetas.getSelectedRow();
        if(rowTarjeta == -1){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar una fila de la tabla de usuarios. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        TarjetaGraficaModel tarjeta = new TarjetaGraficaModel();
        tarjeta.setGraphicsCardId((String) TablaTarjetas.getValueAt(rowTarjeta, 0));
        tarjeta.setSupplierId((int) TablaTarjetas.getValueAt(rowTarjeta, 1));
        tarjeta.setName((String) TablaTarjetas.getValueAt(rowTarjeta, 2));
        tarjeta.setPCIe((int) TablaTarjetas.getValueAt(rowTarjeta, 3));
        tarjeta.setMemory((int) TablaTarjetas.getValueAt(rowTarjeta, 4));
        tarjeta.setTypeMemory((String) TablaTarjetas.getValueAt(rowTarjeta, 5));
        tarjeta.setBandwidth((int) TablaTarjetas.getValueAt(rowTarjeta, 6));
        tarjeta.setQuantity((int) txtCantidad.getValue());
        TarjetaGraficaDAO dao = new TarjetaGraficaDAOImpl();
        try {
            dao.update(tarjeta);
            JOptionPane.showMessageDialog(null, "Tarjeta actualizado correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ah ocurrido un error");
            System.err.println(e);
        } finally{
            TarjetasGraficas tarjetas = new TarjetasGraficas();
            LayoutAdmin.getInstance().switchPanel(tarjetas);
        }
    }//GEN-LAST:event_btnEditarStockActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int rowTarjeta = TablaTarjetas.getSelectedRow();
        if(rowTarjeta == -1){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar una fila de la tabla. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        TarjetaGraficaModel tarjeta = new TarjetaGraficaModel();
        String GraphicsCardId = (String) TablaTarjetas.getValueAt(rowTarjeta, 0);
        tarjeta.setGraphicsCardId(GraphicsCardId);
        TarjetaGraficaDAO dao = new TarjetaGraficaDAOImpl();
        try {
            dao.delete(tarjeta);
            JOptionPane.showMessageDialog(null, "Eliminado correctamente");
            tablaTarjetas();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ah ocurrido un error, el no se a eliminado");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        RegistrarTarjetaGrafica regTarjeta = new RegistrarTarjetaGrafica();
        LayoutAdmin.getInstance().switchPanel(regTarjeta);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int rowTarjeta = TablaTarjetas.getSelectedRow();
        if(rowTarjeta == -1){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar una fila de la tabla. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        TarjetaGraficaModel tarjeta = new TarjetaGraficaModel();
        tarjeta.setGraphicsCardId((String) TablaTarjetas.getValueAt(rowTarjeta, 0));
        tarjeta.setSupplierId((int) TablaTarjetas.getValueAt(rowTarjeta, 1));
        tarjeta.setName((String) TablaTarjetas.getValueAt(rowTarjeta, 2));
        tarjeta.setPCIe((int) TablaTarjetas.getValueAt(rowTarjeta, 3));
        tarjeta.setMemory((int) TablaTarjetas.getValueAt(rowTarjeta, 4));
        tarjeta.setTypeMemory((String) TablaTarjetas.getValueAt(rowTarjeta, 5));
        tarjeta.setBandwidth((int) TablaTarjetas.getValueAt(rowTarjeta, 6));
        tarjeta.setQuantity((int) TablaTarjetas.getValueAt(rowTarjeta, 7));
        EditarTarjetaGrafica editTarjeta = new EditarTarjetaGrafica(tarjeta);
        LayoutAdmin.getInstance().switchPanel(editTarjeta);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tablaTarjetas(){
        try {
            TarjetaGraficaDAO dao = new TarjetaGraficaDAOImpl();
            DefaultTableModel model = (DefaultTableModel) TablaTarjetas.getModel();
            model.setRowCount(0);
            dao.readAll().forEach((u -> model.addRow(new Object[]{
                u.getGraphicsCardId(),
                u.getSupplierId(),
                u.getName(),
                u.getPCIe(),
                u.getMemory(),
                u.getTypeMemory(),
                u.getBandwidth(),
                u.getQuantity(),
            })));
        } catch (Exception e) {
            System.err.print(e);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaTarjetas;
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
