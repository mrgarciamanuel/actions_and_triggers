import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class trash_Lixo {
    public static void main(String []args){

        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("kk:mm:ss");
        String strDate = dateFormat.format(date);
        int nova_data = Integer.parseInt(strDate.substring(0, 2));
        System.out.println("Converted String: " + strDate);
        System.out.println(nova_data);


    }
     /*

        //variáveis que vão ajudar a criação de devices
        String nameDev;
        String typeDev;
        String subTypeDev;
        String actualStatusDev;

        //variaveis que vão ajudar a criação de Triggers
        String nameTrigg;
        String sensorTrigg;
        String stateTrigg;

        //variavel que armazena o número de sensores criados no sistema, será incrementada sempre que for criado um novo sensor
        int n_sensors = 0;

        //este array vai armazenar o nome de todos devices criados, e será útil na criação de triggers
        ArrayList<String> sensorsListNames = new ArrayList<String>();

        //lista de triggers criado no sistema
        ArrayList<String> triggersList = new ArrayList<String>();

        /
        Scanner meuInput = new Scanner(System.in);
        int opc;
        do {
            System.out.println("1 - Add Device");
            System.out.println("2 - Add Trigger");
            System.out.println("Choose an option:");
            opc = Integer.parseInt(meuInput.nextLine());

            if (opc == 1) {
                System.out.println("Adding Devices");
                System.out.println("Type device name");
                nameDev = meuInput.nextLine();

                System.out.println("Insert device type");
                typeDev = meuInput.nextLine();

                System.out.println("Insert device subtype");
                subTypeDev = meuInput.nextLine();

                System.out.println("Insert device estatus");
                actualStatusDev = meuInput.nextLine();

                TimeSensor time = new TimeSensor(nameDev, typeDev, subTypeDev, actualStatusDev);
                n_sensors++;

                sensorsListNames.add(time.getName());

                System.out.println(time.getName() + " " + time.getType() + " " + time.getSubType() + " " + time.getAtualState());
                System.out.println(sensorsListNames);
                //System.out.println(sensorsListNames.indexOf("garcia"));

                System.out.println(time.getAtualState());
                time.updateState();//see again better the sensors constructor
                System.out.println(time.getAtualState());

            } else if (opc == 2) {
                if (n_sensors <=0){
                    System.out.println("You can't create trigger becouse there is not devices created");
                }else{
                    System.out.println("Adding triggers");
                    System.out.println("Insert trigger name:");
                    nameTrigg = meuInput.nextLine();

                    System.out.println("Insert the sensor associated with trigger:");
                    sensorTrigg = meuInput.nextLine();

                    System.out.println("Insert trigger state");
                    stateTrigg = meuInput.nextLine();

                    //consultar se na lista de sensores existe um sensor igual ao que queremos associar ao novo trigger
                    if (sensorsListNames.contains(sensorTrigg.toString())) {
                        concreteTriggersCreator t1 = new concreteTriggersCreator(nameTrigg, sensorTrigg, stateTrigg);
                        triggersList.add(t1.getName());
                        System.out.println(triggersList);
                    }else{
                        System.out.println("None device/sensor created with name " + sensorTrigg);
                    }
                }
            } else {
                System.out.println("invalid option");
            }
        }while (opc !=0);
    */



    /*QUESTIONS QUESTIONS
     *   - Actuators are the tipe of devices that will interact with actions
     *       How is the relations between actions and actuators?
     *   - Sensor are the type of devices that will interact with triggers
     *       How is the relations between triggers and sensors?
     *   - one action can be performed by one or more than?
     *  - what's the relationship between roles and devices
     * */

    /*Razões para não usar mais o mediator:
    *  - só quebra a dependencia entre objetos do mesmo tipo
    *  - um cenário tipico: um chat
    * */
}
