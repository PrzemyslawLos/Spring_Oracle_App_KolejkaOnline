package com.losprzemyslaw.kolejkaonline.controllers;

import com.losprzemyslaw.kolejkaonline.ChargeRequest;
import lombok.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CheckoutController {

    private String stripePublicKey =
            "pk_test_51IGRcbB5gfYsIS55OiGdI35zGOu1SJpc3LrzAC4unyhSFnququt0T6A8OxfYuScXeBRJPUdscqERVWdJyOjrqNs900na3jyU90";

    @RequestMapping("/checkout")
    public String checkout(Model model) {
        model.addAttribute("amount", 50 * 100); // in cents
        model.addAttribute("stripePublicKey", stripePublicKey);
        model.addAttribute("currency", ChargeRequest.Currency.EUR);
        return "checkout";
    }
}
