const convert= (names: any) => {
    let objs=[]
    for(let x in names){
        console.log(x);
        objs.push({name: names[x], length: names[x].length})
    }
    return objs;
};

let names= ['Tom', 'Ivan', 'Jerry'];
console.log(convert(names));