package message;
public class MailMessenger implements Messenger{
    boolean isSuccess = false;
    boolean isConnectedToServer = false;
    
    public void connect(){
        System.out.println("Server connected");
        isConnectedToServer = true;
    }
    
    public void disconnect(){
        System.out.println("Server Disconnected!");
        isConnectedToServer = true;
    }
    
    public boolean sendMessege(String receiver, String subject, String messege){
        if(isConnectedToServer = true){
            System.out.println("receiver:" +receiver);
            System.out.println("subject\t:" +subject);
            System.out.println("message\t:" +messege);
            System.out.println("Status\t:" +isSuccess);
            System.out.println("");
            return isSuccess = true;
        }else{
            System.out.println("message cannot be sent. Please check the connection");
            System.out.println("");
            return isSuccess = false;
        }
    }
}
