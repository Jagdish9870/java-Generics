package genericException;
class MyException extends Exception{
    public <T> MyException(T message){
        super("Exception : "+message.toString()+" of type "+ message.getClass().getName());

    }
}

public class GenericExcept {
    public static void main(String[] args) {
        try{
            throw new MyException(125);
        }
        catch(Exception e){
            System.out.println("caught exception: "+e.getMessage());

        }
        try{
            throw new MyException("String");
        }
        catch(Exception e){
            System.out.println("caught exception: "+e.getMessage());
            
        }
    }
    
}
