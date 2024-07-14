package slots;

import visuals.LayoutAdmin;
import DAO.implementaciones.PlacaMadreDAOImpl;
import DAO.implementaciones.ProveedorDAOlmpl;
import DAO.interfaces.PlacaMadreDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.PlacaMadreModel;
import modelos.ProveedorModel;
import java.util.HashMap;

public class RegistrarPlacaMadre extends javax.swing.JPanel {

    public RegistrarPlacaMadre() {
        initComponents();
        cargarProveedores();
    }
    
    private HashMap<String, Integer> proveedorMap = new HashMap<>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JSpinner();
        txtPuertos = new javax.swing.JSpinner();
        txtRamMax = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        txtSocket = new javax.swing.JTextField();
        txtTipoRam = new javax.swing.JComboBox<>();
        txtPCIe = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtSATA = new javax.swing.JCheckBox();
        txtNVMe = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR NUEVA PLACA MADRE");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 420, 10));

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, -1, -1));

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 230, -1, -1));
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 210, 50));
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 210, 50));

        jLabel2.setText("ID");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 30, -1));
        add(txtProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 210, 50));

        jLabel4.setText("Proveedor");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel5.setText("Nombre");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel6.setText("Socket");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel7.setText("Tipo de RAM");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jLabel8.setText("RAM max");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        jLabel9.setText("Cantidad");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        jLabel10.setText("Puertos");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));
        add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 210, 50));
        add(txtPuertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 210, 50));
        add(txtRamMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 210, 50));

        jLabel11.setText("PCIe");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, -1));
        add(txtSocket, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 210, 50));

        txtTipoRam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DDR4", "DDR5" }));
        txtTipoRam.setToolTipText("");
        add(txtTipoRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 210, 50));

        txtPCIe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "8", "16" }));
        txtPCIe.setToolTipText("");
        add(txtPCIe, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 210, 50));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("COMPATIBILIDAD");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        txtSATA.setText("SATA");
        jPanel1.add(txtSATA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        txtNVMe.setText("NVMe");
        jPanel1.add(txtNVMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 280, 150));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String motherboardId = txtId.getText();
        String nombreProveedor = (String) txtProveedor.getSelectedItem(); // Obtén el nombre
        int supplierId = proveedorMap.getOrDefault(nombreProveedor, -1); //aqui quiero recuperar la ID del proveedor
        System.out.println(supplierId);
        String name = txtNombre.getText();
        String socket = txtSocket.getText();
        String ramType = (String) txtTipoRam.getSelectedItem();
        int maxRam = (int) txtRamMax.getValue();
        int PCIe = Integer.parseInt((String) txtPCIe.getSelectedItem());
        int storagePorts = (int) txtPuertos.getValue();
        int quantity = (int) txtCantidad.getValue();
        boolean compatibleWithSATA = txtSATA.isSelected();
        boolean compatibleWithNVMe = txtNVMe.isSelected();
        
        if (nombreProveedor.isEmpty() || name.isEmpty() || socket.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos obligatorios.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        PlacaMadreModel placa = new PlacaMadreModel();
        placa.setMotherboardId(motherboardId);
        placa.setSupplierId(supplierId);
        placa.setName(name);
        placa.setSocket(socket);
        placa.setRamType(ramType);
        placa.setMaxRam(maxRam);
        placa.setPCIe(PCIe);
        placa.setStoragePorts(storagePorts);
        placa.setQuantity(quantity);
        placa.setCompatibleWithSATA(compatibleWithSATA);
        placa.setCompatibleWithNVMe(compatibleWithNVMe);

        PlacaMadreDAO dao = new PlacaMadreDAOImpl();
        try {
            dao.create(placa);
            JOptionPane.showMessageDialog(null, "Placa madre registrada correctamente.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al registrar la placa madre.");
            System.err.println(e);
        } finally {
            PlacasMadre placas = new PlacasMadre();
            LayoutAdmin.getInstance().switchPanel(placas);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        PlacasMadre placas = new PlacasMadre();
        LayoutAdmin.getInstance().switchPanel(placas);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cargarProveedores() {
        ProveedorDAOlmpl proveedorDAO = new ProveedorDAOlmpl();
    try {
        ArrayList<ProveedorModel> proveedores = proveedorDAO.readAll();
        for (ProveedorModel proveedor : proveedores) {
            txtProveedor.addItem(proveedor.getName()); // Agrega solo el nombre
            proveedorMap.put(proveedor.getName(), proveedor.getSupplierId()); // Mapa para ID
        }
    } catch (Exception e) {
        e.printStackTrace(); // Manejo de errores
    }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner txtCantidad;
    private javax.swing.JTextField txtId;
    private javax.swing.JCheckBox txtNVMe;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JComboBox<String> txtPCIe;
    private javax.swing.JComboBox<String> txtProveedor;
    private javax.swing.JSpinner txtPuertos;
    private javax.swing.JSpinner txtRamMax;
    private javax.swing.JCheckBox txtSATA;
    private javax.swing.JTextField txtSocket;
    private javax.swing.JComboBox<String> txtTipoRam;
    // End of variables declaration//GEN-END:variables
}
