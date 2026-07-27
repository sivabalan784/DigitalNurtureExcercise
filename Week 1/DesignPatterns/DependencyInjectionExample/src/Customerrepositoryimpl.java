public class Customerrepositoryimpl implements Customerrepository {
    @Override
    public String findCustomerById(int id) {
        return "Customer ID: " + id + ", Name: Siva";
    }
}