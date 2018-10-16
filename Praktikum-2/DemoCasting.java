public class DemoCasting {
    public static void main(String[] args) {
        //Casting Implisit
        byte b =100;
        int i = b;

        //Casting Eksplisit
        int x = 1000;
        byte y = (byte) x;
        System.out.println("Casting byte y : " + y);

        double j = 10.5;
        int k = (int) j;
        System.out.println("Casting int k : " + k);

        j = 10.2;
        int l = (int) j;
        System.out.println("Casting int l : " + l);

        j = 10.8;
        short m = (short) j;
        System.out.println("Casting short m :" + m);
    }
}

//tidak perlu ada pendekripsian ulang variabel, karna akan menyebabkan error