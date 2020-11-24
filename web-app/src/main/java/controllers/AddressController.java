package controllers;

import com.example.json.model.ShippingAddress;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @RequestMapping("/")
    public ShippingAddress getShippingAddress() {
        return new ShippingAddress();
    }
}
