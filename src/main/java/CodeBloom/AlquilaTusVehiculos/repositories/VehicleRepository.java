//Pdte. de implementar, necesario para evitar errores en los controladores

package CodeBloom.AlquilaTusVehiculos.repositories;

import CodeBloom.AlquilaTusVehiculos.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}