/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ue2;

import sysent.Ue1.*;

/**
 *
 * @author mmt
 */
public interface Queue<T> {

    public void enqueue(T t);
    public T dequeue();
    
    
}
