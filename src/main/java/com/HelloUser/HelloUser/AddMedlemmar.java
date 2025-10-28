package com.HelloUser.HelloUser;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



@Controller
public class AddMedlemmar {
    java.util.List<Medlemmar> medlemmar = new java.util.ArrayList<>();

   

    @GetMapping("/AddMedlemmar")
    public String showAddMedlemmarForm(Model model) {
        model.addAttribute("medlem", new Medlemmar());
        return "AddMedlemmar";
    }

   @PostMapping("/AddMedlemmar")
    public String addMedlemmar(Medlemmar medlem, RedirectAttributes redirectAttributes) {
       
        int nextId = medlemmar.size() + 1;
        medlem.setId(nextId);
        medlemmar.add(medlem);
        redirectAttributes.addFlashAttribute("message", "Medlem tillagd framgångsrikt!");
        System.out.println("Medlem tillagd: " + medlem.getFirstname() + " " + medlem.getLastname() + ", Födelsedag: " + medlem.getBirthdate() + ", E-post: " + medlem.getEmail());
        
        return "redirect:/AddMedlemmar";
    }
     @GetMapping("/VaraMedlemmar")
    public String getMedlem(Model model) {
        
        model.addAttribute("medlemmar", medlemmar);
        
        return "VaraMedlemmar";
    }
    @GetMapping("/remove-medlem/{id}")
    public String removeMedlem(@PathVariable ("id") int id) {
       System.out.println("Medlem borttagen med ID: " + id);
         
         medlemmar.removeIf(m -> m.getId() == id);
        
         return "redirect:/VaraMedlemmar";
    }
    

}
    

