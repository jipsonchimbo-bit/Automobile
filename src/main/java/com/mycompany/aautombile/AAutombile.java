
package com.mycompany.aautombile;

import com.mycompany.aautombile.Enum.CarType;
import com.mycompany.aautombile.Enum.Color;
import com.mycompany.aautombile.Enum.FuelType;

public class AAutombile {

    public static void main(String[] args) {
        
        Automobile[] automobile;
        automobile = new Automobile[2];
        
        automobile[0] = new Automobile ("Toyota",2024, "Motor Gasolina", FuelType.GASOLINE, CarType.COMPACT, 4, 99, 70, Color.BLACK, 100);
        automobile[1] = new Automobile ("Izusu", 2025, "Motor Diesel", FuelType.DIESEL, CarType.CITYCAR, 4, 100, 80, Color.BLACK, 100);
        
        
        for (int i = 0; i < automobile.length; i++) {
            System.out.println(" Automobile "+ (i+1));
            automobile[i].Imprimir();
        }
    
        
    }
}