/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import java.util.List;

/**
 *
 * @author joaop
 */
public interface DAOInterface<T> {
    public void incluir(T t);
    public T localizar(int id);
    public void atualizar(T t);
    public void remover(T t);
    public List<T> getLista();
    
    
}
