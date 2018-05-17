/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_sysentw.Ue1;
//
//import java_sysentw.Ue1.Queue;
//import java_sysentw.Ue1.ArrayQueue;

/**
 *
 * @author mmt
 */
public class QueueTest {
    public static void main(String [] args) {
        Queue<String> q = new ArrayQueue<String>(3);
        
        q.enqueue("Eins");
        q.enqueue("Zwei");
        q.enqueue("Drei");
        q.enqueue("5");
        q.enqueue("Fuenf");
        
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        
    }
    
}
