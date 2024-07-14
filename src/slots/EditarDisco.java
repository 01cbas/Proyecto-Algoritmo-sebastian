package slots;

import visuals.LayoutAdmin;
import DAO.implementaciones.DiscoDAOImpl;
import DAO.implementaciones.ProveedorDAOlmpl;
import DAO.interfaces.DiscoDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.DiscoModel;
import modelos.ProveedorModel;
import java.util.HashMap;

public class EditarDisco extends javax.swing.JPanel {
    
    DiscoModel editDisco;

    public EditarDisco(DiscoModel disco) {
        editDisco = disco;
        initComponents();
        cargarProveedores();
        cargarDatos();
    }
    
    private HashMap<String, Integer> proveedorMap = new HashMap<>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JSpinner();
        txtCantidad = new javax.swing.JSpinner();
        txtLectura = new javax.swing.JSpinner();
        txtEscritura = new javax.swing.JSpinner();
        txtTipo = new javax.swing.JComboBox<>();
        txtInterfaz = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EDITAR DISCO");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 170, 10));

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, -1, -1));

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, -1, -1));

        txtId.setEditable(false);
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 210, 50));
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 210, 50));

        jLabel2.setText("ID");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 30, -1));

        jLabel3.setText("Velocidad de lectura");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, -1));

        add(txtProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 210, 50));

        jLabel4.setText("Proveedor");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel5.setText("Nombre");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel6.setText("Tipo");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabel7.setText("Capacidad");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jLabel8.setText("Interfaz");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, -1));

        jLabel9.setText("Cantidad");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, -1, -1));

        jLabel10.setText("Velocidad de escritura");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));
        add(txtCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 210, 50));
        add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 210, 50));
        add(txtLectura, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 210, 50));
        add(txtEscritura, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 210, 50));

        txtTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SSD", "HDD" }));
        txtTipo.setToolTipText("");
        add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 210, 50));

        txtInterfaz.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SATA", "NVME" }));
        add(txtInterfaz, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 210, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Discos discos = new Discos();
        LayoutAdmin.getInstance().switchPanel(discos);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String diskId = txtId.getText();
        String nombreProveedor = (String) txtProveedor.getSelectedItem(); // Obtén el nombre
        int supplierId = proveedorMap.getOrDefault(nombreProveedor, -1); //aqui quiero recuperar la ID del proveedor
        System.out.println(supplierId);
        String name = txtNombre.getText();
        String type = (String) txtTipo.getSelectedItem();
        int capacity = (int) txtCapacidad.getValue();
        String Interface = (String) txtInterfaz.getSelectedItem();
        int readSpeed = (int) txtLectura.getValue();
        int writeSpeed = (int) txtEscritura.getValue();
        int quantity = (int) txtCantidad.getValue();
        if(diskId.isEmpty() || type.isEmpty() || name.isEmpty() || Interface.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe ingresar un usuario y una contraseña. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        editDisco = new DiscoModel();
        editDisco.setDiskId(diskId);
        editDisco.setSupplierId(supplierId);
        editDisco.setName(name);
        editDisco.setType(type);
        editDisco.setCapacity(capacity);
        editDisco.setInterface(Interface);
        editDisco.setReadSpeed(readSpeed);
        editDisco.setWriteSpeed(writeSpeed);
        editDisco.setQuantity(quantity);
        DiscoDAO dao = new DiscoDAOImpl();
        try {
            dao.update(editDisco);
            JOptionPane.showMessageDialog(null, "Disco actualizado correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ah ocurrido un error");
            System.err.println(e);
        } finally{
            Discos discos = new Discos();
            LayoutAdmin.getInstance().switchPanel(discos);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void cargarProveedores() {
        ProveedorDAOlmpl proveedorDAO = new ProveedorDAOlmpl();
        try {
            ArrayList<ProveedorModel> proveedores = proveedorDAO.readAll();
            for (ProveedorModel proveedor : proveedores) {
                txtProveedor.addItem(proveedor.getName());
                proveedorMap.put(proveedor.getName(), proveedor.getSupplierId());
            }
        } catch (Exception e) {
            e.printStackTrace(); // Manejo de errores
        }
    }
    
    private void cargarDatos(){
        txtId.setText(editDisco.getDiskId());
        for (String nombreProveedor : proveedorMap.keySet()) {
            if (proveedorMap.get(nombreProveedor).equals(editDisco.getSupplierId())) {
                txtProveedor.setSelectedItem(nombreProveedor);
                break;
            }
        }
        txtNombre.setText(editDisco.getName());
        txtTipo.setSelectedItem(editDisco.getType());
        txtCapacidad.setValue(editDisco.getCapacity());
        txtInterfaz.setSelectedItem(editDisco.getInterface());
        txtLectura.setValue(editDisco.getReadSpeed());
        txtEscritura.setValue(editDisco.getWriteSpeed());
        txtCantidad.setValue(editDisco.getQuantity());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner txtCantidad;
    private javax.swing.JSpinner txtCapacidad;
    private javax.swing.JSpinner txtEscritura;
    private javax.swing.JTextField txtId;
    private javax.swing.JComboBox<String> txtInterfaz;
    private javax.swing.JSpinner txtLectura;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JComboBox<String> txtProveedor;
    private javax.swing.JComboBox<String> txtTipo;
    // End of variables declaration//GEN-END:variables
}
