import java.lang.reflect.Array;

public class CustomArray {
    int[] myArray;
    int size;
    int capacity;

    public CustomArray(int capacity) {
        this.capacity = capacity;
        myArray = new int[capacity];
    }

    //add
    public void add(int num) {
        if (capacity > size) {
            //size increases after assigning new num
            myArray[size++] = num;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < size; i++) {
            builder.append(myArray[i]);
            if (i != size - 1) {
                builder.append(", ");

            }
        }
        builder.append("]");
        return builder.toString();
    }

    //add
    public void add(int index, int num) {
        if (index >= 0 && index <= size && size < capacity) {
            for (int i = size; i > index; i--) {
                myArray[i] = myArray[i - 1];//for eg, the int in the 5th index goes to the 6th index;
            }//myaArray[5] = myArray[5-1];myArray[4]
            myArray[index] = num;
            size++;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    //find
    public int find(int value) {
        for (int i = 0; i < size; i++) {
            if (myArray[i] == value) {
                return i;
            }
        }
        return -1;
    }


    //delete
    public void remove(int num){
        int index = find(num);
        if(index==-1){
            throw new IllegalArgumentException("Value not found in the array");
        }
        for(int i = index; i<size-1;i++){
            myArray[i] = myArray[i+1];

        }
        size--;
        myArray[size] = 0;//assign 0 to the last index to show that index exists [10,20,30,50,0]
    }
}
