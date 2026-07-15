import java.util.*;
class Bank {
    long[] accounts;
    int capacity;

    public Bank(long[] balance) {
        capacity = balance.length;
        accounts = Arrays.copyOf(balance, capacity);
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if(account1<1 || account1>this.capacity || account2<1 || account2>this.capacity) return false;
        if(withdraw(account1, money) && deposit(account2, money)) return true;
        return false;
    }
    
    public boolean deposit(int account, long money) {
        if(account<1 || account>this.capacity) return false;
        accounts[account-1] += money;
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if(account<1 || account>this.capacity) return false;
        if(accounts[account-1] - money < 0) return false;
        accounts[account-1] -= money;
        return true;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */