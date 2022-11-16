package settings;

import actions.Actions;
import actions.TurnOnLightAtMorning;
import triggers.MornignTrigger;
import triggers.NightTrigger;
import triggers.Triggers;

//THIS IS A SPECIFIC MEDIATOR FOR MORNING TRIGGER AND TURNONLIGHTATMORNING
public interface Setting{
    //metodo de comunicação entre classes(componentes)
    //os componentes podem passar algum contexto como argumento
    //metodos abstratos da interface, não podem ter corpo
    //public void notifyAnTrigger(Triggers trigger, String outPUt);


    //void addTrigger(boolean outPut, Triggers trigger);


    //void AddAction(Actions action);

    //void addTrigger(boolean outPut, MornignTrigger trigger);

    //void AddAction(TurnOnLightAtMorning action);

    //public void addAction(Actions action);
    //public void sendTrigger(boolean outPut, MornignTrigger triggers);

    //void addTrigger(boolean outPut, Triggers trigger);
}
