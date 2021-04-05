public class Car {
    int gear = 1;
    int speed = 0;
    int seat = 2;
    int light = 1;
    void changeGear(int anotherGear){
        gear = anotherGear;
    }
    void increaseSpeed(int increment){
        speed = increment;
    }
    void increaseSeat(int increaseSeatNumber){
        seat = increaseSeatNumber;
    }
    void increaseLightening(int incrementing){
        light = incrementing;
    }
    void printProperties(){
        System.out.println("gear " + gear + "speed " + speed + "seat " + seat + "light" + light);
   }
    public Car(){
        int gear = 1;
        int speed = 0;
        int seat = 2;
        int light = 1;
    }

    public Car(int gear,int speed,int seat,int light){
        this.gear = gear;
        this.speed = speed;
        this.seat = seat;
        this.light = light;
        System.out.println("gear " + gear + "speed " + speed + "seat " + seat + "light" + light);
    }


}
