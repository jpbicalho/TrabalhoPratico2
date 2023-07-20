/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufop.trabalhopratico2.dados;
import com.ufop.trabalhopratico2.modelo.Autor;
import com.ufop.trabalhopratico2.modelo.Categoria;
import com.ufop.trabalhopratico2.modelo.Livro;
import com.ufop.trabalhopratico2.modelo.Usuario;
import com.ufop.trabalhopratico2.modelo.Funcionario;
import com.ufop.trabalhopratico2.modelo.Emprestimo;
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
    public  static List<Autor> autores = new ArrayList<>();
    public static List<Funcionario> funcionarios = new ArrayList<>();
    public static List<Usuario> users = new ArrayList<>();
    public static List<Livro> livros = new ArrayList<>();
    public static List<Categoria> categorias = new ArrayList<>();
    public static List<Emprestimo> emprestimos = new ArrayList<>();
}
