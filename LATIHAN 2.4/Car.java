public class Car {

    int cadence;
    int speed;
    int gear;

    public void changeCadence(int changeCadence) {
        cadence = changeCadence;
    }

    public void speedUP(int speedUp) {
        speed = speedUp;
    }

    public void changeGear(int changeGear) {
        gear = changeGear;
    }

    public void printInfo() {
        System.out.println(
                "Change Cadence: " + cadence + "\n" + "Speed Up: " + speed + "\n" + "Gear: " + gear);
    }

}
