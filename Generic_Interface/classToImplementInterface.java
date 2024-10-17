package Generic_Interface;

public class classToImplementInterface implements genericInterface<String> {
    private String item;

    @Override
    public void add(String item) {
        this.item=item;
          }

    @Override
    public String get() {
        return item;
         }
    
}
