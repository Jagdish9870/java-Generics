package WildCardsInGeneric;

import java.util.ArrayList;
import java.util.Arrays;
// wild card means ? and it is used in case of read only
public class WildCardEx {
    // public void printArray(ArrayList<?> list){
    //     for(Object o:list){
    //         System.out.println(o);
    //     }

    // }

    // writing method of generic type
    public static double sum(ArrayList<? extends Number> numbers){
        double sum=0;
        for(Number num: numbers){
            sum += num.doubleValue();
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.asList(1,2,5,6));
        
    }
    
}
