package devices;

public class ConcreteCreatorLightSensor extends CreatorDevices{
    public ConcreteCreatorLightSensor(){}

    @Override
    public Devices factoryCreation (String name){
        Devices dev = new LightSensor(name, "Sensor", "LightSensor", "Dia");
        return dev;
    }

}
