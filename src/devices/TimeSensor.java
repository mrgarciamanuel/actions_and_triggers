package devices;
//import java.util.Calendar;
import java.util.Formatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
public class TimeSensor extends Sensors{

    public TimeSensor(String name, String type, String subType,String actualStatus){
        super(name, type, subType, actualStatus);
        //the atual state (initial) of sensor can be given by the user on creation moment
        // but, after it must have a functionality that allows this attribute be updated
        //in fact, a device can't stay in the same state all time
    }

    //updating the state captured by timeSensotState
    public String updateState(){
        /*
        COMENTEI POR PROBLEMAS AO PEGAR A HORA DO SISTEMA
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("kk:mm:ss");
        String strDate = dateFormat.format(date);
        int hora_atual = Integer.parseInt(strDate.substring(0, 2));
        */
        int hora_atual = 19;
        if((hora_atual >=1) && (hora_atual <= 12)){
                 actualStatus = "Morning";
                 return actualStatus;
        }else if((hora_atual >=13) && (hora_atual <= 18)){
            actualStatus = "Afternoon";
            return actualStatus;
        }else {
            actualStatus = "Night";
            return actualStatus;
        }
    }
    //metodo que retorna o estado capturado pelo sensor, implica fazer o upadate do estado do sensor
    @Override
    public String getAtualState(){
        updateState();
        return this.actualStatus;
    }
    public String getName(){
        return this.name;
    }
}
