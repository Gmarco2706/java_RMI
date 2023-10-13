package it.unisa.mgreco65;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteObject  extends  UnicastRemoteObject implements RemoteInterface {

    protected RemoteObject() throws RemoteException {
        super();
    }

    @Override
    public String sayHello(String clientName) throws  RemoteException {
        return "ciao, " + clientName;
    }
}
