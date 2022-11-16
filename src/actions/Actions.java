package actions;
import settings.Setting;
import settings.Setting.*;
import devices.Sensors;
import devices.Actuators;
import triggers.Triggers;
import devices.TimeSensor;

public abstract class Actions {
    //ATTENTION: for actions we always have a device(actuators) associated
    protected String name;//for example turn on the light


    //protected Setting setting;
    //protected Triggers triggerAssociated;

    //já não preciso do sensor associado, porque o trigger já carrega essa informação
    //protected Sensors sensorAssociated;
    //protected String stateOfAssociatedSensor;//this must come from atualState (attribute from Sensor)
    protected Triggers triggerAssociated;//OUR SUBJET - to be observed
    protected Actuators actuatorAssociated;
    protected boolean status;//the state can be: actived or not ativeted
    //se o estado for ativado, podemos chamar o device associado ao ação
    //esse campo não será preenchido pelo utilizador, será o sistema a preencher de acordo com o que foi capturado pelo sensor

    public Actions(String name, Triggers triggerAssociated, Actuators actuatorAssociated){
        this.name = name;
        this.triggerAssociated = triggerAssociated;
        this.actuatorAssociated = actuatorAssociated;
        //this.stateOfAssociatedSensor = sensorAssociated.getAtualState();//it comes directly from state detected by sensor
    }


    //metodo/interface de notificação dos observadores, esse metodo será chamado quando um evento(trigger) acontecer
    //o trigger poderá passar varios argumentos dentro desse metodo (incluindo seu proprio status)
    public abstract String update(String observation);

    //
    //public void setStateOfAssociatedSensor(){
        //this.stateOfAssociatedSensor = sensorAssociated.getAtualState();
    //}

    //metodo que vai consultar se o trigger associado foi cumprido ou não
    public String getStateOfAssociatedTrigger(){
        return this.triggerAssociated.getState();
    }
    public abstract boolean getState();


    //public String getStateOfAssociatedSensor(){
       // return this.stateOfAssociatedSensor;
    //}

    public abstract String getName();

    //public abstract void getTrigger(boolean inPut);



}
