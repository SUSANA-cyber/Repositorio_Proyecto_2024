/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionDb;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Julis
 */
public class cruDbjava {
    //create
    //read
    //update
    //input
    //boolean 
    
    public boolean escrituraDb(String nombreDb, String contenido) throws IOException   
    {       
        boolean estadoEscritura= false;
        String carpetaProyecto = "baseDeDatos";
        String nombreArchivo = nombreDb + ".txt";
        File carpeta = new File (carpetaProyecto);
        File f = new File (carpeta , nombreArchivo);
        try { 
               FileWriter fw = new FileWriter (f, true);
               BufferedWriter bw = new BufferedWriter(fw);
               bw.write (contenido+"\n");
               bw.close();
               estadoEscritura = true;
            } catch (IOException ex){
                 System.out.println("error; " +ex);
            }
           return estadoEscritura;
    }
}
