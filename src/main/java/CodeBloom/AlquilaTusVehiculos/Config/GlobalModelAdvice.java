package CodeBloom.AlquilaTusVehiculos.Config;

import CodeBloom.AlquilaTusVehiculos.models.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class GlobalModelAdvice {

    @ModelAttribute("currentUser")
    public User currentUser(HttpSession session) {
        return (User) session.getAttribute("loggedUser");
    }
}

