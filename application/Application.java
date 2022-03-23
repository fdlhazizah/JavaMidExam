package application;
import data.Asus;
import data.HP;
public class Application {
    public static void main(String[]args){
                
        var laptop1 = new HP("HP 14s-DK0073AU","HP","AMD A4-9125",2,"Windows 10","4 GB DDR4","HDD", 5, 1.47, 5_500_000 );
        System.out.println("Spesifikasi Laptop Merek HP");        
        laptop1.spesifikasi();
        
        System.out.println(" ");
        
        var laptop2 = new Asus("ASUS VivoBook Ultra 14","Asus","Intel Core i7-1165G7",4,"Windows 10","8GB DDR4","SSD M2",10,1.4,12_799_000);
        System.out.println("Spesifikasi Laptop Merek Asus");        
        laptop2.spesifikasi();
    } 
}
