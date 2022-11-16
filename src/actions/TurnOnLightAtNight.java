package actions;
import devices.Actuators;
import triggers.Triggers;

//(TurnOnLightAtNight)maybe it could be better to have actions associated with specific state of sensor
public class TurnOnLightAtNight extends Actions{
    public TurnOnLightAtNight (String name, Triggers triggersAssociated, Actuators actuatorAssociated){
        super(name, triggersAssociated,actuatorAssociated);

        //associando esta action ao trigger
        this.triggerAssociated.attachAction(this);

        //change state of actuators if pre condition was satisfied when action is created
        if (triggersAssociated.getState() == "Triggered" && actuatorAssociated.getState() != true){
            this.actuatorAssociated.status = true;
        }else{
            System.out.println("Pre condition not achieved!");
        }

    }

    //já não preciso das informações do sensor porque já são passadas no trigger
    //String stateOfAssociatedSensor = sensorAssociated.getAtualState();
    //metodo que permite verificar/atualizar o estado atual do sensor associado
    public void updateStateOffAssiactedSensor(){
    }

    public String getName(){
        return this.name;

    }

    public String getTriggerAssociated (){
        return this.triggerAssociated.getName();
    }


    //@Override
    //public String getStateOfAssociatedSensor(){
      //  return stateOfAssociatedSensor;
    //}

    @Override
    public boolean getState(){
        updateState();
        return this.status;
    }

    @Override
    public String update(String observation){
        System.out.println("Estado recebido: " );
        return triggerAssociated.getState();

    }

    //metodo que permite ativar a ação em causa, implica no fim acionar o atuador associado
    //tem que haver uma forma de a ação enviar controlos ao atuador, e em função desse controlo
    //o atuador deverá alterar o seu estado interno
    //public String getTriggerAssociated (){
    //    return this.triggerAssociated.getName();
    //}

    public void ativateAtionOnActuator (){
        getStateOfAssociatedTrigger();
        if (getStateOfAssociatedTrigger() == "Triggered"){
            this.actuatorAssociated.status = true;

        }else{
            System.out.println("Pre condition not achieved!");
        }
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

}
