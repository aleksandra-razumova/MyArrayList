public class Main {
    public static void main(String[] args) {
        MyArrayList <Integer> tests = new MyArrayList<>();

        for (int i =0; i<25; i++){
            tests.add(i);
        }

        tests.add(0, 123);
        tests.remove(2);

        for (int i = 0; i< tests.size(); i++) {
            System.out.println(tests.get(i));
        }
        System.out.println();
        System.out.println(tests.isEmpty());
        System.out.println(tests.contains(123));
        System.out.println(tests.size());

        tests.clear();
        System.out.println(tests.size());

    }
}