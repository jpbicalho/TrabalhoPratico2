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
    public Funcionario(String name,String nickname,int mat){
        super(name,nickname);
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
        return super.toString() + " Matricula: " + matricula;
    }
    
    public boolean equals(Funcionario f){
        if( f instanceof Funcionario){
            if(this.matricula == f.getMatricula()){
                if(this.getId() == f.getId()){
                    if(this.getNome().equals(f.getNome())){
                        if(this.getSobrenome().equals(f.getSobrenome())){
                            return true;
                        }
                    }
                }
            }
        }
       return false;
    }
}