public class DemoLogika {
    public static void main(String[] args) {
        //beberapa nilai
        int i = 37;
        int j = 42;
        int k = 42;
        System.out.println("Nilai Variabel...");
        System.out.println(" i = " + i);
        System.out.println(" j = " + j);
        System.out.println(" k = " + k);

        //lebih besar dari
        System.out.println("Lebih besar dari...");
        System.out.println(" i > j = " + (i > j));
        System.out.println(" j > i = " + (j > i));
        System.out.println(" k > j = " + (k > j));

        //lebih besar atau sama dengan
        System.out.println("Lebih besar dari atau sama dengan...");
        System.out.println(" i >= j = " + (i >= j));
        System.out.println(" j >= i = " + (j >= i));
        System.out.println(" k >= j = " + (k >= j));

        //lebih kecil dari
        System.out.println("Lebih kecil dari...");
        System.out.println(" i < j = " + (i < j));
        System.out.println(" j < i = " + (j < i));
        System.out.println(" k < j = " + (k < j));

        //lebih kecil dari atau sama dengan
        System.out.println("Lebih kecil dari atau sama dengan...");
        System.out.println(" i <= j = " + (i <= j));
        System.out.println(" j <= i = " + (j <= i));
        System.out.println(" k <= j = " + (k <= j));

        //sama dengan
        System.out.println("Sama dengan...");
        System.out.println(" i == j = " + (i == j));
        System.out.println(" k == j = " + (k == j));

        //tidak sama dengan
        System.out.println("Tidak sama dengan...");
        System.out.println(" i != j = " + (i != j));
        System.out.println(" k != j = " + (k != j));
    }
}