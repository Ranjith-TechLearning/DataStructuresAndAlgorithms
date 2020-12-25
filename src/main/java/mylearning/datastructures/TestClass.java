package mylearning.datastructures;

public class TestClass {
    public static void main(String arg[]){
        MyImmutableClass myImmutableClass = new MyImmutableClass(23, Float.valueOf(5L));
        System.out.println("This is test.. "+myImmutableClass.getAge());
        System.out.println("This is test.. "+myImmutableClass.getCurrency());
    }
}

class MyImmutableClass{
    private final int age ;
    private final Float currency;
    public MyImmutableClass(int age, Float currency){
        this.age = age;
        this.currency = currency;
    }
    public int getAge(){
        return this.age;
    }
    public Float getCurrency(){
        return currency;
    }
    public void setAge(int newAge){
       // this.age = newAge;
    }
}
