
package titkosito;


public class Kodolo {
    
    private String szo;
    private int szam=5;
    
    public String Kodolo(String szo){
        
        char[] tomb = szo.toCharArray();
        for (int i = 0; i < tomb.length; i++) {
            tomb[i]= (char)(tomb[i]+5);            
        }
        return new String (tomb);
    }
    
}
