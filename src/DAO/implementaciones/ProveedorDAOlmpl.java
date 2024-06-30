package DAO.implementaciones;

import DAO.interfaces.ProveedorDAO;
import dataBase.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelos.ProveedorModel;


public class ProveedorDAOlmpl extends DBConnection implements ProveedorDAO {

    @Override
    public void create(ProveedorModel t) throws Exception {
        try {
            conectarDB();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO supplier(Name, Contact, Address) VALUES(?,?,?)");
            st.setString(1, t.getName());
            st.setString(2, t.getContact());
            st.setString(3, t.getAddress());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDB();
        }
    }

    @Override
    public ArrayList<ProveedorModel> readAll() throws Exception {
        ArrayList<ProveedorModel> listProveedor = new ArrayList<>();
        try {
            conectarDB();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM `supplier`");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ProveedorModel proveedor = new ProveedorModel();
                proveedor.setIdSuppier(rs.getInt("IdSupplier"));
                proveedor.setName(rs.getString("Name"));
                proveedor.setContact(rs.getString("Contact"));
                proveedor.setAddress(rs.getString("Address"));
                listProveedor.add(proveedor); 
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDB();
        }
        return listProveedor;
    }

    @Override
    public ProveedorModel readBy(ProveedorModel t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(ProveedorModel t) throws Exception {
        try {
            conectarDB();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE supplier SET Name = ?, Contact = ?, Address = ? WHERE IdSupplier = ?");
            st.setString(1, t.getName());
            st.setString(2, t.getContact());
            st.setString(3, t.getAddress());
            st.setInt(4, t.getIdSuppier());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDB();
        }
    }

    @Override
    public void delete(ProveedorModel t) throws Exception {
        try {
            conectarDB();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM supplier WHERE IdSupplier = ?");
            st.setInt(1, t.getIdSuppier());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDB();
        }
    }
}
