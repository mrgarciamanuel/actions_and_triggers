package actions;

import devices.Actuators;
//import settings.SettingTurnLightAtMornig;
import devices.Sensors;
import triggers.MornignTrigger;
import triggers.Triggers;

public class TurnOnLightAtMorning extends Actions {
    public TurnOnLightAtMorning(String name, Triggers triggersAssociated, Actuators actuatorAssociated) {
        super(name, triggersAssociated,actuatorAssociated);

        //change state of actuators if pre condition was satisfied when action is created
        if(triggersAssociated.getState() == "Triggered" && actuatorAssociated.getState() != true){
            this.actuatorAssociated.status = true;
        }else{
            System.out.println("Pre condition not achieved!");
        }
    }

    @Override
    public String update(String observation){
        System.out.println("Estado recebido: " );
        return triggerAssociated.getState();

    }

    public void updateStateOffAssiactedSensor(){
    }

    public String getName(){
        return this.name;

    }

    /*@Override
    public void getTrigger(boolean inPut){
        System.out.println(super.name+ "Trigger is on");

    }*/
    //@Override
    //public String getStateOfAssociatedSensor(){
    //    return stateOfAssociatedSensor;
    //}

    //metodo que permite ativar a ação em causa, implica no fim acionar o atuador associado
    //tem que haver uma forma de a ação enviar controlos ao atuador, e em função desse controlo
    //o atuador deverá alterar o seu estado interno

    public void ativateAtionOnActuator (){
        triggerAssociated.getState();
        if (triggerAssociated.getState() == "Triggered"){
            this.actuatorAssociated.status = true;

        }else{
            System.out.println("Pre condition not achieved!");
        }
    }

    public String getTriggerAssociated(){
        return this.triggerAssociated.getName();
    }

    //metodo que permite atualizar o estado da ação em causa, implica atualizar o estado do sensor associado
    public void updateState(){
        triggerAssociated.getState();
        //a condição principal para uma ação acontecer, é o sensor estar triggered
        //se o sensor estiver triggerd, mas o atuator não estiver acionado, temos de o acionar
        //mas se o sensor não estiver triggered, não podemos acionar o atuador, o estado interno da action fica desativo
        if (triggerAssociated.getState() == "triggered" && actuatorAssociated.getState() == true) {
            this.status = true;

        }else if (triggerAssociated.getState() == "triggered" && actuatorAssociated.getState() != true){
            actuatorAssociated.setStatus(true);
            this.status = true;
        }else{
            this.status = false;
        }//talvez da para adicionar mais condicionais

    }

    @Override
    public boolean getState(){
        updateState();
        return this.status;
    }



    //}
}
