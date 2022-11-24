package ge.edu.sangu;

public class GPayStrategy implements PaymentStrategy {

    private String phoneID;
    private String password;

    public GPayStrategy(String phone, String pwd){
        this.phoneID=phone;
        this.password=pwd;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Google Pay.");
    }

}
