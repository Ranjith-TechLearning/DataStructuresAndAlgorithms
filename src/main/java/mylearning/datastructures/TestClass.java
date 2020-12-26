package mylearning.datastructures;

public class TestClass {
    public static void main(String arg[]){
        MyImmutableClass myImmutableClass = new MyImmutableClass(23, Float.valueOf(5L), 10);
        System.out.println("This is test.. "+myImmutableClass.getAge());
        System.out.println("This is test.. "+myImmutableClass.getCurrency());
    }
}


class MyImmutableClass{
    private final int age ;
    private final Float currency;
    private final int size;

    MyImmutableClass(int age, Float currency, int size){
        this.age = age;
        this.currency = currency;
        this.size = size;
    }
    public int getAge(){
        return this.age;
    }
    public Float getCurrency(){
        return currency;
    }

}
