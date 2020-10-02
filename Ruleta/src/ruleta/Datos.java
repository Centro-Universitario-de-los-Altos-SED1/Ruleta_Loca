/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruleta;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ruleta_Loca
 */
public class Datos {
    String Nombre, respuesta;
    int i, NumeroLista;
    boolean control;
    private ArrayList<String> con = new ArrayList<String>();
        
    
    public void inserta(String dato)
    {
        this.con.add(dato);
        
    }
    
    public String showOne(int pos)
    {
        return this.con.get(pos);
    }    
    
    public String getNombre(){
        return Nombre;
    }
    
    public int getNumeroLista()
    {
        return NumeroLista;
    }
    
    public ArrayList showAll()
    {
        return this.con;
    }
    
    
    
    public boolean isControl() {
        return control;
    }
    
    public void setControl(boolean control) {
        this.control = control;
    }
    
    public void Entrasalida(ArrayList A, ArrayList B)
    {
        int i= A.size();
        for(int k=0; k<=A.size(); k++)
        {
            i= (int) k;
        }
        
        int m = (int) (Math.random() * i);                       
        
        
        for(int j=0; j<=A.size(); j++)
        {     
            if(j==m)
            {
                this.respuesta = B.get(j) + " " + A.get(j);        
            }
        }
        
    }
    
    
    public String SoloSalida()
    {
        return this.respuesta;        
    }

    String Entrasalida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
