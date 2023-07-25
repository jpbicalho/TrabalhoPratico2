/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author joaop
 */
public class Pessoa {
    private int id;
    private String nome;
    private String sobrenome;
    public void setId(int i){
        id = i;
    }
    public void setNome(String name){
        nome = name;
    }
    public void setSobrenome(String nickname){
        sobrenome = nickname;
    }
    public int getId(){
        return id;
    }
    public String getNome(){    
        return nome;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }
    
    public Pessoa(int i,String name,String nickname){
        id = i;
        nome =  name;
        sobrenome = nickname;
    }
            
    @Override
    public String toString(){
        return "Nome: " + nome + "Sobrenome: "+ sobrenome +"Id: " + id; 
    }
}
