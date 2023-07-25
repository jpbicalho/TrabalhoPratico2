/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Modelo.Emprestimo;
import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author joaop
 */
public class DAOEmprestimo implements DAOInterface<Emprestimo>{
    @Override 
    public void incluir(Emprestimo func){
        Dados.Dados.emprestimos.add(func);
    }
    @Override
    public Emprestimo localizar(int id){
        for(int i=0;i<Dados.Dados.funcionarios.size();i++){
            if(Dados.Dados.funcionarios.get(i).getMatricula() == id){
                return Dados.Dados.emprestimos.get(i);
            }else{
                throw new NoSuchElementException("A ID buscada não foi encontrada");
            }
        }
            return null;
    }
    
    @Override
    public void atualizar(Emprestimo t){
        Dados.Dados.emprestimos.set(t.getId(),t);
    }
    @Override
    public void remover(Emprestimo t){
        Dados.Dados.emprestimos.remove(t);
    }
    @Override
    public List<Emprestimo> getLista(){
        return Dados.Dados.emprestimos;
    }
}
