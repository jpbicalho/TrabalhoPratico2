package DAO;



import Modelo.Categoria;
import java.util.ArrayList;
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
        if(validaCriacao(func) == true){
        Dados.Dados.categorias.add(func);
        }
    }
    
    @Override
    public Categoria localizar(int id){
        if (id >= 0) {
            return Dados.Dados.categorias.get(id);
        }else return null;
   
    }
    
    public Categoria localizar(String nome){
        String nomeLista;
        for(int i=0;i<Dados.Dados.categorias.size();i++){
            nomeLista = Dados.Dados.categorias.get(i).getTitulo();
            if(nome.equals(nomeLista)){
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
    public ArrayList<Categoria> getLista(){
        return (ArrayList<Categoria>) Dados.Dados.categorias;
    }
//    funcao que retorna verdadeiro se nao encontrar o nome
    
    public boolean validaCriacao(Categoria nCat){
       String title = nCat.getTitulo();
        return localizar(title) == null;
       
    }
}
