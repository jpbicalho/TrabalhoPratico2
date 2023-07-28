package DAO;



import Modelo.Categoria;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joaop
 */
public class DAOCategoria implements DAOInterface<Categoria>{
    public DAOCategoria(){}
    @Override
    public void incluir(Categoria func){
        Dados.Dados.categorias.add(func);
    }
    
    @Override
    public Categoria localizar(int id){
        for(int i=0;i<Dados.Dados.categorias.size();i++){
            if(Dados.Dados.categorias.get(i).getId() == id){
                return Dados.Dados.categorias.get(i);
            }
        }
        return null;
   
    }
    
    public Categoria localizar(String nome){
        for(int i=0;i<Dados.Dados.categorias.size();i++){
            if(Dados.Dados.categorias.get(i).getTitulo() == nome){
                return Dados.Dados.categorias.get(i);
            }
        }
        return null;
   
    } 
    
    @Override
    public void atualizar(Categoria t){
        Dados.Dados.categorias.set(t.getId(),t);
    }
    
    @Override
    public void remover(Categoria t){
        Dados.Dados.categorias.remove(t);
    }
    
    @Override
    public List<Categoria> getLista(){
        return Dados.Dados.categorias;
    }
}
