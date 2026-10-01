
package com.mycompany.aautombile.datasource;

import com.mycompany.aautombile.dataaccessobjet.DaoAutomobiles;

public abstract class Automobiles implements DaoAutomobiles {

    public void accelerate(int incremento) {
    }

    public void decelerate(int decremento) {
    }

    public void curb() {
    }

    public double CalculateTime(int distancia) {

        return 0.0;
    }

    public void imprimir() {
    }
}