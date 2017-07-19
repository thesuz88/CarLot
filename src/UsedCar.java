/**
 * Created by Steve on 7/18/2017.
 */
public class UsedCar extends Car {
    private double milage;

    public UsedCar(String make, String model, int year, double price, double milage) {
        super(make, model, year, price);
        this.milage = milage;
    }

    public double getMilage() {
        return milage;
    }

    public void setMilage(double milage) {
        this.milage = milage;
    }

@Override
    public String toString(){
        return super.toString() + "\t(Used)\t" + milage;
}

}
