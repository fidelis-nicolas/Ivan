package generics_and_java_collection;


public class GenericsDemo <T>  {
   private T t;

   public GenericsDemo(T t){
       this.t = t;
    }

    public T getT(){
       return this.t;
    }

}
