public class Car {
    private String maker;
    private int model;

    //Default construction with initialized values
    public Car() {
        maker = "BMW";
        model = 2010;
    }

    //Another constructor that enables the user to enter the values he wants
    public Car(String m, int mod) {
        maker = m;
        model = mod;
    }


    //A method that returns the maker of the car
    public String getMaker() {
        return maker;
    }

    //A method to set the maker of the car
    public void setMaker(String m) {
        maker = m;
    }
}
