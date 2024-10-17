package Genric_class;

class  Box<T> // this annotation makes it generic class where T defines the type of values box is going to held...
{
    private T value;
    public T getValue(){
        return value;
    }
    public void setValue(T value){
         this.value=value;
    }
}
public class GenericClass {
    public static void main(String[] args) {
        Box<String> b= new Box<>(); // now it is type safe
        b.setValue("java");
        System.out.println(b.getValue());
        
    }
    
}
