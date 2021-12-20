function add(a=25, b=100){
    return a+b;
}

console.log(add());
console.log(add(100));
console.log(add(450,250));

function userFriends(username: any, ...friends: any){
    console.log("User: "+username);
    console.log("Friends: "+friends);
}

userFriends("Ashutosh", "Aryan", "Tarun", "Siddharth");

function printCapitalNames(...names: any){
    for(let i in names){
        console.log(names[i].toUpperCase());
    }
}

const names= ["Ashutosh", "Tarun", "Aryan", "Siddharth"];
printCapitalNames(...names);