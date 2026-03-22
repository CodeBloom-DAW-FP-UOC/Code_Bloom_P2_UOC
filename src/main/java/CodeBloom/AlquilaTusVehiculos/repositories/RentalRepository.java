package CodeBloom.AlquilaTusVehiculos.repositories;

import CodeBloom.AlquilaTusVehiculos.models.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<Rental, Long> {
}