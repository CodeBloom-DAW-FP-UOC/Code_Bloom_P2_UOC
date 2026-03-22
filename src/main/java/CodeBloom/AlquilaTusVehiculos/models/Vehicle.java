package CodeBloom.AlquilaTusVehiculos.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "vehicles")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String plateNumber;

    private String brand;
    private String model;
    private Integer manufacturingYear;
    private String description;
    private Double dailyPrice;
    private String gasType;
    private Integer km;
    private String state;

    // Relación con Rental (1 vehículo → muchos rentals)
    @OneToMany(mappedBy = "vehicle")
    private List<Rental> rentals;

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPlateNumber() { return plateNumber; }
    public void setPlateNumber(String plateNumber) { this.plateNumber = plateNumber; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public Integer getManufacturingYear() { return manufacturingYear; }
    public void setManufacturingYear(Integer manufacturingYear) { this.manufacturingYear = manufacturingYear; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Double getDailyPrice() { return dailyPrice; }
    public void setDailyPrice(Double dailyPrice) { this.dailyPrice = dailyPrice; }

    public String getGasType() { return gasType; }
    public void setGasType(String gasType) { this.gasType = gasType; }

    public Integer getKm() { return km; }
    public void setKm(Integer km) { this.km = km; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public List<Rental> getRentals() { return rentals; }
    public void setRentals(List<Rental> rentals) { this.rentals = rentals; }
}