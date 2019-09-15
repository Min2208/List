public class MyListTest {
    public static void main(String[] args) {
        MyList<String> stringMyList=new MyList<String>();

        stringMyList.add("vuong");
        stringMyList.add("Vuongdaica");
        stringMyList.add("Vuongno1");
        stringMyList.add("Vuongdaizai");
        try {
            System.out.println(stringMyList.get(3));
            System.out.println(stringMyList.get(11));
            System.out.println(stringMyList.get(1));
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index out of array");
        }

    }

}
