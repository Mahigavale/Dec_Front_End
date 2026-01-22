
/**
 *   ...
 * 
 * a)Spread Operator
 */


let arr=[12,43,54];
let arr2=[56,78,98];

let arr3=[...arr,...arr2];
console.log(arr3);





let obj1=
{
    name:"pune",
    population:"72 Lakhs"
}

let Obj2={
    divison:"konkan"
}


let obj3={...arr3,...Obj2}
console.log(obj3);

let arr4=[...obj1];

console.log(arr4);
