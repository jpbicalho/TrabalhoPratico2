/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import static Dados.Dados.contador;
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
    public Livro(String title){
        id = contador; contador++;
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
    public void CopiaAutores(List<Autor> lAutor){
        for(Autor element : lAutor){
            AdicionaAutor(element);
        }
    }
    public void CopiaCategorias(ArrayList<Categoria> lCategoria){
        for(Categoria element : lCategoria){
            AdicionaCategoria(element);
        }
    }
    public void AdicionaCategoria(Categoria nCat){
        categorias.add(nCat);
    }
    public List<Autor> getAutores(){
        return autores;
    }
    public List<Categoria> getCategorias(){
        return categorias;
    }

    @Override
    public String toString() {
        StringBuilder concatena = new StringBuilder();
        for(Autor aut : autores){
            concatena.append(aut.getNome()).append(", ");
        }
        var concatCat = new StringBuilder();
        for(Categoria cat : categorias){
            concatCat.append(cat.getTitulo()).append(", ");
        }
        return getTitulo() + concatena + concatCat;
    }
   
    
}
