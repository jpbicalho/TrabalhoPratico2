/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author joaop
 */
public class Funcionario extends Pessoa {
    private int matricula;
    public Funcionario(int i,String name,String nickname,int mat){
        super(i,name,nickname);
        matricula = mat;
    }
    public void setMatricula(int mat){
        matricula = mat;
    }
    public int getMatricula(){
        return matricula;
    }
    @Override
    public String toString(){
        return super.toString() + "Matricula: " + matricula;
    }
    
    public boolean equals(Funcionario f){
        if( f instanceof Funcionario){
            if(this.matricula == f.getMatricula()){
                return false;
        }else{ 
                return false;
        
            }
        }
        return false;
    }
}
