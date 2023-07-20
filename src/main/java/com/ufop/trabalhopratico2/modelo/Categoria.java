/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufop.trabalhopratico2.modelo;

/**
 *
 * @author joaop
 */
public class Categoria {
    private int id;
    private String titulo;
    
    public Categoria(int nId,String title){
        id = nId;
        titulo = title;
    }
    public int getId(){
        return id;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setId(int i){
        id = i;
    }
    public void setTitulo(String title){
        titulo = title;
    }
}

