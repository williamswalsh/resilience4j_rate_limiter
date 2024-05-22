# Service & Processor with Resilience4J rate-limiter feature

The service has a rate limiter configured on a per-method basis(per instance not across instances).  

```bash
# Can hit actuator endpoint to check svc status
# Displays Rate Limiter details      
http://localhost:9090/actuator/health

# Can hit payment service endpoint by POST'ing a string to:
http://localhost:9090/api/v1/payment-service

# Can hit payment processor endpoint directly by POST'ing a string to:
http://localhost:1010/api/v1/processor-payment
```