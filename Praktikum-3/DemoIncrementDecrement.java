public class DemoIncrementDecrement {
    public static void main(String[] args) {
        int x=1, y=1, z=1;

        //Nilai Awal
        System.out.println("Nilai X : " + x);
        System.out.println("Nilai Y : " + y);
        System.out.println("Nilai Z : " + z);

        //Increment
        x++; y++;
        System.out.println("Nilai X : " + x);
        System.out.println("Nilai Y : " + y++);
        System.out.println("Nilai Z : " + ++z);
        System.out.println("Nilai Y : " + y);

        //Decrement
        x--; y--;
        System.out.println("Nilai X : " + x);
        System.out.println("Nilai Y : " + y--);
        System.out.println("Nilai Z : " + --z);
        System.out.println("Nilai Y : " + y);
    }
}