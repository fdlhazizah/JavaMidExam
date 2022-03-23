package data;
public class Asus extends Laptop{
    private double berat;
    private int harga;
    
    public Asus(String nama, String brand, String processor, int core, String SO, String RAM, String jns_storage, int stok, double berat, int harga){
        super(nama, brand, processor, core, SO, RAM, jns_storage, stok);
        this.berat=berat;
        this.harga=harga;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat() {
        this.berat = berat;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga() {
        this.harga = harga;
    }
    
     public String getStorageType() {
        if(this.getJns_storage()== "SSD M2"){
            return "Best";
        }
        else if(this.getJns_storage()== "SSD SATA"){
            return "Good";
        }
        else{
            return "Midle";
        }
    }
    
    @Override
    public void spesifikasi(){
        System.out.println("Nama\t\t: " +this.getNama());
        System.out.println("Brand\t\t: " +this.getBrand());
        System.out.println("Processor\t: " +this.getProcessor());
        System.out.println("Jumlah Core\t: " +this.getCore());
        System.out.println("Sistem Operasi\t: " +this.getSO());
        System.out.println("Jumlah RAM\t: " +this.getRAM());
        System.out.println("Jenis Storage\t: " +this.getJns_storage());
        System.out.println("Stok\t\t: " +this.getStok());
        System.out.println("Berat laptop\t: " +this.getBerat());
        System.out.println("Harga\t\t: " +this.getHarga());
        System.out.println("storageType\t: " +this.getStorageType());
    }
}
