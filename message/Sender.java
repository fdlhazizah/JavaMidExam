package message;
public class Sender {
    public static void main(String[]args){
        var mail = new MailMessenger();
        System.out.println("Status Koneksi saat ini : Disconnected");
        mail.disconnect();
        mail.sendMessege("Lala", "Test1", "pesan pertama");
        mail.connect();
        mail.sendMessege("Lala", "Test2", "pesan kedua");
        
        var std = new StdMessenger();
        mail.sendMessege("Lala", "Test pesan", "ini pesan");
    }
}
