package devices;

public class Actuators extends Devices{
    public boolean status;//true may be = on, and false may be = off, for the light atuators
    public Actuators(String name, String type, String subType, Boolean status){
        super(name, type, subType);
    }

    public boolean getState(){
        return this.status;
    }
    //setando o estatus
    public void setStatus(boolean status){
        this.status = status;
    }
}
