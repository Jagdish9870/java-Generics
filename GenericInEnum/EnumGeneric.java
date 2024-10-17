package GenericInEnum;
// enum Day{
//     Sunday,monday,tuesday,wednesday,thursday,friday,saturday;


// }
// public class EnumGeneric {
//     public static void main(String[] args) {
//         Day day=Day.monday;  // enum is already typeSafe so no need to define generics
//         System.out.println(day.toString());
      


        
//     }
    
// }

enum Operation{
    add,sub,mul,div;
    public <T extends Number> double apply(T a,T b){
        switch(this){
            case add:
            return a.doubleValue()+ b.doubleValue();
            case sub:
            return a.doubleValue()- b.doubleValue();
            case mul:
            return a.doubleValue()*b.doubleValue();
            case div:
            return a.doubleValue()/ b.doubleValue();
           default:
           throw new AssertionError("unknown operation "+this);

        }
       

    }

}
public class EnumGeneric {
    public static void main(String[] args) {
   System.out.println(Operation.add.apply(12, 15)); 
   System.out.println(Operation.mul.apply(12, 15)); 
       
      


        
    }
    
}
