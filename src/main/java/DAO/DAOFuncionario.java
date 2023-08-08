/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Modelo.Funcionario;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author joaop
 */
public class DAOFuncionario implements DAOInterface<Funcionario> {
    
    public DAOFuncionario(){
    }
    @Override
    public void incluir(Funcionario func){
        Dados.Dados.funcionarios.add(func);
    }

    public Funcionario localizar(Funcionario func){
        var mat = func.getMatricula();
        for(int i=0;i< Dados.Dados.funcionarios.size() ;i++){
            if(mat == Dados.Dados.funcionarios.get(i).getMatricula()){
                return Dados.Dados.funcionarios.get(i);
            }
        }
        return null;
    }
    public Funcionario localizar(String nome){
        for(int i=0;i< Dados.Dados.funcionarios.size();i++){
            if(nome == Dados.Dados.funcionarios.get(i).getNome()){
                return Dados.Dados.funcionarios.get(i);
        }
        
        }
        return null;
    }
    @Override
    public void atualizar(Funcionario t){
        Dados.Dados.funcionarios.set(t.getId(),t);
    }
    @Override
    public void remover(Funcionario t){
        Dados.Dados.funcionarios.remove(t);
    }
    public boolean remove(Funcionario t){
        return Dados.Dados.funcionarios.remove(t);
    }
    @Override
    public List<Funcionario> getLista(){
        return Dados.Dados.funcionarios;
    }
    
    public boolean validaCriacao(Funcionario func){
        return  localizar(func) ==  null;
        
    }

    @Override
    public Funcionario localizar(int mat) {
        for(int i=0;i<Dados.Dados.funcionarios.size();i++){
            int comparaMat = Dados.Dados.funcionarios.get(i).getMatricula();
            if(comparaMat == mat){
                return Dados.Dados.funcionarios.get(i);
            }
        }
        return null;
    }
}
