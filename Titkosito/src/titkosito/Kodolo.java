
package titkosito;


public class Kodolo {
    
    private String szo;
    private int szam=2;
    

        public String kodol(String szo){
            char[] tomb = szo.toCharArray();
            for (int i = 0; i < tomb.length; i++) {
                tomb[i]= (char)(tomb[i]+szam);            
            }
            return new String (tomb);
        }
    }
    

