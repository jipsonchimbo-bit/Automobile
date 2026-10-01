
package com.mycompany.aautombile;

import com.mycompany.aautombile.Enum.CarType;
import com.mycompany.aautombile.Enum.Color;
import com.mycompany.aautombile.Enum.FuelType;

public class Automobile {
    private String Brand;
    private int Model;
    private String Engine;
    private FuelType FuelType;
    private CarType CarType;
    private int NumberDoors;
    private int SeatingCapacity;
    private float MaximumSpeed;
    private Color Color;
    private float CurrentSpeed;

    public Automobile() {
    }

    public Automobile(String Brand, int Model, String Engine, FuelType FuelType, CarType CarType, 
        int NumberDoors, int SeatingCapacity, float MaximumSpeed, Color Color, float CurrentSpeed) {
        
        this.Brand = Brand;
        this.Model = Model;
        this.Engine = Engine;
        this.FuelType = FuelType;
        this.CarType = CarType;
        this.NumberDoors = NumberDoors;
        this.SeatingCapacity = SeatingCapacity;
        this.MaximumSpeed = MaximumSpeed;
        this.Color = Color;
        this.CurrentSpeed = CurrentSpeed;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public int getModel() {
        return Model;
    }

    public void setModel(int Model) {
        this.Model = Model;
    }

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    public FuelType getFuelType() {
        return FuelType;
    }

    public void setFuelType(FuelType FuelType) {
        this.FuelType = FuelType;
    }

    public CarType getCarType() {
        return CarType;
    }

    public void setCarType(CarType CarType) {
        this.CarType = CarType;
    }

    public int getNumberDoors() {
        return NumberDoors;
    }

    public void setNumberDoors(int NumberDoors) {
        this.NumberDoors = NumberDoors;
    }

    public int getSeatingCapacity() {
        return SeatingCapacity;
    }

    public void setSeatingCapacity(int SeatingCapacity) {
        this.SeatingCapacity = SeatingCapacity;
    }

    public float getMaximumSpeed() {
        return MaximumSpeed;
    }

    public void setMaximumSpeed(float MaximumSpeed) {
        this.MaximumSpeed = MaximumSpeed;
    }

    public Color getColor() {
        return Color;
    }

    public void setColor(Color Color) {
        this.Color = Color;
    }

    public float getCurrentSpeed() {
        return CurrentSpeed;
    }

    
    public void setCurrentSpeed(float CurrentSpeed) {
        if (CurrentSpeed > MaximumSpeed) {
            System.out.println("No exceder la velocidad maxima (" + MaximumSpeed + " km/h). Poner la velocidad maxima.");
            this.CurrentSpeed = MaximumSpeed;
        } else if (CurrentSpeed < 0) {
            System.out.println("La velocidad no puede ser negativa. Ajuste de velocidad a 0.");
            this.CurrentSpeed = 0;
        } else {
            this.CurrentSpeed = CurrentSpeed;
        }
    }
    
    
    public void Accelerate(double increment) {
        if (increment < 0) {
            System.out.println("Reducir velocidad.");
            return;
        }
        double newSpeed = this.CurrentSpeed + increment;
        setCurrentSpeed((float) newSpeed);
        System.out.println("Acelerado por " + increment + " km/h. Velocidad actual: " + this.CurrentSpeed + " km/h");
    }
    
    
    public void Brake() {
        setCurrentSpeed(0);
        System.out.println("Freno aplicado <- Velocidad actual: " + this.CurrentSpeed + " km/h");
    }
    
    
     public double EstimatedArrivalTime(double distanceKm) {
        if (CurrentSpeed <= 0) {
            System.out.println("Error.. la velocidad actual es ero por lo que no se puede calcular el tiempo de llegada");
            return Double.POSITIVE_INFINITY;
        }
        return distanceKm / CurrentSpeed;
    }
     
    public void Imprimir(){
        System.out.println("Marca: "+Brand);
        System.out.println("Modelo: "+Model);
        System.out.println("Motor: "+Engine);
        System.out.println("Tipo de Combustible: "+FuelType);
        System.out.println("Tipo de Carro: "+CarType);
        System.out.println("Numero de Puertas: "+NumberDoors);
        System.out.println("Capacidad de Acientos: "+SeatingCapacity);
        System.out.println("Velocidad Maxima: "+MaximumSpeed);
        System.out.println("Color: "+Color);
        System.out.println("Velocidad Actual: "+CurrentSpeed);
    }
    
}
