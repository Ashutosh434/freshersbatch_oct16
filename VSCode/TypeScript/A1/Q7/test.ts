const names= ["Ashutosh", "Tarun", "Aryan", "Siddharth"];
let [,,x]= names;
console.log(x);

const org={
    oName: "Team",
    address:{
        city: "Pune",
        pin: 14254
    }
};

let {address: {pin}}= org;
console.log(pin);
