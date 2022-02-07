/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm;

import GUI.GanntBlock;
import GUI.Input;
import GUI.MainFrame;
import java.util.ArrayList;

/**
 *
 * @author RSSH
 */
public class Gannt {

    int start_time, end_time, id;
    static ArrayList<Gannt> Chart = new ArrayList<Gannt>();

    public static ProcessDef runner(ProcessDef run, int run_time) {
        Gannt block = new Gannt();
        block.start_time = ProcessDef.currtime;
        block.id = run.pid;
        block.end_time = ProcessDef.currtime + run_time;
        run.rtl = run.rtl - run_time;
        Chart.add(block);
        ProcessDef.currtime = ProcessDef.currtime + run_time;

        if (run.rtl == 0 && run.cmp == false) {
            run.cmp = true;
            run.ct = ProcessDef.currtime;
        }

//      System.out.println(block.end_time);
        return run;
    }

    public static void ChartPrint() {
        int i;
        Gannt temp;
        System.out.println("\n\n-----------------------\n Gannt");
        for (i = 0; i < Chart.size(); i++) {
            System.out.println("----------------------------------\n Block" + i);
            temp = Chart.get(i);
            System.out.println(temp.id + "\t" + temp.start_time + "\t" + temp.end_time);
            System.out.println("----------------------------------");
        }
        for (i = 0; i < Chart.size(); i++) {
            temp = Chart.get(i);
            GanntBlock frame = new GanntBlock();
            frame.setBounds(20 + (i * 102), 20, 100, 100);
            frame.Chart_ST.setText(Integer.toString(temp.start_time));
            frame.Chart_ET.setText(Integer.toString(temp.end_time));
            frame.Chart_ID.setText("P" + Integer.toString(temp.id));
            GUI.MainFrame.jPanel2.add(frame);
            GUI.MainFrame.jPanel2.revalidate();
            GUI.MainFrame.jPanel2.repaint();
        }
    }
}
