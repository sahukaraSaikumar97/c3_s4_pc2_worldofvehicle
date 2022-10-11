package base;

public class ElectricalEngines extends Engines{
    private final String batteryType;
    private final double voltage;

    public ElectricalEngines(long modelNumber, int maxPower, int maxRpm, String batteryType, double voltage) {
        super(modelNumber, maxPower, maxRpm);
        this.batteryType = batteryType;
        this.voltage = voltage;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public double getVoltage() {
        return voltage;
    }

    public void display(){

        System.out.println(" Specifications of Electric Engines");
        System.out.println("MaxPower ="+getMaxPower());
        System.out.println("Max Rpm ="+getMaxRpm());
        System.out.println("Model Number ="+getModelNumber());
        System.out.println("Voltage ="+getVoltage());
        System.out.println("Battery type ="+getBatteryType());

    }

}
