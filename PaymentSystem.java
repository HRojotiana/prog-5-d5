public class PaymentSystem {
    protected float balance;

    public PaymentSystem(){
        this.balance = 0;
    }

    public float insert_money(float amount){
        if(amount <= 0) {
            throw new IllegalArgumentException("Please insert a valid amount");
        } else {
            balance += amount;
            return balance;
        }
    }

    public boolean validate_payment(float price) {
        if(price > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        return true;
    }
}
