
let Obj5={
    "name":"Smita Patil",
    "age":32,
    'state':"maharashtra"
}

/**
 * Enumnerbale : Hiding
 */

Object.defineProperty(Obj5,"City",{
   value:"Mumbai",
   enumerable:true,
   configurable:true,
   writable:true
})

// for(v in Obj5)
// {
//     console.log(v);
    
// }


// console.log(Obj5);
// //console.log(Obj5.City);


// console.log(Obj5);


// delete Obj5.City;

console.log(Obj5);
 Obj5.City="Latur";
console.log(Obj5);





console.log(Object.getOwnPropertyDescriptor(Obj5,"City"));
