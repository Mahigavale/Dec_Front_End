
/**
 * Object Destructuring.
 */
let Student={
    name:"abc",
    email:"abc@gmail.com",
    phone:"+9111223344",
    city:"Mumbai",
    divisons:["abc","cde","efg"]
}

let{email,name,phone,city="pune",divisons}=Student;


console.log(phone);
console.log(Student);
console.log(city);



let[a,b,c]=divisons;
console.log(a);



