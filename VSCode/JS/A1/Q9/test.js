a1 = ["a", "b", "c"];
a2 = [1, 2, 3, 4, 5];

function fun(a1, a2) {
    var a = []

    // a1 < a2
    if (a1.length < a2.length) {
        for (i = 0; i < a1.length; i++) {
            a.push(a1[i]);
            a.push(a2[i]);
        }
        for (i = a1.length; i < a2.length; i++)
            a.push(a2[i]);
    }
    // a2 < a1
    else if (a2.length < a1.length) {
        for (i = 0; i < a2.length; i++) {
            a.push(a1[i]);
            a.push(a2[i]);
        }
        for (i = a2.length; i < a1.length; i++)
            a.push(a1[i]);
    }
    // a1 = a2
    else {
        for (i = 0; i < a2.length; i++) {
            a.push(a1[i]);
            a.push(a2[i]);
        }
    }
    return a;
}

document.write(fun(a1, a2));