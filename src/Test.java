
public class Test {
    public static void main(String[] args) {
CustomArray array = new CustomArray(5);
array.add(2);
array.add(4);
array.add(3);
array.add(7);
array.add(11);

//array.add(1,40);

        System.out.println(array);

        //System.out.println(array.find(4));

        array.remove(4);
        System.out.println(array);
    }
}
