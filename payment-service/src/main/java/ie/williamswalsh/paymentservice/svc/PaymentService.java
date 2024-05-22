package ie.williamswalsh.paymentservice.svc;

import ie.williamswalsh.paymentservice.model.Type;

public interface PaymentService {
    Type submitPayment(String paymentInfo);
}
