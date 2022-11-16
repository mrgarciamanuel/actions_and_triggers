package devices;
import devices.Sensors;

public class LampAct extends Actuators{

    public LampAct(String name, String type, String subType, Boolean status){
        super(name, type, subType, status);
        //the actualState of a lamp will be only on or off
        //this will depend sometimes on sensor state
    }


    //turn at night, becouse there can have many ways for turn on the light
    public void turnOn(){
        this.status = true;
    }


    //metodo que permite retornar o estado da minha action
    public String geStatus(){
        //estar on ou off, vai depender do estado capturado pelo sensor, completar depois
        if (this.status == true){
            return "Powered on";
        }else{
            return "Powered off";
        }
    }




}
