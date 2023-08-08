/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelo.Funcionario;
import Modelo.Usuario;
import java.util.List;

/**
 *
 * @author joaop
 */
public class DAOUsuario implements DAOInterface<Usuario>{
    public DAOUsuario(){}
    @Override
    public void incluir(Usuario func){
        Dados.Dados.users.add(func);
    }
    
    @Override
    public Usuario localizar(int id){
        for(int i=0;i<Dados.Dados.users.size();i++){
            if(Dados.Dados.users.get(i).getRegistroAcademico() == id){
                return Dados.Dados.users.get(i);
            }
        }
        return null;
   
    } 
    public Usuario localizar(String nome){
        for(int i=0;i< Dados.Dados.users.size();i++){
            if(nome == Dados.Dados.users.get(i).getNome()){
                return Dados.Dados.users.get(i);
        }
        
        }
        return null;
    }
    @Override
    public void atualizar(Usuario t){
        Dados.Dados.users.set(t.getId(),t);
    }
    
    @Override
    public void remover(Usuario t){
        Dados.Dados.users.remove(t);
    }
    
    @Override
    public List<Usuario> getLista(){
        return Dados.Dados.users;
    }
}
    
    
   
