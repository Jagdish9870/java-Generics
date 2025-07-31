package WildCardsInGeneric;
import java.util.Arrays;
import java.util.List;
// wild card means ? and it is used in case of read only
public class WildCardEx {
    // public void printArray(ArrayList<?> list){
    //     for(Object o:list){
    //         System.out.println(o);
    //     }

    // }

    // writing method of generic type
    public static double sum(List<Integer> numbers){
        double sum=0;
        for(Number num: numbers){
            sum += num.doubleValue();
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.asList(1,2,5,6));
        System.out.println(sum(Arrays.asList(1,2,5,6)));
    }
    
}
