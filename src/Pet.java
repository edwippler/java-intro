import java.awt.*;

public class Pet {

    String name;
    double age;
    String animalType;
    Color color;
    String sound;

    public Pet(String petName,
               double petAge,
               String petAnimalType,
               Color petColor,
               String petSound)
    {
        this.name = petName;
        this.age = petAge;
        this.animalType = petAnimalType;
        this.color = petColor;
        this.sound = petSound;
    }

    public double getOlder(double currentAge) {
        return  this.age = currentAge + 1;
    }

    public static void makeSound(String petSound) {
        System.out.println(petSound);
    }

    public void shapeShift(String newAnimalType) {
        this.animalType = newAnimalType;
    }

}
