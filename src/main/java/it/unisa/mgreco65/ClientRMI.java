package it.unisa.mgreco65;

import java.rmi.Naming;
public class ClientRMI {
    public static void main(String[] args) {
        try {
            //rif oggetto rem
            RemoteInterface remoteObject = (RemoteInterface) Naming.lookup("//localhost/RemoteObject");


            //chiamata ai metodi
            String clientName = "marco"; //nome client
            String greeting = remoteObject.sayHello(clientName);
            System.out.println(greeting);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
