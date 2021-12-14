var Rectangle = function (height, width) {
    this.width = width;
    this.height = height;
};

var v1 = new Rectangle(15, 7);

console.log(Rectangle.prototype);

Rectangle.prototype.getArea = function () {
    return this.height * this.width;
};

console.log("Area is " + v1.getArea());

v1.height = 40;

console.log("Area is " + v1.getArea());