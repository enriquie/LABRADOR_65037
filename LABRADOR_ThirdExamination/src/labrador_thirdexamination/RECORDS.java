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
class RECORDS implements Serializable {
    
    
    
    public static ArrayList<RECORDS> RECORDS = new ArrayList<>();
    public static final long serialVersionUID = 1L;
    
    private String NAME;
    private String INFO;
    private String MFG_DATE;
    private String EXP_DATE;
    private double PRICE;
    private int QUANTITY;
    private int SOLD;
    
    public RECORDS(){}
    
    //Constructor
    public RECORDS(String NAME, String INFO, String MFG_DATE, String EXP_DATE, Double PRICE, int QUANTITY) {
        this.NAME = NAME;
        this.INFO = INFO;
        this.MFG_DATE = MFG_DATE;
        this.EXP_DATE = EXP_DATE;
        this.PRICE = PRICE;
        this.QUANTITY = QUANTITY;
        this.SOLD = SOLD;
    }
    
    public void setNAME(String NAME){
        this.NAME = NAME;
    }
    public void setINFO(String INFO){
        this.INFO = INFO;
    }
    public void setMFG_DATE(String MFG_DATE){
        this.MFG_DATE = MFG_DATE;
    }
    public void setEXP_DATE(String EXP_DATE){
        this.EXP_DATE = EXP_DATE;
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
    public String getINFO(){
        return INFO;
    }
    public String getMFG_DATE(){
        return MFG_DATE;
    }
    public String getEXP_DATE(){
        return EXP_DATE;
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
