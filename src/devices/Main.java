package devices;
import triggers.Triggers;

import java.util.Scanner;


public class Main {
    public static void main(String []args){
        String nameDev;
        String typeDev;
        String subTypeDev;
        String actualStatusDev;

        String nameTrigg;
        String sensorTrigg;
        String stateTrigg;

        int n_sensors = 0;

        Scanner meuInput = new Scanner(System.in);
        int opc;
        do {
            System.out.println("Escolha um opção:");
            opc = Integer.parseInt(meuInput.nextLine());

            if (opc == 1) {

                System.out.println("Adição de Devices");
                System.out.println("Digite o nome do dispositivo");
                nameDev = meuInput.nextLine();

                System.out.println("Digite o tipo do dispositivo");
                typeDev = meuInput.nextLine();

                System.out.println("Digite o subtipo do dispositivo");
                subTypeDev = meuInput.nextLine();

                System.out.println("Digite o estado atual do dispositivo do dispositivo");
                actualStatusDev = meuInput.nextLine();

                LightSensor luz = new LightSensor(nameDev, typeDev, subTypeDev, actualStatusDev);
                n_sensors++;
                System.out.println(luz.name + " " + luz.type + " " + luz.subType + " " + luz.actualStatus);

            } else if (opc == 2) {
                System.out.println("Adição de Triggers");
                System.out.println("Insira o nome do Trigger:");
                nameTrigg = meuInput.nextLine();

                System.out.println("Insira o nome do sensor associado ao Trigger:");
                sensorTrigg = meuInput.nextLine();

                System.out.println("Insira o nome do sensor associado ao Trigger:");
                stateTrigg = meuInput.nextLine();

                //
                // ConcreteTriggerSCreator t1 = new Triggers(nameTrigg, sensorTrigg, stateTrigg);

            } else {
                System.out.println("Opção invalida");
            }
        }while (opc !=0);






/**
        Scanner meuInput = new Scanner(System.in);
        System.out.println("Insira o nome do dispositivo");

        LightSensor luz1 = new LightSensor();

        LightSensor luz = new LightSensor("Garcia", "Sensors", "LightSensors", "Dia");
        System.out.println(luz.name + " " +luz.type+ " " + luz.subType+ " "+luz.actualStatus);

**/
    }
}
