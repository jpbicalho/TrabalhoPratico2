/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Modelo.Funcionario;
import java.util.List;
/**
 *
 * @author joaop
 */
public class DAOFuncionario implements DAOInterface<Funcionario> {
    @Override
    public void incluir(Funcionario func){
        Dados.Dados.funcionarios.add(func);
    }
    @Override
    public Funcionario localizar(int id){
        for(int i=0;i<Dados.Dados.funcionarios.size();i++){
            if(Dados.Dados.funcionarios.get(i).getMatricula() == id){
                return Dados.Dados.funcionarios.get(i);
            }
        }
        Funcionario ret = new Funcionario(0,"nulo","nulo",0);
        return ret;
    }
    @Override
    public void atualizar(Funcionario t){
        Dados.Dados.funcionarios.set(t.getId(),t);
    }
    @Override
    public void remover(Funcionario t){
        Dados.Dados.funcionarios.remove(t);
    }
    @Override
    public List<Funcionario> getLista(){
        return Dados.Dados.funcionarios;
    }
}
