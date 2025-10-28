package com.HelloUser.HelloUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class AddMedlemmar {

    @GetMapping("/AddMedlemmar")
    public String AddMedlemmar() {
        return "AddMedlemmar";
    }
    

   

    
    
}
