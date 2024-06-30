package DAO.implementaciones;

import DAO.interfaces.LoginDAO;
import dataBase.DBConnection;
import modelos.LoginModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class LoginDAOImpl extends DBConnection implements LoginDAO{

    @Override
    public void create(LoginModel t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<LoginModel> readAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LoginModel readBy(LoginModel t) throws Exception {
        LoginModel login = new LoginModel();
        try {
            conectarDB();
            PreparedStatement st = conexion.prepareStatement("SELECT * FROM `user` WHERE UserName = ? ");
            st.setString(1, t.getUserName());
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                login.setIdUser(rs.getInt("idUser"));
                login.setUserName(rs.getString("UserName"));
                login.setPassword(rs.getString("Password"));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDB();
        }
        return login;
    }

    @Override
    public void update(LoginModel t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(LoginModel t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
