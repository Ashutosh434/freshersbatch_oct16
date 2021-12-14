function rev(a){
    r=[]
    for(i=a.length-1;i>=0;i--){
        r.push(a[i]);
    }
    return r;
}

a=[3,5,3,6,3,4]
document.write(rev(a));