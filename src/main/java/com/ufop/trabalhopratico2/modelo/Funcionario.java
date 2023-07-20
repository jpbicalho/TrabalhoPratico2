/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufop.trabalhopratico2.modelo;

/**
 *
 * @author joaop
 */
public class Funcionario extends Pessoa {
    private int matricula;
    Funcionario(int i,String name,String nickname,int mat){
        super(i,name,nickname);
        matricula = mat;
    }
    public void setMatricula(int mat){
        matricula = mat;
    }
    public int getMatricula(){
        return matricula;
    }
}
