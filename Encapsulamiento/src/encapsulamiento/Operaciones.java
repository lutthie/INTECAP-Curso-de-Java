/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 *
 * @author MV-JAVA
 */
public class Operaciones {
     private int n1;
     private int n2;
    
    public int getn1(){
        return n1;
    }
    
    public void setn1(int n1){
        this.n1 = n1; 
    }
    
        public int getn2(){
        return n2;
    }
    
    public void setn2(int n2){
        this.n2 = n2; 
    }
     
    private int suma(){
        int suma;
        suma = n1 + n2;
        return suma;        
    }
    
    public int getsuma(){
        return suma();
    }
    
    public void setsuma(int suma){
        this.suma();
    }
    
    private int resta(){
        int resta;
        resta = n1 - n2;
        return resta;        
    }
    
    public int getresta(){
        return resta();
    }
    
    public void setresta(int resta){
        this.resta();
    }
    
    private int multiplicacion(){
        int multi;
        multi = n1 * n2;
        return multi;        
    }
    
    public int getmultiplicacion(){
        return multiplicacion();
    }
    
    public void setmultiplicacion(int multiplicacion){
        this.multiplicacion();
    }
    
    private float division(){
        float div;
        div = (float)n1 / n2;
        return div;        
    }
    
    public float getdivision(){
        return division();
    }
    
    public void setdivision(float division){
        this.division();
    }
    
    private int residuo(){
        int res;
        res = n1 % n2;
        return res;        
    }
    
    public int getresiduo(){
        return residuo();
    }
    
    public void setresiduo(int residuo){
        this.residuo();
    }
}
