package homework5.HW5;


public class Main {
    public static void main(String[] args) {

        MyList<Integer> arrayList = new MyList();
        arrayList.add(32);
        arrayList.add(1);
        arrayList.add(65);
        arrayList.add(-5);
        arrayList.add(3);

        System.out.println(arrayList.toString());
        System.out.println(arrayList.largestElement());
        System.out.println(arrayList.smallestElement());

    }
}
