import java.awt.*;

public class Car {

    double averageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTailLightsWorking;

    public Car(double inputAverageMPG,
               String inputLicensePlate,
               Color inputPaintColor,
               Boolean inputAreTailLightsWorking)
    {
        this.averageMilesPerGallon = inputAverageMPG;
        this.licensePlate = inputLicensePlate;
        this.paintColor = inputPaintColor;
        this.areTailLightsWorking = inputAreTailLightsWorking;

    }

    public void changePaintColor(Color newPaintColor) {
        this.paintColor = newPaintColor;
    }

    public double speedingUp(double currentSpeed) {
        currentSpeed += 100;
        return currentSpeed;
    }

}
