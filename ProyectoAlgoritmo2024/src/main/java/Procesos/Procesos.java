/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procesos;

/**
 *
 * @author Julis
 */
public class Procesos {
  public boolean Verificacion(String usuario, String contraseña){
     boolean Comprovacion = false;
     
     if ("susana".equals(usuario)&& "lopez".equals(contraseña)){
         Comprovacion = true;
     }
      
      return Comprovacion;
  }
}
