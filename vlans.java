/*Clase para crear diferentes separaciones de vlans, 
*util para hacer la segmentacion de vlas en base al tamaño de un segmento de red
*y el numero de vlans que se necesita.
*
*/
import  java.text.MessageFormat;

public class vlans {

    void suma(int start, int segment, int numV){
        for(int i = 0; i<segment; i++){
            for(int j=0; j<numV; j++){
                System.out.println(MessageFormat.format("interface Vlan {0}",  start+ (i*10) + j));
                System.out.println("name client");
            }
        }
    }

    public static void main (String[] args) {
        
        String[] vlanNames;
        vlans vlan = new vlans();
        vlan.suma(110, 5, 5);

    }
}