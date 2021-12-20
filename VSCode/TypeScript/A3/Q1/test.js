var x = Promise.resolve(5);
var y = Promise.resolve(10);
Promise.all([x, y]).then(function (_a) {
    var x = _a[0], y = _a[1];
    return console.log(x + y);
});
