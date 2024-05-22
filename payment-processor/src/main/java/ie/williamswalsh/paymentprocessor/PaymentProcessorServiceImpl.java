package ie.williamswalsh.paymentprocessor;

import org.springframework.stereotype.Service;

@Service
public class PaymentProcessorServiceImpl implements PaymentProcessorService {
    @Override
    public String processPayment(String paymentInfo) {
        // Simulated logic to process payment
        return "Payment processed: " + paymentInfo;
    }
}
