package ro.sda.json;

import lombok.Getter;

@Getter
public class Car {
    private String brand;
    @lombok.Getter
    private String color;
    @lombok.Getter
    private int horsePower;
    private boolean isManual;

    public Car() {
        System.out.println("Default constructor called!");
    }

    public Car(String brand, String color, int horsePower, boolean isManual) {
        this.brand = brand;
        this.color = color;
        this.horsePower = horsePower;
        this.isManual = isManual;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", horsePower=" + horsePower +
                ", isManual=" + isManual +
                '}';
    }
}
