package com.HelloUser.HelloUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddMedlemmar {

    @GetMapping("/AddMedlemmar")
    public String AddMedlemmar() {
        return "AddMedlemmar";
    }
    
}
