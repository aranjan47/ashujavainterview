//@Service
//public class OrderService {
//
//    private final WebClient webClient;
//
//    public OrderService(WebClient.Builder builder) {
//        this.webClient = builder.baseUrl("http://payment-service").build();
//    }
//
//    public String callPaymentService() {
//        return webClient.post()
//                .uri("/process")
//                .retrieve()
//                .bodyToMono(String.class)
//                .block(); // waiting for response
//    }
//}