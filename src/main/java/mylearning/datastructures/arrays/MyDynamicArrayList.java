package mylearning.datastructures.arrays;

public class MyDynamicArrayList<E> implements MyList<E>{

    public static void main(String s[] ){
        MyList<Integer> myLIst = new MyDynamicArrayList(10);
    }

    private static final int DEFAULT_CAPACITY = 10;

    private static final Object[] EMPTY_ELEMENTDATA = {};

    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

    transient Object[] elementData; // non-private to simplify nested class access
    MyDynamicArrayList(int size){
        if(size > 0 ){
            elementData = new Object[size];
        }else{
            elementData = new Object[]{};
        }
    }



    @Override
    public int size() {
        return 0;
    }

    @Override
    public void add(E element) {

    }

    @Override
    public void add(E element, int index) {

    }

    @Override
    public void removeAtEnd() {

    }

    @Override
    public void removeElement(E object) {

    }

    @Override
    public E get() {
        return null;
    }
}

interface MyList<E>{
int size();
void add(E element);
void add(E element, int index);
void removeAtEnd();
void removeElement(E object);
E get();

}
