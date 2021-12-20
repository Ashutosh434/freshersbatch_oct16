class Account{
    constructor(public id: any, public name: any, public balance:any){
    }
}

class SavingsAccount extends Account{
    interest= 1000;
    getTotalBalance(){
        return this.balance+this.interest;
    }
}

class CurrentAccount extends Account{
    cashCredit= 200;
    getTotalBalance(){
        return this.balance+this.cashCredit;
    }
}

function totalBalance(...accounts: any){
    let sum=0
    for(let acc of accounts){
        sum+=acc.getTotalBalance();
    }
    return sum;
}

let ashutosh= new SavingsAccount(1, "Ashutosh", 131501);
let tarun= new SavingsAccount(2, "Tarun", 135141);
let aryan= new CurrentAccount(3, "Aryan", 341241);

console.log("Total balance in bank is: "+totalBalance(ashutosh, tarun, aryan));
