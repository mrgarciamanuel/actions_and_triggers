import devices.*;
import triggers.*;
import actions.*;

public class Main{

    public static void main(String []args){
        TimeSensor timeSensor = new TimeSensor("Time sensor", "Sensor", "Time sensor", "Night");
        //Sensors lightSensor = new Sensors("Light sensor1", "Sensor", "Light sensor", "Manhã");
        System.out.println("Estado do sensor: " + timeSensor.getAtualState());
        //System.out.println(timeSensor.getAtualState());

        //DayTrigger trigger1 = new DayTrigger("Is a day", timeSensor, " ");
        NightTrigger trigger2 = new NightTrigger("Is a night", timeSensor, " ");
        //MornignTrigger trigger3 = new MornignTrigger("Is a morning", timeSensor, " ");


        LampAct lampadaSala = new LampAct("Lampada1", "Actuators", "Lamp Actuators", false);
        //System.out.println("Nome do atuador " +lampadaSala.getName()+ ", estado "+lampadaSala.geStatus());

        //System.out.println("Nome do trigger: " + trigger1.getName() + ", sensor associado: "+ trigger1.getSensorAssociated().getName()+ ", seu estado: " + trigger1.getState());
        System.out.println("Nome do trigger: " + trigger2.getName() + ", sensor associado: "+ trigger2.getSensorAssociated() + ", seu estado: " + trigger2.getState());
        //System.out.println(trigger2.getState());
        //System.out.println("Nome do trigger: " + trigger3.getName() + ", sensor associado: "+ trigger3.getSensorAssociated().getName()+ ", seu estado: " + trigger3.getState());

        TurnOnLightAtNight turnOnLight = new TurnOnLightAtNight("Turn on light at night", trigger2, lampadaSala);

        //System.out.println("Nome da action: " + turnOnLight.getName()+ ", Trigger associado: " + turnOnLight.getTriggerAssociated()+  ", atuador associado: "+ lampadaSala.getName()+ ", estado da ação: "+turnOnLight.getState());




        //TurnOnLightAtMorning turnOnLight1 = new TurnOnLightAtMorning("Turn on light at morning", trigger3, lampadaSala);

        //System.out.println("Nome da action: " + turnOnLight.getName() + " Trigger associado: " + turnOnLight.getTriggerAssociated() +", atuador associado: " + lampadaSala.getName()+ ", estado da ação: "+turnOnLight.getState());
        //System.out.println("Nome da action: " + turnOnLight1.getName() + " Trigger associado: " + turnOnLight1.getTriggerAssociated() +", atuador associado: " + lampadaSala.getName()+ ", estado da ação: "+turnOnLight1.getState());

        //System.out.println("Time sensor, "+ timeSensor.getAtualState());
        //System.out.println("Lampada sala, "+lampadaSala.geStatus() );
        //System.out.println("Turn on at morning: "+ turnOnLight1.getState());


        //O QUE FAZER: TESTAR SE AS COISAS ESTÃO FUNCIONANDO OU NÃO
        //TRABALHAR NOS METODOS ADICIONAR E NOTIFICAR OBERSEVER E ADICIONAR OBSERVER
    }
}
