package Genric_class;
class  Box2<K,V>
{
    private V value;
    private K key;
    public Box2(K key,V value){
        this.key=key;
        this.value=value;
    }

    
    public V getValue(){
        return value;
    }
    public K getKey(){
        return key;
    }
}
public class genericClass2 {
    public static void main(String[] args) {
        Box2<String,Integer> b= new Box2<>("jack",21); // now it is type safe
       
        System.out.println(b.getKey()+" "+b.getValue());
        
    }
    
}
