/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labrador_thirdexamination;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Enriquie
 */
class SALESinv implements Serializable {
    
    
    
    public static ArrayList<SALESinv> SALESinvRECORDS = new ArrayList<>();
    public static final long serialVersionUID = 1L;
    
    private String NAME;
    private int QUANTITY;
    private double PRICE;
    private int SOLD;
    
    public SALESinv(){}
    
    //Constructor
    public SALESinv(String NAME,  int QUANTITY,double PRICE, int SOLD) {
        this.NAME = NAME;
        this.PRICE = PRICE;
        this.QUANTITY = QUANTITY;
        this.SOLD = SOLD;
    }
    
    public void setNAME(String NAME){
        this.NAME = NAME;
    }
    public void setPRICE(double PRICE){
        this.PRICE = PRICE;
    }
    public void setQUANTITY(int QUANTITY){
        this.QUANTITY = QUANTITY;
    }
    public void setSOLD(int SOLD) {
        this.SOLD = SOLD;
    }
    
    public String getNAME(){
        return NAME;
    }
    
    public double getPRICE(){
        return PRICE;
    }
    public int getQUANTITY(){
        return QUANTITY;
    }
    public int getSOLD(){
        return SOLD;
    }
    
}
