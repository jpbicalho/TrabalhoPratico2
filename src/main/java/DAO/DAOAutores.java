/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelo.Autor;
import java.util.List;

/**
 *
 * @author joaop
 */
public class DAOAutores implements DAOInterface<Autor>{
     DAOAutores(){}
    @Override
    public void incluir(Autor func){
        Dados.Dados.autores.add(func);
    }
    
    @Override
    public Autor localizar(int id){
        for(int i=0;i<Dados.Dados.autores.size();i++){
            if(Dados.Dados.autores.get(i).getId() == id){
                return Dados.Dados.autores.get(i);
            }
        }
        return null;
   
    } 
    @Override
    public void atualizar(Autor t){
        Dados.Dados.autores.set(t.getId(),t);
    }
    
    @Override
    public void remover(Autor t){
        Dados.Dados.autores.remove(t);
    }
    
    @Override
    public List<Autor> getLista(){
        return Dados.Dados.autores;
    }
}
