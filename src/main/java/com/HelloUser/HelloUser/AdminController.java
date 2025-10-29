package com.HelloUser.HelloUser;

import java.util.UUID;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AdminController {

    @GetMapping("/LoggIn")
    public String loginPage() {
        return "LoggIn";
    }

    @PostMapping("/LoggIn")
    public String trueLogin(@RequestParam String username,
                            @RequestParam String password,
                            HttpSession session,
                            RedirectAttributes redirectAttributes) {

        if ("admin".equals(username) && "admin".equals(password)) {

            session.setAttribute("username", "admin");
            session.setAttribute("userToken", UUID.randomUUID().toString());

            redirectAttributes.addFlashAttribute("success", "Inloggning lyckades!");
            return "redirect:/";
        }

        redirectAttributes.addFlashAttribute("error", "Inloggning misslyckades!");
        return "redirect:/LoggIn";
    }

    @GetMapping("/LoggUt")
    public String logout(HttpSession session, RedirectAttributes redirectAttributes) {
        session.invalidate();
        redirectAttributes.addFlashAttribute("success", "Du har loggats ut.");
        return "redirect:/";
    }
}
