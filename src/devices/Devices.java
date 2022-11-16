package devices;

abstract public class Devices {
    protected String name;
    protected String type;
    protected String subType;
    //protected String actualStatus;
    //protected boolean status;

    public String getName(){return this.name;}
    public String getType(){return this.type;}
    public String getSubType(){return this.subType;}
    //public String getState(){return this.actualStatus;}

    public Devices(String name, String type, String subType){
        this.name = name;
        this.type= type;
        this.subType=subType;
        //this.actualStatus = actualStatus;
    }
}
