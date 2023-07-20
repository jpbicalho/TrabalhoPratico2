/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufop.trabalhopratico2.modelo;

/**
 *
 * @author joaop
 */
public class Usuario extends Pessoa {
    private int registroAcademico;
    Usuario(int i,String name,String nickname,int reg){
        super(i,name,nickname);
        registroAcademico = reg;
    }
    public void setRegistroAcademico(int reg){
        registroAcademico = reg;
    }
    public int getRegistroAcademico(){
        return registroAcademico;
    }
    @Override
    public String toString(){
        return super.toString() + "Registro Academico: " + registroAcademico;
    }
}
