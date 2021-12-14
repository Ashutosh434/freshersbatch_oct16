var n1=1;
var n2=1;
document.write("First 100 Fibonacci numbers are:<br>"+n1+"<br>"+n2);
for(i=0;i<98;i++){
    var n3=n1+n2;
    n1=n2;
    n2=n3;
    document.write("<br>"+n3);
}