var average = 0;
function getAverage(a, b) {
    average = (a + b) / 2;  // local variabe
    console.log(average);
    return average;

}
var myResult = getAverage(6, 5);  // global variable



function logResult(){
    console.log("the average is " + myResult + " it is inside the function");
}
logResult();
