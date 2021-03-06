/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm;

import static Algorithm.ProcessDef.pd;
import java.util.*;
import GUI.Input;
import GUI.Input;

/**
 *
 * @author RSSH
 */
public class FCFS {
    public static int cmpPrcs;
    public static void initfcfs() {
//        arrange();
//        if (ProcessDef.currtime < pd[0].at) {
//            Gannt block = new Gannt();
//            block.start_time = ProcessDef.currtime;
//            block.end_time = pd[0].at;
//            block.id = -1;
//            Gannt.Chart.add(block);
//            ProcessDef.currtime = pd[0].at;
//        }
//        selector();
//        Gannt.ChartPrint();
//        SetValues.CalcAverage();
//        SetValues.TableSetter();

        while(cmpPrcs != Input.nPrcs){
            selector();
            arrange();
        }
    }

    public static void updateTable() {

    }

    public static void arrange() {
        ProcessDef temp;
        int i, j;

        for (i = 1; i < Queue.len; i++) {
            temp = Queue.dequeue();
            j = i - 1;

            while (j >= 0 && pd[j].at > temp.at) {
                pd[j + 1] = pd[j];
                j--;
            }

            pd[j + 1] = temp;
        }

        for (i = 0; i < Input.nPrcs; i++) {
            System.out.println(pd[i].at);
        }
    }

    public static void selector() {
        int i;
//        System.out.println("Gannt Chart Here:");
//        for (i = 0; i < Input.nPrcs; i++) {
//            pd[i] = Gannt.runner(pd[i], pd[i].bt);
//        }
        for (i = 0; i < Input.nPrcs; i++) {
            if(ProcessDef.pd[i].at < ProcessDef.currtime && !ProcessDef.pd[i].cmp){
                Queue.enqueue(pd[i]);
            }
        }
    }
}
