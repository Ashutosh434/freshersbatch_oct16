function add(a, b) {
    if (a === void 0) { a = 25; }
    if (b === void 0) { b = 100; }
    return a + b;
}
console.log(add());
console.log(add(100));
console.log(add(450, 250));
function userFriends(username) {
    var friends = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        friends[_i - 1] = arguments[_i];
    }
    console.log("User: " + username);
    console.log("Friends: " + friends);
}
userFriends("Ashutosh", "Aryan", "Tarun", "Siddharth");
function printCapitalNames() {
    var names = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        names[_i] = arguments[_i];
    }
    for (var i in names) {
        console.log(names[i].toUpperCase());
    }
}
var names = ["Ashutosh", "Tarun", "Aryan", "Siddharth"];
printCapitalNames.apply(void 0, names);
