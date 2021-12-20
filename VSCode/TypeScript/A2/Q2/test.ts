function isAmstrong(x: number) {
    let s = x.toString();
    let sum = 0;
    for (let r of s) {
        sum += Number(r) * Number(r) * Number(r);
    }
    if (sum == x)
        return true;
    return false;
}

var n = 0;

function getNextAmstrong() {
    for (let i = n; i >= 0; i++) {
        if (isAmstrong(i)) {
            n = i + 1;
            return i;
        }
    }
}


console.log(getNextAmstrong());
console.log(getNextAmstrong());
console.log(getNextAmstrong());
console.log(getNextAmstrong());
console.log(getNextAmstrong());
console.log(getNextAmstrong());
