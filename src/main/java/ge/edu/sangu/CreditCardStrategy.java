package ge.edu.sangu;

public class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;

    public CreditCardStrategy(String nm, String ccNum, String cvv){
        this.name=nm;
        this.cardNumber=ccNum;
        this.cvv=cvv;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount +" paid with credit/debit card");
    }

}