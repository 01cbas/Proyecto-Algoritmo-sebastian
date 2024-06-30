package DAO.interfaces;

import java.util.ArrayList;

public interface CRUD<T> {
    public void create(T t) throws Exception;
    public ArrayList<T> readAll() throws Exception;
    public T readBy (T t) throws Exception;
    public void update(T t) throws Exception;
    public void delete(T t) throws Exception;
}