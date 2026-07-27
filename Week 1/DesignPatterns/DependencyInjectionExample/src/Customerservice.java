public class Customerservice {
    private Customerrepository repository;
    public Customerservice(Customerrepository repository) {
        this.repository = repository;
    }
    public void getCustomer(int id) {
        System.out.println(repository.findCustomerById(id));
    }
}