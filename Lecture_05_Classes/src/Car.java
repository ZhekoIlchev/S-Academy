public class Car {
    private String brand;
    private String model;
    private int horsepower;

    public Car() {
        this("unknown", "unknown", -1);
    }

    public Car(String brand) {
        this(brand, "unknown", -1);
    }

    public Car(String brand, String model) {
        this(brand, model, -1);
    }

    public Car(String brand, int horsepower) {
        this(brand, "unknown", horsepower);
    }


    public Car(String brand, String model, int horsepower) {
        this.brand = brand;
        this.model = model;
        this.horsepower = horsepower;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getCarInfo() {
        return String.format("Info: %s %s – %d HP.", this.getBrand(), this.getModel(), this.getHorsepower());
    }
}