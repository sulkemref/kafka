package com.cydeo.checkout.controller;

import com.cydeo.checkout.dto.CheckoutDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/checkout")
public class CheckoutController {

    @PostMapping
    public String checkout(@RequestBody CheckoutDTO checkoutDTO){

        return "message sent";
    }
}
