import.javax.swing.JOptionPane;

public class GetInputJOptionPane {
    public static void main(String[] args) {

        String nim,nama,tempat,tgllahir;
        
        nama = JOptionPane.showInputDialog("Masukkan Nama Anda : ");
        String msg = "Selamat Datang" + nama;
        JOptionPane.showMessageDialog(null, msg);

        nim = JOptionPane.showInputDialog("Masukkan NIM Anda : ");
        String msg = "NIM : " + nim;
        JOptionPane.showMessageDialog(null,msg);

        tempat = JOptionPane.showInputDialog("Masukkan Tempat Lahir Anda : ");
        String msg = "Tempat Lahir : " + tempat;
        JOptionPane.showMessageDialog(null, msg);

        tgllahir = JOptionPane.showInputDialog("Masukkan Tanggal Lahir Anda : ");
        String msg = "Tanggal Lahir : " + tgllahir;
        JOptionPane.showMessageDialog(null,msg);
    }
}

//dijalankan di netbean, karena JOptionPane sudah berupa tampilan GUI