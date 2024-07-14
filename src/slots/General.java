package slots;

import DAO.implementaciones.DiscoDAOImpl;
import DAO.implementaciones.PlacaMadreDAOImpl;
import DAO.implementaciones.RamDAOImpl;
import DAO.implementaciones.TarjetaGraficaDAOImpl;
import DAO.interfaces.DiscoDAO;
import DAO.interfaces.PlacaMadreDAO;
import DAO.interfaces.RamDAO;
import DAO.interfaces.TarjetaGraficaDAO;
import javax.swing.table.DefaultTableModel;
import modelos.RamModel;
import modelos.DiscoModel;
import modelos.PlacaMadreModel;
import modelos.TarjetaGraficaModel;
import algoritmos.Recomendaciones;
import java.util.ArrayList;
import modelos.ComponenteModel;

public class General extends javax.swing.JPanel {
    
    String typeComponent;
    private Recomendaciones recomendaciones;

    public General() {
        initComponents();
        recomendaciones = new Recomendaciones();
        cargarDatosDiscos();
        typeComponent="Disk";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnRams = new javax.swing.JButton();
        btnDiscos = new javax.swing.JButton();
        btnTarjetasGraficas = new javax.swing.JButton();
        btnPlacasMadre = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableComponentes = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableRecomendaciones = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("COMPONENTES DISPONIBLES");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 360, 20));

        btnRams.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/icons8-ram-de-computadora-100.png"))); // NOI18N
        btnRams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRamsActionPerformed(evt);
            }
        });
        add(btnRams, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 100, 100));

        btnDiscos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/icons8-disco-duro-100.png"))); // NOI18N
        btnDiscos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiscosActionPerformed(evt);
            }
        });
        add(btnDiscos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 100, 100));

        btnTarjetasGraficas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/icons8-tarjeta-de-video-100.png"))); // NOI18N
        btnTarjetasGraficas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTarjetasGraficasActionPerformed(evt);
            }
        });
        add(btnTarjetasGraficas, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 100, 100));

        btnPlacasMadre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/icons8-placa-base-100.png"))); // NOI18N
        btnPlacasMadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlacasMadreActionPerformed(evt);
            }
        });
        add(btnPlacasMadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 100, 100));

        TableComponentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TableComponentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TableComponentesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TableComponentes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 720, 400));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 720, 10));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 30, 620));

        TableRecomendaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TableRecomendaciones);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 110, 560, 380));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRamsActionPerformed
        DefaultTableModel model = (DefaultTableModel) TableRecomendaciones.getModel();
        model.setRowCount(0);
        cargarDatosRAM();
        typeComponent="RAM";
    }//GEN-LAST:event_btnRamsActionPerformed

    private void btnDiscosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiscosActionPerformed
        DefaultTableModel model = (DefaultTableModel) TableRecomendaciones.getModel();
        model.setRowCount(0);
        cargarDatosDiscos();
        typeComponent="Disk";
    }//GEN-LAST:event_btnDiscosActionPerformed

    private void btnTarjetasGraficasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTarjetasGraficasActionPerformed
        DefaultTableModel model = (DefaultTableModel) TableRecomendaciones.getModel();
        model.setRowCount(0);
        cargarDatosTarjetasGraficas();
        typeComponent="GraphicsCard";
    }//GEN-LAST:event_btnTarjetasGraficasActionPerformed

    private void btnPlacasMadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlacasMadreActionPerformed
        DefaultTableModel model = (DefaultTableModel) TableRecomendaciones.getModel();
        model.setRowCount(0);
        cargarDatosMotherboards();
        typeComponent="Motherboard";
    }//GEN-LAST:event_btnPlacasMadreActionPerformed

    private void TableComponentesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableComponentesMousePressed
        int rowComponent = TableComponentes.getSelectedRow();
        if (rowComponent != -1) {
            ArrayList<ComponenteModel> recomendacionesList = null;
            switch (typeComponent) {
                case "RAM" -> {
                    RamModel ram = new RamModel();
                    ram.setName((String) TableComponentes.getValueAt(rowComponent, 0));
                    ram.setType((String) TableComponentes.getValueAt(rowComponent, 1));
                    ram.setCapacity((int) TableComponentes.getValueAt(rowComponent, 2));
                    ram.setSpeed((int) TableComponentes.getValueAt(rowComponent, 3));
                    ram.setLatency((String) TableComponentes.getValueAt(rowComponent, 4));
                    ram.setVoltage((double) TableComponentes.getValueAt(rowComponent, 5));
                    ram.setQuantity((int) TableComponentes.getValueAt(rowComponent, 6));
                    recomendacionesList = recomendaciones.recomendacionRam(ram);
                }
                case "Disk" -> {
                    DiscoModel disco = new DiscoModel();
                    disco.setName((String) TableComponentes.getValueAt(rowComponent, 0));
                    disco.setType((String) TableComponentes.getValueAt(rowComponent, 1));
                    disco.setCapacity((int) TableComponentes.getValueAt(rowComponent, 2));
                    disco.setInterface((String) TableComponentes.getValueAt(rowComponent, 3));
                    disco.setReadSpeed((int) TableComponentes.getValueAt(rowComponent, 4));
                    disco.setWriteSpeed((int) TableComponentes.getValueAt(rowComponent, 5));
                    disco.setQuantity((int) TableComponentes.getValueAt(rowComponent, 6));
                    recomendacionesList = recomendaciones.recomendacionDisco(disco);
                }
                case "GraphicsCard" -> {
                    TarjetaGraficaModel tarjeta = new TarjetaGraficaModel();
                    tarjeta.setName((String) TableComponentes.getValueAt(rowComponent, 0));
                    tarjeta.setPCIe((int) TableComponentes.getValueAt(rowComponent, 1));
                    tarjeta.setMemory((int) TableComponentes.getValueAt(rowComponent, 2));
                    tarjeta.setTypeMemory((String) TableComponentes.getValueAt(rowComponent, 3));
                    tarjeta.setBandwidth((int) TableComponentes.getValueAt(rowComponent, 4));
                    tarjeta.setQuantity((int) TableComponentes.getValueAt(rowComponent, 5));
                    recomendacionesList = recomendaciones.recomendacionTarjeta(tarjeta);
                }
                case "Motherboard" -> {
                    PlacaMadreModel placa = new PlacaMadreModel();
                    placa.setName((String) TableComponentes.getValueAt(rowComponent, 0));
                    placa.setSocket((String) TableComponentes.getValueAt(rowComponent, 1));
                    placa.setRamType((String) TableComponentes.getValueAt(rowComponent, 2));
                    placa.setMaxRam((int) TableComponentes.getValueAt(rowComponent, 3));
                    placa.setPCIe((int) TableComponentes.getValueAt(rowComponent, 4));
                    placa.setStoragePorts((int) TableComponentes.getValueAt(rowComponent, 5));
                    placa.setQuantity((int) TableComponentes.getValueAt(rowComponent, 6));
                    placa.setCompatibleWithSATA((boolean) TableComponentes.getModel().getValueAt(rowComponent, 7));
                    placa.setCompatibleWithNVMe((boolean) TableComponentes.getModel().getValueAt(rowComponent, 8));
                    recomendacionesList = recomendaciones.recomendacionPlaca(placa);
                }
                default -> throw new AssertionError();
            }
            if (recomendacionesList != null) {
                cargarRecomendaciones(recomendacionesList);
            }
        }
    }//GEN-LAST:event_TableComponentesMousePressed
    
    private void cargarRecomendaciones(ArrayList<ComponenteModel> recomendacionesList) {
        DefaultTableModel model = (DefaultTableModel) TableRecomendaciones.getModel();
        model.setRowCount(0); // Limpiar tabla
        model.setColumnIdentifiers(new Object[]{"Tipo Componente", "Nombre", "Tipo", "Cantidad"});
        for (ComponenteModel componente : recomendacionesList) {
            model.addRow(new Object[]{
                componente.getTipoComponente(),
                componente.getNombre(),
                componente.getTipo(),
                componente.getCantidad()
            });
        }
    }
    
    private void cargarDatosDiscos() {
        try {
            DiscoDAO dao = new DiscoDAOImpl();
            DefaultTableModel model = (DefaultTableModel) TableComponentes.getModel();
            model.setRowCount(0); // Limpiar tabla
            model.setColumnIdentifiers(new Object[]{"Name", "Type", "Capacity", "Interface", "Read Speed", "Write Speed", "Quantity"});
            dao.readAll().forEach((u -> model.addRow(new Object[]{
                u.getName(),
                u.getType(),
                u.getCapacity(),
                u.getInterface(),
                u.getReadSpeed(),
                u.getWriteSpeed(),
                u.getQuantity(),
            })));
        } catch (Exception e) {
            System.err.print(e);
        }
    }

    private void cargarDatosRAM() {
        try {
            RamDAO dao = new RamDAOImpl();
            DefaultTableModel model = (DefaultTableModel) TableComponentes.getModel();
            model.setRowCount(0); // Limpiar tabla
            model.setColumnIdentifiers(new Object[]{"Name", "Type", "Capacity", "Speed", "Latency", "Voltage", "Quantity"});
            dao.readAll().forEach((u -> model.addRow(new Object[]{
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

    private void cargarDatosTarjetasGraficas() {
        try {
            TarjetaGraficaDAO dao = new TarjetaGraficaDAOImpl();
            DefaultTableModel model = (DefaultTableModel) TableComponentes.getModel();
            model.setRowCount(0); // Limpiar tabla
            model.setColumnIdentifiers(new Object[]{"Name", "PCIe", "Memory", "Type Memory", "Bandwidth", "Quantity"});
            dao.readAll().forEach((u -> model.addRow(new Object[]{
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
    
    private void cargarDatosMotherboards() {
        try {
            PlacaMadreDAO dao = new PlacaMadreDAOImpl();
            DefaultTableModel model = (DefaultTableModel) TableComponentes.getModel();
            model.setRowCount(0); // Limpiar tabla
            model.setColumnIdentifiers(new Object[]{"Name", "socket", "ramType", "maxRam", "PCIe", "storagePorts", "Quantity", "compatibleWithSATA", "compatibleWithNVMe"});
            dao.readAll().forEach((u -> model.addRow(new Object[]{
                u.getName(),
                u.getSocket(),
                u.getRamType(),
                u.getMaxRam(),
                u.getPCIe(),
                u.getStoragePorts(),
                u.getQuantity(),
                u.isCompatibleWithSATA(), // Campo oculto
                u.isCompatibleWithNVMe()  // Campo oculto
            })));
            TableComponentes.removeColumn(TableComponentes.getColumnModel().getColumn(7)); // Oculta compatibleWithSATA
            TableComponentes.removeColumn(TableComponentes.getColumnModel().getColumn(7)); // Oculta compatibleWithNVMe
        } catch (Exception e) {
            System.err.print(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableComponentes;
    private javax.swing.JTable TableRecomendaciones;
    private javax.swing.JButton btnDiscos;
    private javax.swing.JButton btnPlacasMadre;
    private javax.swing.JButton btnRams;
    private javax.swing.JButton btnTarjetasGraficas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
