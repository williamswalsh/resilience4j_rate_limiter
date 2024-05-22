package ie.williamswalsh.paymentprocessor;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/processor-payment")
@RequiredArgsConstructor
public class PaymentProcessorController {
    private final PaymentProcessorService paymentProcessorService;
    @PostMapping
    public String processPayment(@RequestBody String paymentInfo) {
        return paymentProcessorService.processPayment(paymentInfo);
    }
}
