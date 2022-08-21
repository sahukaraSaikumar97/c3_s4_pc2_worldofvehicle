package base;

public class DiselEngines extends IcEngines{
    private final String fuelType;

    public DiselEngines(long modelNumber, int displacement,
                       int maxPower, int maxRpm, int noOfCylinders, String fuelType) {
        super(modelNumber, displacement, maxPower, maxRpm, noOfCylinders);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }


    public void display(){

        System.out.println(" Specificaton of Disel Engine ");
        System.out.println("Displacement ="+getDisplacement());
        System.out.println("Max power =" +getMaxPower());
        System.out.println("Max Rpm ="+getMaxRpm());
        System.out.println("Model Number ="+getModelNumber());
        System.out.println("number Of cylinders =" +getNumberOfCylinders());
        System.out.println("Fuel Type ="+getFuelType());
    }
}
