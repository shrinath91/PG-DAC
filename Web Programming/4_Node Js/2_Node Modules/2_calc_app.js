let calc_mod = require("./2_calc_module");

let num1 = 496;
let num2 = 23;
let num3 = 5;

console.log(num1+"is prime?: "+calc_mod.isPrime(num1));
console.log(num1+"is perfect?: "+calc_mod.isPerfect(num1));
console.log("Factorial of "+num1+calc_mod.calfact(num1));

console.log(num2+"is prime?: "+calc_mod.isPrime(num2));
console.log(num2+"is perfect?: "+calc_mod.isPerfect(num2));
console.log("Factorial of "+num2+calc_mod.calfact(num2));

console.log(num3+"is prime?: "+calc_mod.isPrime(num3));
console.log(num3+"is perfect?: "+calc_mod.isPerfect(num3));
console.log("Factorial of "+num3+": "+calc_mod.calfact(num3));