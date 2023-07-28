/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author joaop
 */
public class Autor extends Pessoa{
    private String biografia;
    public Autor(int i,String name,String nickname,String bio){
        super(i,name,nickname);
        biografia = bio;
    }

    public Autor() {
        super(0,"","");
        biografia = "";
    }
    public void setBiografia(String bio){
        biografia = bio;
    }
    public String getBiografia(){
        return biografia;
    }
    @Override
    public String toString(){
        return super.toString() + "Biografia: " + biografia;
    }
    
}
