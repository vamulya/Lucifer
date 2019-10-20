public class LaptopComparator {
    public String brand;
    public int ram;

    public LaptopComparator(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                '}';
    }

    public String getBrand(){
        return brand;
    }
    public int getRam(){
        return ram;
    }
}
