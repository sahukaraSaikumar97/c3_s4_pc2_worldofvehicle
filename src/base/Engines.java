package base;

public class Engines {
        private final long modelNumber;
        private final int maxPower;
        private final int maxRpm;

        public Engines(long modelNumber, int maxPower, int maxRpm) {
            this.modelNumber = modelNumber;
            this.maxPower = maxPower;
            this.maxRpm = maxRpm;
        }

        public long getModelNumber() {
            return modelNumber;
        }


        public int getMaxPower() {
            return maxPower;
        }


        public int getMaxRpm() {
            return maxRpm;
        }




        public void display() {
            System.out.println("modelNumber = " + modelNumber);
            System.out.println("maxPower = " + maxPower);
            System.out.println("maxRpm = " + maxRpm);

        }
}
