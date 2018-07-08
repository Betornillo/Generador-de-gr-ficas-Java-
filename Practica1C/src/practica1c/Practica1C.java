/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1c;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author 
 */
 class Grafica {


    class Arista
    {
        int v,w;
        public Arista (int v, int w){
            this.v=v;
            this.w=w;
        }
        @Override
        public String toString(){
            return "("+v+","+w+")";
        }
    }
    
    List<Arista> G[];
    public Grafica(int n){
        G=new LinkedList[n];
        for(int i=0;i<G.length;i++)
            G[i]=new LinkedList<Arista>();
    }
    
    boolean conectados(int u, int v){
        for(Arista i:G[u])
            if(i.v==v)return true;
        return false;
    }
    
    void añadeArista(int u,int v,int w){
        G[u].add(0,new Arista(v,w));
    }
    
    @Override
    public String toString(){
        String result="";
        for(int i=0; i<G.length;i++)
            result+=i+"=>"+G[i]+"\n";
        return result;
    }
    
    
}

public class Practica1C {
    public static void main(String[]args) {
        try{
            
            
            
            int arista = ThreadLocalRandom.current().nextInt(1,3);
            int arista1 = ThreadLocalRandom.current().nextInt(2,4);
            
            int peso1 = ThreadLocalRandom.current().nextInt(0,1);
            
            int arista2 = ThreadLocalRandom.current().nextInt(3,5);
            
            
            int arista3 = ThreadLocalRandom.current().nextInt(4, 6);
            
            int arista4 = ThreadLocalRandom.current().nextInt(5,7);
            
            int arista5 = ThreadLocalRandom.current().nextInt(6,8);
            
            int arista6 = ThreadLocalRandom.current().nextInt(7,9);
            
            int arista7 = ThreadLocalRandom.current().nextInt(8, 9);
            
            int arista8 = ThreadLocalRandom.current().nextInt(9,10);
            
            
            //System.out.println(aleatorio);
            int graficas = ThreadLocalRandom.current().nextInt(5,11);
            //System.out.println(graficas);
            //if(graficas < 8){
        
            Grafica g = new Grafica(graficas);
            System.out.println(graficas);
            
            int eelegidor = graficas;
            
            switch(eelegidor){
                
                case 5:
                    /*
            //g.añadeArista(0, arista1, peso1);
            g.añadeArista(0, 1, 0);
            //g.añadeArista(2, arista3, peso3);
            g.añadeArista(2, 3, 0);
            g.añadeArista(1, 2, 0);
            //g.añadeArista(1, arista7, peso7);
            //g.añadeArista(2, arista8, peso8);
            g.añadeArista(3, 4, 0);
            //g.añadeArista(3, arista9, peso9);
            //g.añadeArista(4, arista5, peso5);
            g.añadeArista(4, 0, 0);
                  */

            g.añadeArista(0, arista, 0);
            g.añadeArista(1, arista1, 0);
            g.añadeArista(2, arista2, 0);
            g.añadeArista(3, arista3, 0);
            g.añadeArista(4, peso1, 0);
                
                
                    break;
                case 6:
                    
            g.añadeArista(0, arista, 0);
            g.añadeArista(1, arista1, 0);
            g.añadeArista(2, arista2, 0);
            g.añadeArista(3, arista3, 0);
            g.añadeArista(4, arista4, 0);
            g.añadeArista(5, peso1, 0);
                    
                    
                    break;
                case 7:
                    
            g.añadeArista(0, arista, 0);
            g.añadeArista(1, arista1, 0);
            g.añadeArista(2, arista2, 0);
            g.añadeArista(3, arista3, 0);
            g.añadeArista(4, arista4, 0);
            g.añadeArista(5, arista5, 0);
            g.añadeArista(6, peso1, 0);
            
                    break;
                case 8:
            g.añadeArista(0, arista, 0);
            g.añadeArista(1, arista1, 0);
            g.añadeArista(2, arista2, 0);
            g.añadeArista(3, arista3, 0);
            g.añadeArista(4, arista4, 0);
            g.añadeArista(5, arista5, 0);
            g.añadeArista(6, arista6, 0);
            g.añadeArista(7, peso1, 0);
                    
                    break;
                case 9:
            g.añadeArista(0, arista, 0);
            g.añadeArista(1, arista1, 0);
            g.añadeArista(2, arista2, 0);
            g.añadeArista(3, arista3, 0);
            g.añadeArista(4, arista4, 0);
            g.añadeArista(5, arista5, 0);
            g.añadeArista(6, arista6, 0);
            g.añadeArista(7, arista7, 0);
            g.añadeArista(8, peso1, 0);
                    
                    break;
                case 10:
                    
            g.añadeArista(0, arista, 0);
            g.añadeArista(1, arista1, 0);
            g.añadeArista(2, arista2, 0);
            g.añadeArista(3, arista3, 0);
            g.añadeArista(4, arista4, 0);
            g.añadeArista(5, arista5, 0);
            g.añadeArista(6, arista6, 0);
            g.añadeArista(7, arista7, 0);
            g.añadeArista(8, arista8 , 0);
            g.añadeArista(9, peso1, 0);
                    
                    break;
                    

        }
            System.out.println(g);
            
            boolean primerCiclo = g.conectados(0,1) && g.conectados(1, 2) &&
                    g.conectados(2, 3) && g.conectados(3, 4) &&
                    g.conectados(4, 0);

            boolean aa = g.conectados(0,1) && g.conectados(1, 2) &&
                    g.conectados(2, 3) && g.conectados(3, 4) &&
                    g.conectados(4, 5) && g.conectados(5, 0);
            
            boolean ab = g.conectados(0,1) && g.conectados(1, 2) &&
                    g.conectados(2, 3) && g.conectados(3, 4) &&
                    g.conectados(4, 5) && g.conectados(5, 6) &&
                    g.conectados(6, 0);
                    
            boolean bb = g.conectados(0,1) && g.conectados(1, 2) &&
                    g.conectados(2, 3) && g.conectados(3, 4) &&
                    g.conectados(4, 5) && g.conectados(5, 6) &&
                    g.conectados(6, 7) && g.conectados(7, 0);
            
            boolean ba = g.conectados(0,1) && g.conectados(1, 2) &&
                    g.conectados(2, 3) && g.conectados(3, 4) &&
                    g.conectados(4, 5) && g.conectados(5, 6) &&
                    g.conectados(6, 7) && g.conectados(7, 8) &&
                    g.conectados(8, 0);

            boolean ca = g.conectados(0,1) && g.conectados(1, 2) &&
                    g.conectados(2, 3) && g.conectados(3, 4) &&
                    g.conectados(4, 5) && g.conectados(5, 6) &&
                    g.conectados(6, 7) && g.conectados(7, 8) &&
                    g.conectados(8, 9) && g.conectados(9, 0);

            
            
            if(primerCiclo || aa || ab ||
                    bb || ba || ca)
                System.out.println("Hay un ciclo Hamiltoneano!!");
            else
                System.out.println("No hay ciclo Hamiltoneano");
            /*
            if(g.conectados(9,1) == true)
             {
                System.out.println("Hay un ciclo");
             }
             
             
             */
        } catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("no tenía que pasar esto");
        }
    }
}
