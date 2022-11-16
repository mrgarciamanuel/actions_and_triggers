package settings;

import actions.TurnOnLightAtMorning;
import triggers.MornignTrigger;

//this will be the mediator between MorningTrigger and TurnOnLightMorning
public class concreteSettingTurnLightAtMorning implements Setting{
    //referencias dos componentes no concreteMediator
    private TurnOnLightAtMorning action;
    private MornignTrigger trigger;

    public void addTrigger(boolean outPut, MornignTrigger trigger) {
        this.trigger = trigger;

    }
    public void AddAction(TurnOnLightAtMorning action){
        this.action = action;

    }

    public void sendTrigger(boolean outPut, MornignTrigger trigger){

    }



}
