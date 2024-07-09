public class Car {
    private String make;
    private String model;
    private int year;
    private int lastOilChangeMileage;

    public Car(String make, String model, int year, int lastOilChangeMileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.lastOilChangeMileage = lastOilChangeMileage;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }


}

