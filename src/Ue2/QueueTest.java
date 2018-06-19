/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ue2;
//
//import java_sysentw.Ue1.Queue;

import sysent.Ue1.*;

//import java_sysentw.Ue1.ArrayQueue;

/**
 *
 * @author mmt
 */
public class QueueTest {
    public static void main(String [] args) {
        Queue<String> q = new ArrayQueue<String>(7);
        
        q.enqueue("Eins");
        q.enqueue("Zwei");
        q.enqueue("Drei");
        q.enqueue("5");
        q.enqueue("Fuenf");
        q.enqueue("Mazyar");
        
        //FIFO wird Sichtbar.
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        
    }
    
}
