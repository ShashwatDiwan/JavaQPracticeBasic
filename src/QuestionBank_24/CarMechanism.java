package QuestionBank_24;

class Car{
    protected double batteryLevel;
    protected double carTemperature;

    Car(double batteryLevel,double carTemperature){
        this.batteryLevel = batteryLevel;
        this.carTemperature = carTemperature;
    }

    interface Engine{
        void startEngine();
        void stopEngine();
        void checkEngineStatus();
        void increaseEngineRPM(int amount);
        void decreaseEngineRPM(int amount);
    }
}

class Sedan extends Car implements Car.Engine {
    private long startTime;
    private long endTime;
    private int RPM;

    Sedan(double batteryLevel,double carTemperature){
        super(batteryLevel, carTemperature);
        this.RPM = 0;
    }

    public void startEngine(){
        if(batteryLevel > 40) {
            startTime = System.currentTimeMillis();
            System.out.println("Engine started");
        }
        else
            System.out.println("Inefficient battery level");
    }

    public void stopEngine(){
        endTime = System.currentTimeMillis();
        long runtime = endTime - startTime;
        System.out.println("The Engine has stopped ! Runtime = " + runtime + "ms");
    }

    @Override
    public void checkEngineStatus() {
        System.out.println("Battery Level = " + batteryLevel + "%");
        System.out.println("Car Temperature = " + carTemperature+ "*C" );
    }

    @Override
    public void increaseEngineRPM(int amount) {
        RPM += amount;
        if (RPM > 6000) {
            RPM = 6000; // Max limit for Sedan
            System.out.println("RPM limited to 6000 for Sedan.");
        } else {
            System.out.println("RPM increased to: " + RPM);
        }
    }

    @Override
    public void decreaseEngineRPM(int amount) {
        RPM -= amount;
        if (RPM < 500) {
            System.out.println("Warning: RPM too low! (" + RPM + ")");
        } else {
            System.out.println("RPM decreased to: " + RPM);
        }
    }
}
public class CarMechanism {
    public static void main(String[] args) {
        // Create a Sedan with 50% battery and 75°C engine temperature
        Sedan sedan = new Sedan(50, 75);
        sedan.startEngine();
        sedan.increaseEngineRPM(3000);
        sedan.checkEngineStatus();
        sedan.decreaseEngineRPM(500);
        sedan.stopEngine();

        System.out.println();

    }
}
