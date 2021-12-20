var Fibonacci = /** @class */ (function () {
    function Fibonacci() {
        this.prevNo = 0;
        this.currNo = 1;
    }
    Fibonacci.prototype.next = function () {
        var nextNo = this.prevNo + this.currNo;
        this.prevNo = this.currNo;
        this.currNo = nextNo;
        return nextNo;
    };
    return Fibonacci;
}());
var fib = new Fibonacci();
console.log(fib.next());
console.log(fib.next());
console.log(fib.next());
console.log(fib.next());
