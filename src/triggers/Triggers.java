package triggers;

import devices.Sensors;
import actions.Actions;

import java.util.ArrayList;
import java.util.List;

//for the observer pattern concept, it will be our subject
public abstract class Triggers {
    //ATTENTION: for triggers we always have a device(sensor) associated
    //observers will be actions
    protected String name;
    //protected Setting setting;//each component have to be plugged/associated with a mediator
    protected List<Actions> actionsList = new ArrayList<Actions>();
    protected Sensors sensorAssociated;//WAS SUPPOSED THIS ATRIBUTE TO BE TYPE OF SENSOR, WE CAN DO BETTER
    //BUT IF IT COULD BE TYPE OF SENSOR, THEN, WE'LL HAVE TO IMPLEMENT ASSOCIATION RELATION BETWEEN TRIGGERS AND SENSORS
    //não é necessário ser atribuino no momento da ciração, e um trigger pode estar associado a vários sensores
    protected String state;
    //the state can be triggered or not triggered, depending on detected data from sensor associated
    //a informação do estado não pode ser inserido pelo utilizador, mas sim da informação que vier do sensor



    public Triggers(String name, Sensors sensor, String state){
        this.name = name;
        //this.setting = setting;
        this.sensorAssociated = sensor;//this attribute must receive some device or some name of device that existis in system.
        this.state = state;
    }

    public abstract String getName();
    //public String getName(){
    //    return this.name;
    //}
    public abstract String getState();

    //method to add an action to the list of observers
    public void attachAction(Actions actions){
        actionsList.add(actions);
    }

    public abstract void updateState();

    public abstract void notifyAction();
    public abstract String getSensorAssociated();
    //public Sensors getSensorAssociated(){return this.sensorAssociated;}



    //method that says a triggers is on
    //my send

    //when the trigger will be on, we'll to the mediator, an output with reference of a trigger
    //meu send
    //public  abstract void toTrig(boolean outPut);
}
