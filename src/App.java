/**
 * @date: 30.mayo.2023
 * @author: Sara UwU
 * @description: primer programa UwU
 * 
 */
import java.util.Scanner;
/**
 *@description: mi primera clase <3
 */
public class App {
    /**
     *
     * @param nSigno
     */
    public static void secuenciaSigno( int nSigno){
        for (int i = 0; i < nSigno; i++) {
            System.out.print("+"); 
        }
   }
   /**
    * <b>secuenciaAlterna de sino</b>: alterna signos :D
    * @param nSigno
    */
   public static void secuenciaAlterno(int nSigno) {
    for (int i = 0; i < nSigno; i++) 
    
    if (i%2==0) 
        System.out.print("+");

        
     else 
        System.out.print("-");
    

   
}
    public static void main(String[] args) throws Exception {

    
        int nSigno=5;
        // str: es un patron a buscar en unj flujo de caracteres
        //str abreviacion de strings
        String strFrutas="coco,banana,piña,manzana,pera,frutilla,sandia";
        String strDelimitador="-:-";
        usoScanner(strFrutas, strDelimitador);


        //no colocar la palabra 
        // documentar siempre :D 
    


      
        
        
    secuenciaSigno(nSigno);
    System.out.println("");
    secuenciaAlterno(nSigno);
// secuencia alternados


    







    }
    /**
     * usoEscanner:indica como usar la lib Scanner
     * @param strFrutas: caracter oara hacer la segmentacion
     * @param strDelimitador
     */
    
    private static void usoScanner(String strFrutas, String strDelimitador) {
        Scanner sc=new Scanner(strFrutas);
        sc.useDelimiter(strDelimitador);
        while(sc.hasNext()){
            System.out.println(sc.next());

        }
        sc.close();
    }
}
