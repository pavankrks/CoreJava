//Encapsulation is something which helps to protect the data members and also prevent direct
//access to the user by declaring the members as private

//we can achive this with the help of setters and getters
//these things will provide controlable access
//because,the data members are private

package OOPS.Encapsulation;
class Bank{
    private int amount;
    //this helps to protect the data manipulation
    //prevent direct access
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public void getAmount(){
        System.out.println(amount);
    }
}
public class MyBankAccount {
    public static void main(String[] args) {
        Bank  pavan = new Bank();
        pavan.setAmount(100);
        pavan.getAmount();
    }
}
