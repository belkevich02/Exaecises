public class MainTest {
    void useCar(Car car){
        car.driving();
        System.out.println(car.getNumOfSeets());

    }
    public static void main(String[] args){
        MainTest mainTest = new MainTest();
        Car car = new Toyota();
        mainTest.useCar(car);
    }
}
