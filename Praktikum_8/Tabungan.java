package Praktikum_8;


public class Tabungan {
    
    int saldo, ambilUang;
    
    public Tabungan(int initsaldo){
        saldo=initsaldo;
    }
    
    public void ambilUang(int jumlah){
        ambilUang=jumlah;
        saldo = saldo-ambilUang;
    }
}
