/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufop.trabalhopratico2.modelo;

/**
 *
 * @author joaop
 */
public class Emprestimo {
    private int id;
    private int idFuncionario;
    private int idUsuario;
    private int idLivro;
    private Data dataEmprestimo;
    
    public Emprestimo(int id1,int id2,int id3,int id4,Data date){
        id = id1;
        idFuncionario = id2;
        idUsuario = id3;
        idLivro = id4;
        dataEmprestimo = date;
    
    }
    public void setId(int id){
        this.id = id;
    }
    public void setIdFuncionario(int id){
        idFuncionario = id;
    }
    public void setIdUsuario(int id){
        idUsuario = id;
    }
    public void setIdLivro(int id){
        idLivro = id;
    }
    
}
