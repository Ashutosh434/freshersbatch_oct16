var convert = function (names) {
    var objs = [];
    for (var x in names) {
        console.log(x);
        objs.push({ name: names[x], length: names[x].length });
    }
    return objs;
};
var names = ['Tom', 'Ivan', 'Jerry'];
console.log(convert(names));
