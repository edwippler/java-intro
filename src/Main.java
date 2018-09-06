import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Part 1 - Hello World and Simple Object
//        System.out.println("Hello World");
//        System.out.println("Igor the Goobs");
//
//        Car myCar = new Car(32.5,
//                "LFS953",
//                Color.BLACK,
//                true);
//
//        Car sideCar = new Car(36.4,
//                "CHA411",
//                Color.CYAN,
//                false);
//
//        System.out.println("My Car's License Plate: " + myCar.licensePlate);
//        System.out.println("Side Car License Plate: " + sideCar.licensePlate);
//
//        System.out.println("Side car original color is " + sideCar.paintColor.toString());
//        sideCar.changePaintColor(Color.RED);
//        System.out.println("Side car new color is " + sideCar.paintColor.toString());

        // Part 2 - Strings and Inputs
//        System.out.println("Enter a work:");
//        Scanner sc = new Scanner(System.in);
//        int userNumber = sc.nextInt();
//        System.out.println(userNumber);
//        double userNumber2 = sc.nextDouble();
//        System.out.println(userNumber2);
//
//        String userInput = sc.next();
//        String upperCased = userInput.toUpperCase();
//        System.out.println(userInput);
//        System.out.println(upperCased);
//
//        char firstCharacter = userInput.charAt(0);
//        System.out.println(firstCharacter);
//
//        System.out.println("Contains: " +
//                userInput.contains("Enter".toLowerCase()));

        // Part 3 - Arrays
//        int[] numbers = new int[5];
//        numbers[0] = 31;
//        numbers[1] = 45;
//        numbers[2] = 22;
//        numbers[3] = 98;
//        numbers[4] = 10;
//
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//
//        int[] numbers2 = {31, 45, 22, 98, 10};
//
//        String[] favoriteCandyBars = {"Twix", "Snickers", "Kit Kat", "Toblerone", "Almond Joy"};
//        System.out.println("Second Favorite Candy Bar is: " + favoriteCandyBars[1]);
//
//        favoriteCandyBars[2] = "Butterfinger";
//        System.out.println("Wait, it is actually " + favoriteCandyBars[1]);
//
//        System.out.println(Array.get(favoriteCandyBars, 3));

        // Part 4 - Call by Value vs Call by Reference
//        double myCarSpeed = 55;
//        myCarSpeed =  myCar.speedingUp(myCarSpeed);
//        System.out.println(myCarSpeed);

        // Challenge
        Pet myPet = new Pet("Igor",
                2.3,
                "cat",
                Color.ORANGE,
                "meow");

        System.out.println("My pet's current age is " + myPet.age);
        myPet.getOlder(myPet.age);
        System.out.println("My pet got older and is now " + myPet.age);

        myPet.makeSound(myPet.sound);

        System.out.println("My pet was a " + myPet.animalType + " until it morphed.");
        myPet.shapeShift("Sheep");
        System.out.println("My pet is now a " + myPet.animalType);
    }
}
