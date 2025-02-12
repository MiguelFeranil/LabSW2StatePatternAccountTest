package LabSW2;
// Concrete State: ActiveState
class ActiveState implements AccountState {
    public void deposit(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposit successful. " + account);
    }
    public void withdraw(Account account, double amount) {
        account.setBalance(account.getBalance() - amount);
        System.out.println("Withdrawal successful. " + account);
    }
    public void suspend(Account account) {
        account.setState(new SuspendedState());
        System.out.println("Account is suspended!");
    }
    public void activate(Account account) {
        System.out.println("Account is already activated!");
    }
    public void close(Account account) {
        account.setState(new ClosedState());
        System.out.println("Account is closed!");
    }
}