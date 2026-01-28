
let Student={};



Object.defineProperties(Student,{
    "name":
    {
        value:"demo",
        enumerable:true
    
    },
    "marks":
    {
        value:89.98,
        enumerable:true
    }
})


console.log(Student);


console.log("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

console.log(Object.getOwnPropertyDescriptors(Student));


