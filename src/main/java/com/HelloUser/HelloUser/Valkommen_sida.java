package com.HelloUser.HelloUser;

import org.springframework.web.bind.annotation.GetMapping;

public class Valkommen_sida{
    
@GetMapping("/")
public String valkommen() {
    return "index";
}
}