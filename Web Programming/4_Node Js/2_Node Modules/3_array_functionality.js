let mod = require("./3_arrFunc_module");

let arr = [2,3,4,5,6,7,8,9,10];
let primeArr = mod.filterPrime(arr);
console.log("Prime Number Array: "+primeArr.toString());

let strArr = ["Daulat","Rattan","Hari","Prasad","Ranchoddas"];
let str = mod.longString(strArr);
console.log("Longest String: "+str);

let date = mod.showDate();
console.log(date);