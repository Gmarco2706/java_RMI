package it.unisa.mgreco65;


import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.security.spec.ECField;

public class ServerRMI {
    public  static void main(String[] args) {
        try {
            //creazione istanza remoteobject e registrazione
            RemoteObject remoteObject = new RemoteObject();
            LocateRegistry.createRegistry(1099); //porta predef per RMI (internet)
            Naming.rebind("//localhost/RemoteObject", remoteObject);
            System.out.println("server avviato");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
