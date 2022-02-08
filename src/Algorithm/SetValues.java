/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm;

import static Algorithm.ProcessDef.pd;
import GUI.Input;

/**
 *
 * @author RSSH
 */
public class SetValues {

    public static double AvgTAT, AvgWT;
    public static int totTAT = 0, totWT = 0;

    public static void CalcAverage() {
        int i;

        for (i = 0; i < Input.nPrcs; i++) {
            pd[i].tat = pd[i].ct - pd[i].at;
            pd[i].wt = pd[i].tat - pd[i].bt;
            totTAT = totTAT + pd[i].tat;
            totWT = totWT + pd[i].wt;
        }

        AvgTAT = totTAT / (double) (GUI.Input.nPrcs);
        AvgWT = totWT / (double) GUI.Input.nPrcs;
    }

    public static void TableSetter() {
        int i;
        for (i = 0; i < Input.nPrcs; i++) {
            GUI.MainFrame.jTable1.getModel().setValueAt(pd[pd[i].pid].ct, i, 3);
            GUI.MainFrame.jTable1.getModel().setValueAt(pd[pd[i].pid].tat, i, 4);
            GUI.MainFrame.jTable1.getModel().setValueAt(pd[pd[i].pid].wt, i, 5);
            GUI.MainFrame.jTextField1.setText(Integer.toString(totTAT));
            GUI.MainFrame.jTextField2.setText(Integer.toString(totWT));
            GUI.MainFrame.jTextField3.setText(Double.toString(AvgTAT));
            GUI.MainFrame.jTextField4.setText(Double.toString(AvgWT));
        }
    }
}
