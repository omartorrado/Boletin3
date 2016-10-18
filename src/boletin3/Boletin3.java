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
public class Boletin3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 1 pruebas
//        Consumo coche1= new Consumo();
//        System.out.println(coche1.consumoEuros());
//        System.out.println(coche1.getKM()+" "+coche1.getLitros()+" "+coche1.getVMed()+" "+coche1.getPGas());
//        //Consumo coche2= new Consumo(500,25,120,1.3124f);
//        Consumo coche2 = new Consumo(500,25,100,5);
//        System.out.println(coche2.consumoEuros());
//        System.out.println(coche2.consumoMedio());
//        System.out.println(coche2.getKM()+" "+coche2.getLitros()+" "+coche2.getVMed()+" "+coche2.getPGas());
//        System.out.println(coche1.getTiempo());
//        System.out.println(coche2.getTiempo());
//        Consumo coche3 = new Consumo(437,92,97,37);
//        System.out.println(coche3.getTiempo());
        
        //Ejercicio 1
        Consumo coche1 = new Consumo();
        coche1.ver_atributos();
        coche1.setLitros(50);
        coche1.ver_atributos();
        coche1.setPGas(1.57f);
        coche1.ver_atributos();
        Consumo coche2 = new Consumo(500,43,98.2f,1.57f);
        coche2.ver_atributos();
        System.out.println(coche2.consumoMedio()+" litros cada 100 Km");
        coche2.setLitros(90);
        System.out.println(coche2.getVMed()+" Km/h");
        coche2.ver_atributos();
    }
    
}
