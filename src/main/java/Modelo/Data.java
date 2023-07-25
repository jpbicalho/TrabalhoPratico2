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
    Data(int day, int month){
        int dia = day;
        int mes = month;
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
}
