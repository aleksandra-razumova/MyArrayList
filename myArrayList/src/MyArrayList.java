public class MyArrayList<T>  {
    private final int DEFAULT_CAPACITY = 10;
    private int size;
    private T [] list;

    public MyArrayList() {
        this.list = (T[]) new Object [DEFAULT_CAPACITY];
    }

    public void add(T value) {
        if (size == list.length) {
            T [] tempList = (T[]) new Object [list.length * 2];
            for (int i = 0; i < list.length; i++) {
                tempList[i] = list[i];
            }
            list = tempList;
        }
        list[size] = value;
        size++;
    }

    public void add (int index, T value) {
        if (index >= 0 && index < size) {
            list[index] = value;
        }
    }

    public T get(int index) {
        if (index >= 0 && index < size) {
            return list[index];
        } else {
            return null;
        }
    }

    public  int size(){
        return size;
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            list[index] = null;
            for (int i = index + 1; i < list.length - 1; i++) {
                list[i - 1] = list[i];
                list[i] = null;
            }
            size--;
        }
    }

    public void remove(T value){
        int index;
        for (int i = 0; i<list.length; i++){
            if (value.equals(list[i])){
                list[i]=null;
                index=i;
                for (int j = index + 1; j < list.length - 1; j++) {
                    list[j - 1] = list[j];
                    list[j] = null;
                }
            }
        }
        size--;
    }

    public void clear(){
        for (int i = 0; i< list.length; i++){
            list[i]=null;
        }
        size=0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean contains(T value){
        boolean status = false;
        for (int i = 0; i < list.length; i++){
            if (value.equals(list[i])){
                status= true;
            }
        }
        return status;
    }
}
