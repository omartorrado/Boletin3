/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3;

/**
 *
 * @author otorradomiguez
 */
public class Consumo {
    //atributos
    private float km,litros,vMed,pGas;
    //Constructores
    public Consumo(){
        km=0;
        litros=0;
        vMed=0;
        pGas=0;
        
    }
    //hay que definir el tipo de todas las variables locales
    public Consumo(float a, float b, float c,float d){
        km=a;
        litros=b;
        vMed=c;
        pGas=d;
    }
    //Metodos
    //Mejorar este metodo pàra que de el tiempo en h,m y s
    public float getTiempo(){
        float floathoras= km/vMed;
        return floathoras;
    }
    
    public float consumoMedio(){
        return litros/(km/100);
    }
    
    public float consumoEuros(){
        float cm=consumoMedio();
        return cm*pGas;
    }
    
    public void setKm(float n){
        km=n;
    }
    public void setLitros(float n){
        litros=n;
    }
    public void setVMed(float n){
        vMed=n;
    }
    public void setPGas(float n){
        pGas=n;
    }
    public float getKM(){
        return km;
    }
    public float getLitros(){
        return litros;
    }
    public float getVMed(){
        return vMed;
    }
    public float getPGas(){
        return pGas;
    }
    
}
