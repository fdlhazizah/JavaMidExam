package data;
public class LaptopApp {
    public static void main(String[]args){
                
        var laptop1 = new Laptop();
        System.out.println("Spesifikasi Laptop Pertama");        
        laptop1.spesifikasi();
        
        System.out.println(" ");
        
        var laptop2 = new Laptop("ASUS VivoBook Ultra 14","Asus","Intel Core i7-1165G7",4,"Windows 10","8GB DDR4","SSD",10);
        System.out.println("Spesifikasi Laptop Kedua");
        laptop2.spesifikasi();
    }
}
