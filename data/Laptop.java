package data;
import java.util.Scanner;
public class Laptop {
    Scanner scanner = new Scanner(System.in);
    private String nama, brand, processor, SO, RAM, jns_storage;
    private int core, stok;
    
    public Laptop(String nama, String brand, String processor, int core, String SO, String RAM, String jns_storage, int stok){
        this.nama=nama;
        this.brand=brand;
        this.processor=processor;
        this.core=core;
        this.SO=SO;
        this.RAM=RAM;
        this.jns_storage=jns_storage;
        this.stok=stok;
    }
    
    public Laptop(){
        this.setNama();
        this.setBrand();
        this.setProcessor();
        this.setCore();
        this.setSO();
        this.setRAM();
        this.setJns_storage();
        this.setStok();
    }

    public String getNama() {
        return nama;
    }

    public void setNama() {
        System.out.println("Nama\t\t: ");
        this.nama = scanner.nextLine();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand() {
        System.out.println("Brand\t\t: ");
        this.brand = scanner.nextLine();
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor() {
        System.out.println("Processor\t: ");
        this.processor = scanner.nextLine();
    }

    public String getSO() {
        return SO;
    }

    public void setSO() {
        System.out.println("Sistem operasi\t: ");
        this.SO = scanner.nextLine();
    }
    
    public String getRAM() {
        return RAM;
    }

    public void setRAM() {
        System.out.println("Jumlah RAM\t: ");
        this.RAM = scanner.nextLine();
    }

    public String getJns_storage() {
        return jns_storage;
    }

    public void setJns_storage() {
        System.out.println("Jenis Storage\t: ");
        this.jns_storage = scanner.nextLine();
    }

    public int getCore() {
        return core;
    }

    public void setCore() {
        System.out.println("Jumlah Core\t: ");
        this.core = scanner.nextInt();
    }

    public int getStok() {
        return stok;
    }

    public void setStok() {
        System.out.println("Stok\t\t: ");
        this.stok = scanner.nextInt();
    }
    
    public void spesifikasi(){
        System.out.println("Nama\t\t: " +this.getNama());
        System.out.println("Brand\t\t: " +this.getBrand());
        System.out.println("Processor\t: " +this.getProcessor());
        System.out.println("Jumlah Core\t: " +this.getCore());
        System.out.println("Sistem Operasi\t: " +this.getSO());
        System.out.println("Jumlah RAM\t: " +this.getRAM());
        System.out.println("Jenis Storage\t: " +this.getJns_storage());
        System.out.println("Stok\t\t: " +this.getStok());
    }
    
}
