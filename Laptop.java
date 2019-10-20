public class Laptop implements java.lang.Comparable<Laptop>
{
    public String brand;
    public int ram;

    public Laptop(String brand, int ram) {
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
    @Override
    public int compareTo(Laptop o) {
        if(this.getRam()>o.getRam())
        return 1;
        else
            return -1;
    }
}
