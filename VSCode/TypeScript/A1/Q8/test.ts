class Account {
    constructor(id, name, balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
}

class SavingsAccount extends Account {
    interest = 500;
    getTotalBalance() {
        return this.balance + this.interest;
    }
}

class CurrentAccount extends Account {
    cashCredit = 800;
    getTotalBalance() {
        return this.balance + this.cashCredit;
    }
}

function totalBalance(...accounts: any) {
    let sum = 0
    for (let acc of accounts) {
        sum += acc.getTotalBalance();
    }
    return sum;
}

let ashutosh = new SavingsAccount(101, "Ashutosh", 10000);
let tarun = new SavingsAccount(102, "Tarun", 25000);
let aryan = new CurrentAccount(103, "Aryan", 52000);

console.log("Total balance in bank is: " + totalBalance(ashutosh, tarun, aryan));
