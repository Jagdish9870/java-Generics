package BoundedTypeParams;
interface Printable{
    void print();

}
class MyNumber extends Number implements Printable{
    private final int value;

    public MyNumber(int value){
        this.value =value;
    }


    @Override
    public void print(){
        System.out.println("my number is "+value);

    }


    @Override
    public int intValue() {
        return value;
       }


    @Override
    public long longValue() {
        return value;
           }


    @Override
    public float floatValue() {
        return value;
        }


    @Override
    public double doubleValue() {
        return value;
        }

}



class Boxx<T extends Number & Printable>{
    private T item;
    public Boxx(T item){
        this.item=item;
    }
    public void display(){
        item.print();

    }
    public T getItem(){
        return item;
    }


}
public class multipleBoundation{
    public static void main(String[] args) {
        MyNumber number= new MyNumber(12);
        Boxx<MyNumber> box21= new Boxx<>(number);
        box21.display();
        
    }



}