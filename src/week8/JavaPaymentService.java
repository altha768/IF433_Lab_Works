package week8;


class JavaPaymentService {

    // This is the method required by your task (Step 3)
    public static String processPayment(String productId) {
        return "TRX-" + productId + "-SUCCESS";
    }

    // Additional helper for server checks
    public static String fetchServerStatus() {
        return "SERVER_ONLINE_200_OK";
    }
}