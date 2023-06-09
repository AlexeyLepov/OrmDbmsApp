package al.exe;

import javax.persistence.*;

@Entity
@Table(name = "cpu")
public class ClassCPU
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "model")
    private String model;
    @Column(name = "price")
    private double price;
    @Column(name = "cores")
    private int cores;
    @Column(name = "threads")
    private int threads;
    @Column(name = "frequency")
    private int frequency;
    @ManyToOne
    @JoinColumn(name = "brand_id")
    private ClassBrand brand;
    @ManyToOne
    @JoinColumn(name = "socket_id")
    private ClassSocket socket;

    // Default constructor
    public ClassCPU() 
    {
    }

    // Parameterized constructor
    public ClassCPU(String model, double price, int cores, int threads, int frequency, ClassBrand brand, ClassSocket socket) 
    {
        this.model = model;
        this.price = price;
        this.cores = cores;
        this.threads = threads;
        this.frequency = frequency;
        this.brand = brand;
        this.socket = socket;
    }

    // Getters
    public int getId() 
    {
        return id;
    }
    public String getModel() 
    {
        return model;
    }

    public double getPrice() 
    {
        return price;
    }
    public int getCores() 
    {
        return cores;
    }
    public int getThreads() 
    {
        return threads;
    }
    public int getFrequency() 
    {
        return frequency;
    }
    public ClassBrand getBrand() 
    {
        return brand;
    }
    public ClassSocket getSocket() 
    {
        return socket;
    }

    // Setters
    public void setId(int id) 
    {
        this.id = id;
    }
    public void setModel(String model) 
    {
        this.model = model;
    }
    public void setPrice(double price) 
    {
        this.price = price;
    }
    public void setCores(int cores) 
    {
        this.cores = cores;
    }
    public void setThreads(int threads) 
    {
        this.threads = threads;
    }
    public void setFrequency(int frequency) 
    {
        this.frequency = frequency;
    }
    public void setBrand(ClassBrand brand) 
    {
        this.brand = brand;
    }
    public void setSocket(ClassSocket socket) 
    {
        this.socket = socket;
    }
}
