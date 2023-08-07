/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.util.List;
import Modelo.Livro;

/**
 *
 * @author joaop
 */
public class DAOLivro implements DAOInterface<Livro>{
    @Override
    public void incluir(Livro func){
        Dados.Dados.livros.add(func);
    }
    @Override
    public Livro localizar(int id){
        for(int i=0;i<Dados.Dados.livros.size();i++){
            if(Dados.Dados.livros.get(i).getId() == id){
                return Dados.Dados.livros.get(i);
            }
        }
        
        return null;
    }
    public Livro localizar(String nome){
        for(int i=0;i< Dados.Dados.livros.size();i++){
            if(nome == Dados.Dados.livros.get(i).getTitulo()){
                return Dados.Dados.livros.get(i);
        }
        
        }
        return null;
    }
    @Override
    public void atualizar(Livro t){
        //Dados.Dados.livros.set(t.getId(),t);
        for(int i = 0; i < Dados.Dados.livros.size();i++){
            if(Dados.Dados.livros.get(i).getTitulo().equals(t.getTitulo()) ){
                Dados.Dados.livros.set(i, t);
            }
        }
    }
    @Override
    public void remover(Livro t){
        Dados.Dados.livros.remove(t);
    }
    @Override
    public List<Livro> getLista(){
        return Dados.Dados.livros;
    }
    
}
