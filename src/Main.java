import java.awt.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Igor the Goobs");

        Car myCar = new Car(32.5,
                "LFS953",
                Color.BLACK,
                true);

        Car sideCar = new Car(36.4,
                "CHA411",
                Color.CYAN,
                false);

        System.out.println("My Car's License Plate: " + myCar.licensePlate);
        System.out.println("Side Car License Plate: " + sideCar.licensePlate);

        System.out.println("Side car original color is " + sideCar.paintColor.toString());
        sideCar.changePaintColor(Color.RED);
        System.out.println("Side car new color is " + sideCar.paintColor.toString());
    }
}
