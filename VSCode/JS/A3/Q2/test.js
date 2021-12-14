var Rectangle= function(height, width){
    this.width=width;
    this.height=height;
};

var r1= new Rectangle(11, 12);

console.log(Rectangle.prototype);

Rectangle.prototype.getArea=function(){
    return this.height*this.width;
};

console.log("Area is "+r1.getArea());