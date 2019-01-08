package Praktikum_10.Tugas;


public class NilaiMatakuliah extends Matakuliah {
    Double bobot_uts;
    Double bobot_uas;
    Double bobot_lain2;
    Double nilai_uts;
    Double nilai_uas;
    Double nilai_lain2;
    Double nilai_akhir;
    String Grade;
    
    public double hitungNilai(){
        bobot_uts = 0.3;
        bobot_uas = 0.3;
        bobot_lain2 = 0.4;
        nilai_uts = 0.8;
        nilai_uas = 7.5;
        nilai_lain2 = 8.5;
        
        nilai_akhir = (nilai_uts*bobot_uts)+(nilai_uas*bobot_uas)+(nilai_lain2*bobot_lain2);
        return nilai_akhir;
    }
    
    public void hitungGrade(){
        if(nilai_akhir <=100 || nilai_akhir >=80){
            System.out.println("Grade A");
        }else if(nilai_akhir >=75 || nilai_akhir <=79){
            System.out.println("Grade B");
        }else if(nilai_akhir >=50 || nilai_akhir <=74){
            System.out.println("Grade C");
        }else{
            System.out.println("Grade D");
        }
    }
}
