/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm;

/**
 *
 * @author RSSH
 */


public class ProcessDef {

    
    public ProcessDef(int at, int bt, int pid){
        this.pid = pid;
        this.at = at;
        this.bt = bt;
        rtl = bt;
    }
    public int pid;
    public int at;
    public int bt;
    public int ct;
    public int tat;
    public int wt;
    public int rtl;
    public int prt;
    public boolean cmp = false;
    public static int currtime = 0;
    public static ProcessDef pd[] = new ProcessDef[10];
}
