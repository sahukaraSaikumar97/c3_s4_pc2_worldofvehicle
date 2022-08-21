package base;

public class IcEngines extends Engines{
    private final int displacement;
    private final int NumberOfCylinders;

    public IcEngines(long modelNumber, int maxPower, int maxRpm, int displacement, int numberOfCylinders) {
        super(modelNumber, maxPower, maxRpm);
        this.displacement = displacement;
        NumberOfCylinders = numberOfCylinders;
    }

    public int getDisplacement() {
        return displacement;
    }

    public int getNumberOfCylinders() {
        return NumberOfCylinders;
    }

}
