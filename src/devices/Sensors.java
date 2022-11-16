package devices;

public class Sensors extends Devices{
    public String actualStatus;

    public Sensors(String name, String type, String subType, String actualStatus){
        super(name, type, subType);
        //the state of sensor may be the actual context.
        //for ex: for the time sensor maybe: morning, afternoon or night
        //THE SUBCLASSES CONSTRUCTOR HAVE ALWAYS TO MATCH WITH SUPER CLASS CONSTRUTOR?
    }

    //metodo que retorna o estado capturado pelo sensor
    public String getAtualState(){
        return actualStatus;
    }
    public void setActualStatus(String actualStatus){
        this.actualStatus = actualStatus;
    }
    public String getName(){
        return this.name;
    }
}
