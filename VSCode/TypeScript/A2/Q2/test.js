function isAmstrong(x) {
    var s = x.toString();
    var sum = 0;
    for (var _i = 0, s_1 = s; _i < s_1.length; _i++) {
        var r = s_1[_i];
        sum += Number(r) * Number(r) * Number(r);
    }
    if (sum == x)
        return true;
    return false;
}
var n = 0;
function getNextAmstrong() {
    for (var i = n; i >= 0; i++) {
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
