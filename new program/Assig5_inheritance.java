//Create a class called "BankAccount" that has a balance field and a method to deposit money into the account.
//Create two child classes "CheckingAccount" and "SavingsAccount" that inherit from it.

class BankAccount{

void New_Account(){

System.out.println("New account open");

}
}
class CheckingAccount extends BankAccount{

void Check_Account(){

System.out.println("Checking the balance");

}
}
class SavingAccount extends CheckingAccount{

void Save_Account(){

System.out.println("My account is save");

}
}
class Assig5_inheritance{

public static void main(String []args){

SavingAccount SA=new SavingAccount();

SA.New_Account();
SA.Check_Account();
SA.Save_Account();

}
}
