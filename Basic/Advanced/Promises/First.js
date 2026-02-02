
/**
 * 1
 * 2
 * 3
 *
 */


  

// const Prom=new Promise();




// function combine(Resolve,Reject)
// {
     //executor.
// }

// function Resolve(v)
// {
//     if(v>10)
//     {
//         return true;

//     }

// }

// function Reject(v)
// {
//     if(v<10)
//     {
//         return false;
//     }
// }
// // console.log(Resolve(11));
// // console.log(Reject(9));



const Prom=new Promise((Resolve,Reject)=>{
    let v=10;
   setTimeout(()=>{
     if(v>50)
    {
        //True
        return Resolve("Promise resloved :"+v)
    }
    else
    {
        //False
        return Reject("small value")
    }
   },6000)
})





Prom.then((v)=>{
    console.log(v);
    
}).catch((e)=>{
    console.log(e);
    
})

console.log(Prom);



setTimeout(()=>{
    console.log(Prom);
    
},8000)