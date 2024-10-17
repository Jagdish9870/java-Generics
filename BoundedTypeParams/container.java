package BoundedTypeParams;

class  Bag<T extends Number>  // now you can only extend numbers  it is known as bounded type params
{
    private T value;
    public T getValue(){
        return value;
    }
    public void setValue(T value){
         this.value=value;
    }
}
public class container {
    public static void main(String[] args) {
        Bag<Integer> b= new Bag<>(); // now it is type bounded
        b.setValue(20);
        System.out.println(b.getValue());
        
    }
    
}
