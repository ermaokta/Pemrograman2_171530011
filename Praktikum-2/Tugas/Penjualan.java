public class Penjualan {
    public static void main(String[] args) {
        int barangA = 10000;
        int barangB = 12000;
        int barangC = 3000;
        int barangD = 4000;
        int barangE = 5000;
        float totalharga = barangA + barangB + barangC + barangD + barangE;
        System.out.println("\tBarang A : " + barangA);
        System.out.println("\tBarang B : " + barangB);
        System.out.println("\tBarang C : " + barangC);
        System.out.println("\tBarang D : " + barangD);
        System.out.println("\tBarang E : " + barangE);
        System.out.println("\tTotal Harga : " + totalharga);

        double uang=50000;
        int kembali=(int) uang-(int) totalharga;
        System.out.println("\tUang : " + uang);
        System.out.println("\tKembalian : " + kembali);
    }
}