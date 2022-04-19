// --------- BOILERPLATE -----------------------------------------------------
const _l = msg => console.log('Output ==> [' + msg + ']');
// --------- BOILERPLATE -----------------------------------------------------
_l("hey");
const nums = [1, 2, 3, 4, 5]

//Create a new array from values such that each value = orig value + 2
// use map function

const v = function (x){
    return x+2;
}

//map -> for each value in array, apply the passed fun and push it into a new array
/*
var newArr = [];
var appliedFunc = function(p){
  return p+2;
}
for(var i=0;i<nums.length;i++){
  newArr.push(appliedFunc(nums[i]));
}
*/

const numplus2s = nums.map(v); // creates copy without changing original nums

_l('-------');
_l(numplus2s);
_l('-------');

const names = ['Pooja', 'Prathiksha', 'Renuka', 'Rishikesh'];

function nameLen(name){
    return name.length + 2;
}

//TODO - create new array with (length + 2) from names array
let newNameArray=names.map(nameLen);
console.log(newNameArray);