/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaop
 */
public class Livro {
    private int id;
    private String titulo;
    private List<Autor> autores = new ArrayList();
    private List<Categoria> categorias = new ArrayList();
    public Livro(int nId,String title){
        id = nId;
        titulo = title;
        autores = new ArrayList<>();
        categorias = new ArrayList<>();
    }
    public void setTitulo(String t){
        titulo = t;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
    public String getTitulo(){
        return titulo;   
    }
    public void AdicionaAutor(Autor nAutor){
        autores.add(nAutor);
    }
    public void AdicionaCategoria(Categoria nCat){
        categorias.add(nCat);
    }
    public List<Autor> getAutores(){
        return autores;
    }
    
}
