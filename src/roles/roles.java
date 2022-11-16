package roles;
import triggers.Triggers;
import actions.Actions;
import devices.Sensors;

import java.util.List;

public class roles {
    private String name;
    private String description;
    //atributes list of triggers and actions
    private final List<Triggers> triggers;
    private final List<Actions> actions;

    //construct for roles
    public roles(String name, List<Triggers> triggers, List<Actions> actions, String description) {
        this.name = name;
        this.triggers = triggers;
        this.actions = actions;
        this.description = description;
    }

    //systax of rule
    //it's night -> then turn the light

    //getters for triggers and actions
    public List<Triggers> triggers(){
        return triggers;
    }
    public List<Actions> getAllActuators(){
        return actions;
    }

}
