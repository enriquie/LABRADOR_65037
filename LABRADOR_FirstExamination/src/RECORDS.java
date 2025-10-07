
import java.util.ArrayList;
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Enriquie
 */
class RECORDS implements Serializable {
    
    
    
    public static ArrayList<RECORDS> RECORDS = new ArrayList<>();
    public static final long serialVersionUID = 1L;
    
    private String NAME;
    private String ADDRESS;
    private String GRADE_LEVEL;
    private String GENDER;
    private String GWA;
    private String REMARKS;
    
    public RECORDS(){}
    
    //Constructor
    public RECORDS(String NAME, String ADDRESS, String GRADE_LEVEL, String GENDER, String GWA, String REMARKS){
        this.NAME = NAME;
        this.ADDRESS = ADDRESS;
        this.GRADE_LEVEL = GRADE_LEVEL;
        this.GENDER = GENDER;
        this.GWA = GWA;
        this.REMARKS = REMARKS;
    }
    
    public void setName(String NAME){
        this.NAME = NAME;
    }
    public void setADDRESS(String ADDRESS){
        this.ADDRESS = ADDRESS;
    }
    public void setGRADE_LEVEL(String GRADE_LEVEL){
        this.GRADE_LEVEL = GRADE_LEVEL;
    }
    public void setGENDER(String GENDER){
        this.GENDER = GENDER;
    }
    public void setGWA(String GWA){
        this.GWA = GWA;
    }
    public void setREMARKS(String REMARKS){
        this.REMARKS = REMARKS;
    }
    
    
    public String getNAME(){
        return NAME;
    }
    public String getADDRESS(){
        return ADDRESS;
    }
    public String getGRADE_LEVEL(){
        return GRADE_LEVEL;
    }
    public String getGENDER(){
        return GENDER;
    }
    public String getGWA(){
        return GWA;
    }
    public String getREMARKS(){
        return REMARKS;
    }
    
    
}


