public class MainLesson5 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car(9,90,6,6);
        car.increaseLightening(6);
        System.out.println(car);
        car1.increaseSpeed(90);
        System.out.println(car1);
    }
}
