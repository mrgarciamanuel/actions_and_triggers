package triggers;
import actions.Actions;
import devices.Sensors;

import java.util.ArrayList;
import java.util.List;
//import settings.Settings;

public class DayTrigger extends Triggers{
    public DayTrigger(String name, Sensors sensorAssociated,  String state){
        super(name, sensorAssociated, state);
        List<Actions> actionsList = new ArrayList<Actions>();
    }
    //para fazer o update do Daytrigger, eu preciso chamar o metodo getActualState do sensor associado
    //que vai me dar o estado atual do sensor, se o sensor deteta tarde, então o meu DayTrigger fica ativado

    //temos que rescrever esse metodo para fazer o update do mesmo
    @Override
    public String getState(){
        //para ter o estado mais atual, tenho que chamar primeiro atualizar primeiro o estado do trigger
        updateState();

        if (state == "triggered"){
            //sempre que o estatus do meu trigger for on, vou chamar o notify action
            notifyAction();
        }
        return this.state;
    }
    @Override
    public String getName(){
        return this.name;

    }

    @Override
    public void updateState(){
        sensorAssociated.getAtualState();
        if (sensorAssociated.getAtualState() == "Night"){
            this.state = "triggered";
        }else{
            this.state = "untriggered";
        }
    }

    @Override
    public void notifyAction(){
        for (Actions action: actionsList) {
            action.update(this.getState());//envio o estado deste objeto para o metodo update
            //ATT: pode ser um pouco redundante pelo que está no metodo getState() - ambos se chamam
        }

    }
    @Override
    public String getSensorAssociated(){
        return sensorAssociated.getName();
    }


    /*@Override
    //meu send
    public void toTrig(boolean outPut){
        getState();
        if (state == "triggered"){
            setting.addTrigger(true, this);
        }else{

        }
    }*/

}
