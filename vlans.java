/*Clase para crear diferentes separaciones de vlans, 
*util para hacer la segmentacion de vlas en base al tamaño de un segmento de red
*y el numero de vlans que se necesita.
*
*/
public class vlans {

    void suma(int segment, int numV){
        for(int i = 0; i<segment; i++){
            for(int j=0; j<numV; j++){
                System.out.println("interface Vlan 1"  + i + j);
            }
        }
    }

    public static void main (String[] args) {
        vlans vlan = new vlans();
        vlan.suma(5, 5);

    }
}