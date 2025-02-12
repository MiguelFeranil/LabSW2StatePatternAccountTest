package LabSW2;
class ClosedState implements AccountState {
    public void deposit(Account account, double amount) {
        System.out.println("You cannot deposit on a closed account! " + account);
    }
    public void withdraw(Account account, double amount) {
        System.out.println("You cannot withdraw on a closed account! " + account);
    }
    public void suspend(Account account) {
        System.out.println("You cannot suspend a closed account!");
    }
    public void activate(Account account) {
        System.out.println("You cannot activate a closed account!");
    }
    public void close(Account account) {
        System.out.println("Account is already closed!");
    }
}