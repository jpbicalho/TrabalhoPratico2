/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import static Dados.Dados.contador;

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
    
    public Emprestimo(int id2,int id3,int id4,Data date){
        id = contador; contador++;
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
    public void setDataEmprestimos(Data date){
        
    }
    
    public int getId(){
        return id;
    }
    public int getIdFuncionario(){
        return idFuncionario;
    }
    public int getIdUsuario(){
        return idUsuario;
    }
    public int getIdLivro(){
        return idLivro;
    }
    public Data getData(){
        return dataEmprestimo;
    }
    
}
