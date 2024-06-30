package DAO.implementaciones;

import DAO.interfaces.UserDAO;
import dataBase.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelos.UserModel;

public class UserDAOImpl extends DBConnection implements UserDAO{

    @Override
    public void create(UserModel t) throws Exception {
        try {
            conectarDB();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO user(Name, LastName, UserName, Password) VALUES(?,?,?,?)");
            st.setString(1,t.getName());
            st.setString(2,t.getLastName());
            st.setString(3,t.getUserName());
            st.setString(4,t.getPassword());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDB();
        }
    }

    @Override
    public ArrayList<UserModel> readAll() throws Exception {
        ArrayList<UserModel> listUsers = new ArrayList();
        try {
            conectarDB();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM `user`");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {  
                UserModel  user = new UserModel();
                user.setIdUser(rs.getInt("idUser"));
                user.setName(rs.getString("Name"));
                user.setLastName(rs.getString("LastName"));
                user.setUserName(rs.getString("UserName"));
                user.setPassword(rs.getString("Password"));
                listUsers.add(user);
           }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDB();
        }
        return listUsers;
    }

    @Override
    public UserModel readBy(UserModel t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(UserModel t) throws Exception {
        try {
            conectarDB();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE `user` SET Name = ?, LastName = ?, UserName = ?, Password = ? WHERE idUser = ?");
            st.setString(1,t.getName());
            st.setString(2,t.getLastName());
            st.setString(3,t.getUserName());
            st.setString(4,t.getPassword());
            st.setInt(5, t.getIdUser());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDB();
        }
    }

    @Override
    public void delete(UserModel t) throws Exception {
        try {
            conectarDB();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM user WHERE idUser = ?");
            st.setInt(1,t.getIdUser());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDB();
        }
    }
    
}
