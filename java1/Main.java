abstract class Bank {
    public abstract int getBalance();
}

class BankA extends Bank {
    public int getBalance() {
        return 100;
    }
}

class BankB extends Bank {

    @Override
    public int getBalance() {
        return 150;
    }
}

class BankC extends Bank {
    public int getBalance() {
        return 200;
    }
}
class Main {
    public static void main(String s[]) {
        Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();
        System.out.println("Balance in BankA: $" + bankA.getBalance());
        System.out.println("Balance in BankB: $" + bankB.getBalance());
        System.out.println("Balance in BankC: $" + bankC.getBalance());
    }
}