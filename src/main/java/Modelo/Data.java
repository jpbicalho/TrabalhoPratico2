/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author joaop
 */
public class Data {
    private int dia;
    private int mes;
    public Data(int day, int month){
        setDia(day);
        setMes(month);
    }
    public void setDia(int n){
        dia = n;
    }
    public void setMes(int n){
        mes = n;
    }
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public String toString(){
        int nDia = getDia();
        int nMes = getMes();
        String sDia = String.valueOf(nDia);
        String sMes = String.valueOf(nMes);
        return sDia + "/" + sMes;
                
    }
}
