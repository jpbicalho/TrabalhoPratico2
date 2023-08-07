/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;
import Modelo.Autor;
import Modelo.Categoria;
import Modelo.Livro;
import Modelo.Usuario;
import Modelo.Funcionario;
import Modelo.Emprestimo;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author joaop
 */
public class Dados {
    /*
    Classe que armazena as informações criadas
       */
    public  static List<Autor> autores = new ArrayList<>();//dao feito 
    public static List<Funcionario> funcionarios = new ArrayList<>();//dao feito 
    public static List<Usuario> users = new ArrayList<>();//dao feito
    public static List<Livro> livros = new ArrayList<>();//dao feito 
    public static List<Categoria> categorias = new ArrayList<>();
    public static List<Emprestimo> emprestimos = new ArrayList<>();//dao feito
    public static int contador;
}
