package triggers;
import actions.Actions;
import devices.Sensors;
import settings.*;

import java.util.ArrayList;
import java.util.List;


public class NightTrigger extends Triggers{
    public NightTrigger(String name, Sensors sensorAssociated, String state){
        super(name, sensorAssociated, state);

        //lista de actions que estaram a espera do trigger
        List<Actions> actionsList = new ArrayList<Actions>();
    }

    @Override
    //este metodo é void para evitar que sejá chamado na main, só será invocado por outros metodos
    public void updateState(){
        sensorAssociated.getAtualState();
        if (sensorAssociated.getAtualState() == "Night"){
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
        //para ter o estado mais atual, tenho que chamar primeiro atualizar primeiro o estado do trigger
        updateState();
        if (state == "triggered"){
            //sempre que o estatus do meu trigger for on, vou chamar o notify action
            notifyAction();
        }
        return this.state;
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

    /*@Override - era no caso de usar settings
    public void toTrig(boolean output){
        getState();
        if (state == "triggered"){
            setting.addTrigger(true, this);
        }else{

        }

    }*/
    //para atualizar o estado do sensor, talvez devamos ter também um processo que vai estar o tempo
    //a consultar se determinados atributos foram alterados ou não
    //ex: para o trigger NightTrigger ficar ativado, é necessário que a hora esteja entre as 18-23
    //desta feita deve haver um processso a consultar essas informações
}
