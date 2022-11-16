package devices;

public class ConcreteCreatorLampActuator extends CreatorDevices{
    public ConcreteCreatorLampActuator(){}

   @Override
   public Devices factoryCreation(String name){
        Devices dev = new LampAct(name, "Actuator", "Light Actuator", false);
        return dev;
   }
}
