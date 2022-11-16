package devices;

public class ConcreteCreatorTimeSensor extends CreatorDevices{
    public ConcreteCreatorTimeSensor(){}
    @Override
    public Devices factoryCreation (String name){

        Devices dev = new TimeSensor(name, "Sensor", "LightSensor", "Dia");
        return dev;
    }
}
