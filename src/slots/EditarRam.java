package slots;

import visuals.LayoutAdmin;
import DAO.implementaciones.ProveedorDAOlmpl;
import DAO.implementaciones.RamDAOImpl;
import DAO.interfaces.RamDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.ProveedorModel;
import java.util.HashMap;
import modelos.RamModel;

public class EditarRam extends javax.swing.JPanel {
    
    RamModel editRam;

    public EditarRam(RamModel ram) {
        editRam = ram;
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
        txtLatencia = new javax.swing.JSpinner();
        txtVoltaje = new javax.swing.JSpinner();
        txtTipo = new javax.swing.JComboBox<>();
        txtVelocidad = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EDITAR RAM");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, -1));
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

        jLabel3.setText("CL");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, -1));

        add(txtProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 210, 50));

        jLabel4.setText("Proveedor");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel5.setText("Nombre");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel6.setText("Tipo");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabel7.setText("Capacidad");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jLabel8.setText("Velocidad");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, -1, -1));

        jLabel9.setText("Cantidad");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, -1, -1));

        jLabel10.setText("Voltaje");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, -1, -1));
        add(txtCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 210, 50));
        add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 210, 50));
        add(txtLatencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 210, 50));

        txtVoltaje.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 0.1d));
        add(txtVoltaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 210, 50));

        txtTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DDR4", "DDR5" }));
        txtTipo.setToolTipText("");
        add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 210, 50));
        add(txtVelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 210, 50));

        jLabel11.setText("Latencia");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        RAMs rams = new RAMs();
        LayoutAdmin.getInstance().switchPanel(rams);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String RamId = txtId.getText();
        String nombreProveedor = (String) txtProveedor.getSelectedItem(); // Obtén el nombre
        int supplierId = proveedorMap.getOrDefault(nombreProveedor, -1); //aqui quiero recuperar la ID del proveedor
        System.out.println(supplierId);
        String name = txtNombre.getText();
        String type = (String) txtTipo.getSelectedItem();
        int capacity = (int) txtCapacidad.getValue();
        int speed = (int) txtVelocidad.getValue();
        int latency = (int) txtLatencia.getValue();
        double voltage = (double) txtVoltaje.getValue();
        int quantity = (int) txtCantidad.getValue();
        if(nombreProveedor.isEmpty() || type.isEmpty() || name.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe ingresar un usuario y una contraseña. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        editRam = new RamModel();
        editRam.setRamId(RamId);
        editRam.setSupplierId(supplierId);
        editRam.setName(name);
        editRam.setType(type);
        editRam.setCapacity(capacity);
        editRam.setSpeed(speed);
        editRam.setLatency("CL"+latency);
        editRam.setVoltage(voltage);
        editRam.setQuantity(quantity);
        RamDAO dao = new RamDAOImpl();
        try {
            dao.update(editRam);
            JOptionPane.showMessageDialog(null, "Disco actualizado correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ah ocurrido un error");
            System.err.println(e);
        } finally{
            RAMs rams = new RAMs();
            LayoutAdmin.getInstance().switchPanel(rams);
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
        txtId.setText(editRam.getRamId());
        for (String nombreProveedor : proveedorMap.keySet()) {
            if (proveedorMap.get(nombreProveedor).equals(editRam.getSupplierId())) {
                txtProveedor.setSelectedItem(nombreProveedor);
                break;
            }
        }
        txtNombre.setText(editRam.getName());
        txtTipo.setSelectedItem(editRam.getType());
        txtCapacidad.setValue(editRam.getCapacity());
        txtVelocidad.setValue(editRam.getSpeed());
        String latencia = editRam.getLatency();
        String latenciaNumero = latencia.replaceAll("[^0-9]", "");
        if (!latenciaNumero.isEmpty()) {
            txtLatencia.setValue(Integer.valueOf(latenciaNumero));
        }
        txtVoltaje.setValue(editRam.getVoltage());
        txtCantidad.setValue(editRam.getQuantity());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField txtId;
    private javax.swing.JSpinner txtLatencia;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JComboBox<String> txtProveedor;
    private javax.swing.JComboBox<String> txtTipo;
    private javax.swing.JSpinner txtVelocidad;
    private javax.swing.JSpinner txtVoltaje;
    // End of variables declaration//GEN-END:variables
}
