package com.HelloUser.HelloUser;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AddMedlemmar {

   

    @GetMapping("/AddMedlemmar")
    public String showAddMedlemmarForm(Model model) {
        model.addAttribute("medlem", new Medlemmar());
        return "AddMedlemmar";
    }

   @PostMapping("/AddMedlemmar")
    public String addMedlemmar(Medlemmar medlem, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("message", "Medlem tillagd framgångsrikt!");
        System.out.println("Medlem tillagd: " + medlem.getFirstname() + " " + medlem.getLastname() + ", Födelsedag: " + medlem.getBirthdate() + ", E-post: " + medlem.getEmail());
        return "redirect:/AddMedlemmar";
    }

}
    

