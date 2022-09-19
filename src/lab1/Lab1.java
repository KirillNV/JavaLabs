
package lab1;

/**
 *
 * @author Nikifor
 */
public class Lab1 {

   
    public static void main(String[] args) {
       Integer even = 0;
       Integer uneven = 0;
 for (String x : args) {
 
 if (Integer.parseInt(x) % 2 == 0 && Integer.parseInt(x) >0) {// четные положительные
 even = even + 1;
 } else if (Integer.parseInt(x) % 2 != 0 && Integer.parseInt(x) >0){//«нечётных и положительных
 uneven = uneven + 1;
 }
 }
 
 if (even > uneven){
 System.out.println("even");//вывод "чётного" 
 }
 else if (even < uneven){
 System.out.println("uneven");//вывод "нечётного"
 }
 else{
 System.out.println("="); 
 }
   }
    
}
