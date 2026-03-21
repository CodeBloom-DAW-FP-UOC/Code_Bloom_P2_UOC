package CodeBloom.AlquilaTusVehiculos.models;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;
    private String phone;
    private String address;

    private LocalDateTime registrationDate;

    @Column(unique = true)
    private String drivingLicense;

    private Boolean isAdmin;

    @OneToMany(mappedBy = "user")
    private List<Rental> rentals;
}