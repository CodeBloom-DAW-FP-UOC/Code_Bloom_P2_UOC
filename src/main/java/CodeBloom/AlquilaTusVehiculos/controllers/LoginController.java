package CodeBloom.AlquilaTusVehiculos.controllers;

import CodeBloom.AlquilaTusVehiculos.models.User;
import CodeBloom.AlquilaTusVehiculos.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
@Controller
public class LoginController {

    private final UserRepository userRepository;

    public LoginController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Mostrar formulario de login
    @GetMapping("/login")
    public String showLoginForm(@RequestParam(value = "error", required = false) String error,
                                Model model) {
        if (error != null) {
            model.addAttribute("errorMessage", "Correo o contraseña incorrectos");
        }

        // Valores por defecto para UI (solo para pruebas)
        model.addAttribute("defaultEmail", "admin@alquilatusvehiculos.com");
        model.addAttribute("defaultPassword", "admin123");

        return "login/login";
    }

    // Procesar login
    @PostMapping("/login")
    public String login(@RequestParam String email,
                        @RequestParam String password,
                        Model model) {

        // --- 1. Verificación hardcodeada (a la eespera de Datos reales) ---
        if (email.equals("admin@alquilatusvehiculos.com") && password.equals("admin123")) {
            return "redirect:/dashboard"; // redirige al dashboard o home
        }

        // --- 2. Verificación con  la base de datos (cuando tengamos usuarios) ---
        User user = userRepository.findAll().stream()
                .filter(u -> u.getEmail().equals(email) && u.getPassword().equals(password))
                .findFirst()
                .orElse(null);

        if (user != null) {
            return "redirect:/dashboard";
        }

        model.addAttribute("errorMessage", "Correo o contraseña incorrectos");
        return "login/login";
    }
}