import java.io.*;

public class Login {
    public static void main(String[] args) {
        BufferedReader dataInput = new BufferedReader (new InputStreamReader(System.in));

        String pass = " ";
        String id = " ";

        while(true){
            System.out.print("Masukkan ID User : ");
            try{
                id = dataInput.readLine();
            }catch( IOException ex ){
                System.out.println("Error!" + ex);
            }

            System.out.print("Masukkan Password : ");
            try{
                pass = dataInput.readLine();
            }catch( IOException ex ){
                System.out.println("Error!" + ex);
            }

            if(id.equals("171530011") && pass.equals("mahasiswa123")){
                System.out.println("Selamat Datang " + id);
                break;
            }else if(id.equals("171530011") == false){
                System.out.println("ID. User Salah");
            }else if(pass.equals("mahasiswa123") == false){
                System.out.println("Password Salah");
            }
        }
    }
}