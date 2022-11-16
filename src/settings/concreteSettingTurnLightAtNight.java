package settings;

import actions.Actions;
import actions.TurnOnLightAtNight;
import triggers.NightTrigger;

//this will be the mediator between NightTrigger and TurnOnLightNight
public class concreteSettingTurnLightAtNight implements Setting{
    //referencias dos componentes no concreteMediator
    private TurnOnLightAtNight action;
    private NightTrigger trigger;


    public void addTrigger(boolean outPut, NightTrigger trigger) {
        this.trigger = (NightTrigger) trigger;

    }

    public void AddAction(TurnOnLightAtNight action){
        this.action = action;

    }

    public void sendTrigger(boolean outPut, NightTrigger trigger){

    }



}
