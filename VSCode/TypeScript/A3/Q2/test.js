var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Account = /** @class */ (function () {
    function Account(id, name, balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    return Account;
}());
var SavingsAccount = /** @class */ (function (_super) {
    __extends(SavingsAccount, _super);
    function SavingsAccount() {
        var _this = _super !== null && _super.apply(this, arguments) || this;
        _this.interest = 1000;
        return _this;
    }
    SavingsAccount.prototype.getTotalBalance = function () {
        return this.balance + this.interest;
    };
    return SavingsAccount;
}(Account));
var CurrentAccount = /** @class */ (function (_super) {
    __extends(CurrentAccount, _super);
    function CurrentAccount() {
        var _this = _super !== null && _super.apply(this, arguments) || this;
        _this.cashCredit = 200;
        return _this;
    }
    CurrentAccount.prototype.getTotalBalance = function () {
        return this.balance + this.cashCredit;
    };
    return CurrentAccount;
}(Account));
function totalBalance() {
    var accounts = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        accounts[_i] = arguments[_i];
    }
    var sum = 0;
    for (var _a = 0, accounts_1 = accounts; _a < accounts_1.length; _a++) {
        var acc = accounts_1[_a];
        sum += acc.getTotalBalance();
    }
    return sum;
}
var ashutosh = new SavingsAccount(1, "Ashutosh", 131501);
var tarun = new SavingsAccount(2, "Tarun", 135141);
var aryan = new CurrentAccount(3, "Aryan", 341241);
console.log("Total balance in bank is: " + totalBalance(ashutosh, tarun, aryan));
