/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titkosito;

/**
 *
 * @author Székely Balázs
 * 
 * 5
 */
public class Dekodolo {
    private String szo;
    private int szam = 5;
    
    public String dekodol(String szoveg){
        char[] tomb = szoveg.toCharArray();
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] -= (char)tomb[i]-szam;
        }
        
        return new String(tomb);
    }
}
