let x= Promise.resolve(5);

let y= Promise.resolve(10);

Promise.all([x,y]).then(([x,y])=>console.log(x+y));