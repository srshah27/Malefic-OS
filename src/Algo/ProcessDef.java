/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algo;

/**
 *
 * @author RSSH
 */


public class ProcessDef {

    
    public ProcessDef(int at, int bt, int pid){
        this.pid = pid;
        this.at = at;
        this.bt = bt;
        rt = bt;
    }
    public int pid;
    public int at;
    public int bt;
    public int ct;
    public int tat;
    public int wt;
    public int rt;
    public boolean cmp;
    public static ProcessDef pd[] = new ProcessDef[10];
    public static int currtime = 0;
}
