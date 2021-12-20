const order = {
    id: 101,
    title: "SMNWH",
    price: 2500,
    printOrder: function () {
        console.log(this.id, this.title, this.price);
    },
    getPrice: function () {
        return this.price;
    }
};

const obj = Object.assign({}, order);

console.log(order);
console.log(obj);