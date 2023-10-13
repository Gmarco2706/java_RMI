package it.unisa.mgreco65;


import java.rmi.Remote;
import java.rmi.RemoteException;
public interface RemoteInterface extends Remote {
    String sayHello(String clientName) throws RemoteException;
}
