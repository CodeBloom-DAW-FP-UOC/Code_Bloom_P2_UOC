package CodeBloom.AlquilaTusVehiculos;

import io.github.cdimascio.dotenv.Dotenv;
import jdk.javadoc.doclet.DocletEnvironment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlquilaTusVehiculosApplication {

	public static void main(String[] args) {
        // Configuración para detectar variables de entorno
        Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
        dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));

        SpringApplication.run(AlquilaTusVehiculosApplication.class, args);
	}

}
