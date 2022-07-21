package com.mircoService.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMyMethodController {

    @GetMapping("/userServiceFallBackMethod")
    public String userServiceFallBackMethod() {
        return "User Service is taking long than expected, please try again"
                + "Please try again later";
    }

    @GetMapping("/departmentServiceFallBackMethod")
    public String departmentServiceFallBackMethod() {
        return "Department Service is taking long than expected, please try again"
                + "Please try again later";
    }
}
