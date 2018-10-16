import java.io.*;

public class CaseLogin {
    public static void main(String[] args) throws IOException {
        BufferedReader dataInput = new BufferedReader(new InputStreamReader(System.in));
        
        String id_user, password;
        boolean status = true;

        do{
            System.out.print("Masukkan ID.User : ");
            id_user = dataInput.readLine();

            System.out.print("Masukkan Password : ");
            password = dataInput.readLine();

            if(!id_user.equals("171530011")){
                System.out.println("ID. User yang anda masukkan Salah!");
            }else{
                if(!password.equals("mahasiswa123")){
                    System.out.print("Password yang anda masukkan Salah!");
                }else{
                    status = false;
                }
            }
        }while(status);
        System.out.println("Selamat Datang ... " + id_user);
    }
}

//sudah BENAR