/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.java.rmi;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Holly
 */
public interface RemoteInterface extends Remote {
    String sayHello() throws RemoteException;
}
