/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author hp
 */
public class CPUManager {
    private static Queue<Process> Q = new LinkedList<>();
    
    public CPUManager(Process p){
        Q.add(p);
    }
    public void ListCPU(){
        System.out.println(Q);
    }
    public void run(){
        long sCPU = System.currentTimeMillis();
        while(Q.isEmpty()==false){
             if(Q.peek().Btime==100){
                  Q.remove().Ftime=System.currentTimeMillis();
                  
             }
             else{
                 Q.add(Q.remove());
             }
        }
    }
    
}
