package javaoop._4;


public class ExerciseLunch {
    public Double price = null;
    public String nameOfDayEaten = null;
    public int lunchWeightInGrams;

    public static final double MAX_PRICE = 5;
    private static final int WEEKS_IN_A_YEAR = 52;
    private static final int DAYS_IN_A_WEEK = 7;
    private static final int HOURS_IN_A_DAY = 24;

    public int numberOfTimesWeHaveGotPrice = 0;

     ExerciseLunch(Double price, String nameOfDayEaten) {
        this.price = price;
        this.nameOfDayEaten = nameOfDayEaten;
    }

    public static void printMaxPrice() {  //3: static added
        System.out.println(MAX_PRICE);
    }

    public void printLunch() {
        System.out.println("Lunch{" +
                "price=" + price +
                ", nameOfDayEaten='" + nameOfDayEaten + '\'' +
                ", lunchWeightInGrams='" + lunchWeightInGrams + '\'' +
                '}');
    }

    public void setPrice(double price) {
        if (price > MAX_PRICE) {
            System.out.println("Cannot set greater than max price");
        } else {
            this.price = price;
        }
    }

    public Double getPrice() {
        numberOfTimesWeHaveGotPrice = numberOfTimesWeHaveGotPrice + 1;
        return this.price;
    }

    public int getNumberOfTimesWeHaveGotPrice() {
        return this.numberOfTimesWeHaveGotPrice;
    }

    public String getNameOfDayEaten() {
        return nameOfDayEaten;
    }

    public int getLunchWeightInGrams() {
        return lunchWeightInGrams;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setNameOfDayEaten(String nameOfDayEaten) {
        this.nameOfDayEaten = nameOfDayEaten;
    }

     void setLunchWeightInGrams(int lunchWeightInGrams) {  //2a public ; 2b default
        this.lunchWeightInGrams = lunchWeightInGrams;
    }

    public void setNumberOfTimesWeHaveGotPrice(int numberOfTimesWeHaveGotPrice) {
        this.numberOfTimesWeHaveGotPrice = numberOfTimesWeHaveGotPrice;
    }
}
