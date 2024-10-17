package GenericConstructors;

// here both class and constructor are generic 
// class dibba<T extends Number>{
//     private T value;
//     public dibba(T value){
//         this.value = value;


//     }

    
//     public T getValue(){
//         return value;}
//     public void setValue(T value){
//         this.value = value;
//     }
// }

// generic constructor without generic class
class dibba2{

   
    public<T> dibba2(T value){
        


    }

    
    
}

public class genericConstructor {
    public static void main(String[] args) {
        dibba2 d= new dibba2(22);
       

        
    }
    
}
