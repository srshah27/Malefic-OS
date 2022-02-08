/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm;

/**
 *
 * @author RSSH
 */
public class Queue {

    static int front = -1, rear = -1, len = 0;
    static final int MAX = 10;
    public static ProcessDef cirque[] = new ProcessDef[MAX];

    public static boolean isEmpty() {
        if (front == -1) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isFull() {
        if ((rear + 1) % MAX == front) {
            return true;
        } else {
            return false;
        }
    }

    public static void enqueue(ProcessDef n) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        } else if (rear == -1) {
            rear = 0;
            front = 0;
            cirque[rear] = n;
        } else {
            rear = (rear + 1) % MAX;
            cirque[rear] = n;
        }
        len++;
    }

    public static ProcessDef dequeue() {
        ProcessDef num = null;
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return null;
        } else if (front == rear) {
            num = cirque[front];
            front = rear = -1;
        } else {
            num = cirque[front];
            front = (front + 1) % MAX;
        }
        len--;
        return num;
    }
}
