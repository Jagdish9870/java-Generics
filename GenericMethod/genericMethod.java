package GenericMethod;

public class genericMethod {
    // public <T> void methodName(T param)       // generic method
    // {

    // }

    public <T> void methodName(T[] array)       // generic method array type
    {
        for(T elment : array){
            System.out.println(elment+" ");

        }
       

    }
    // overloading through genric..
    public static <T> void display(T element){
        System.out.println("genric display:"+ element);
    }
    public static void display(Integer element){
        System.out.println(element);
    }
    public static void main(String[] args) {
        genericMethod gm= new genericMethod();
        Integer[] array= {1,2,5,6};
        gm.methodName(array);

        // display
        display(12.2);
        display(12);

        
    }
    
}
