package triggers;

import actions.Actions;
import devices.Sensors;

import java.util.ArrayList;
import java.util.List;
//import settings.Settings;

public class MornignTrigger extends Triggers{
    public MornignTrigger(String name, Sensors  sensorAssociated,  String state){
        super(name,  sensorAssociated, state);

        //lista de actions que estarão a espera do trigger
        List<Actions> actionsList = new ArrayList<Actions>();
    }

    @Override
    public void updateState(){
        sensorAssociated.getAtualState();
        if (sensorAssociated.getAtualState() == "Morning"){
            this.state = "triggered";
        }else{
            this.state = "untriggered";
        }
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public String getState(){
        updateState();

        if(state == "triggeres"){
            //sempere que o trigger estiver triggered, vou notificar as action associadas a esse trigger
            notifyAction();
        }
        return this.state;
    }

    @Override
    public void notifyAction(){
        for (Actions action: actionsList){
            action.update(this.state);

        }
    }

    @Override
    public String getSensorAssociated(){
        return sensorAssociated.getName();
    }

    /*@Override - era no caso de usar settings
    //when the trigger will be on, we'll send to the mediator, an output with reference of a trigger
    //meu send
    public void toTrig(boolean outPut){
        getState();
        if (this.state == "triggered"){
            super.setting.addTrigger(true, this);
        }else{

        }


    }*/
    //para atualizar o estado do sensor, talvez devamos ter também um processo que vai estar o tempo
    //a consultar se determinados atributos foram alterados ou não
    //ex: para o trigger NightTrigger ficar ativado, é necessário que a hora esteja entre as 18-23
    //desta feita deve haver um processso a consultar essas informações

}
