package generics_and_java_collection;

public class GenericMethod {

    public <Y> void demo( Y y){
        System.out.println(y);
    }

    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.demo("Fidelis");
        genericMethod.demo(2424242);
    }


}
