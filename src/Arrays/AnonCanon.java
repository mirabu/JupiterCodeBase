package Arrays;

class BankAccount{

    void details(){
        System.out.println("Bank Details");
    }
}



public class AnonCanon {
    public static void main(String[] args) {

        BankAccount bankAccount=new BankAccount(){

            @Override
            void details(){
                System.out.println("Anonymous class details.....");
            }
        };

        bankAccount.details();



    }
}
