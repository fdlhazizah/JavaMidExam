package message;
public class StdMessenger extends MailMessenger{
    boolean isSuccess = false;
    
    public boolean sendMessege(String receiver, String subject, String messege){
        System.out.println("receiver:" +receiver);
        System.out.println("subject\t:" +subject);
        System.out.println("message\t:" +messege);
        System.out.println("Status\t:" +isSuccess);
        System.out.println("");
        return isSuccess = true;
    }
}
