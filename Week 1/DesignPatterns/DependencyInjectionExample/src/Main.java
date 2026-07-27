public class Main {
    public static void main(String[] args) {
        Customerrepository repository = new Customerrepository();
        Customerservice service = new Customerservice(repository);
        service.getCustomer(101);
    }
}