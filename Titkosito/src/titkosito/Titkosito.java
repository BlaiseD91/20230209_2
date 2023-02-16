/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package titkosito;

/**
 *
 * @author diak
 */
public class Titkosito {

    public static void main(String[] args) {
        
        
        
        Kodolo ko = new Kodolo();
        
        String kodolando = "Ez egy titkos jelszó";
        String titok = ko.kodol(kodolando);
        
        System.out.println(titok);
                
        Dekodolo dk = new Dekodolo();
        System.out.println("Dekódolva: "+dk.dekodol(titok));
        
    }
    
}
