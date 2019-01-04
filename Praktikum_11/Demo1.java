package Praktikum_11;


public class Demo1 {
    
    public static void main(String[] args){
        String S = "Pemrograman Java";
        String HurufKapital = S.toUpperCase();
        String HurufKecil = S.toLowerCase();
        
        int IndexAwal = 12;
        int IndexAkhir = 16;
        char[] Karakter = new char[IndexAkhir-IndexAwal];
        S.getChars(IndexAwal, IndexAwal, Karakter, 0);
        
        byte[] temp = new byte[S.length()];
        temp = S.getBytes();
        
        String Trim = S.trim();
        String Sub = S.substring(5, 9);
        String Replace1 = S.replace("Pemrograman", "Program");
        String Replace2 = "Java".replace('v', 'w');
        
        System.out.println("Penggunaan toUpperCase()\t: "+HurufKapital);
        System.out.println("Penggunaan Method toLowerCase()\t: "+HurufKecil);
        System.out.println("Penggunaan Method chartA()\t: "+S.charAt(0));
        System.out.println("Penggunaan Method getChars()\t: "+Karakter[0]);
        System.out.println("Penggunaan Method getBytes()\t: "+temp[0]);
        System.out.println("Penggunaan Method trim()\t: "+Trim);
        System.out.println("Penggunaan Method substring()\t: "+Sub);
        System.out.println("Penggunaan Method replace()\t: "+Replace1+""+Replace2);
    }
}
