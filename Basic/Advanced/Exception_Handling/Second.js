
let arr=["abcd","xyza","ijkl"];



let Prom=new Promise((Res,Rej)=>{

    setTimeout(()=>{
        if(arr.includes("abcde"))
        {
            return Res("Correct values.....!");
        }
        else{
            return Rej("NO Proper Value......")
        }
    },5000);

})

Prom.then((v)=>{
    console.log("v",v);
    
}).catch((e)=>{
    console.log("Rejection:",e);
    
})



 async function handlere()
 {
    try{
     let result= await  Prom;
     console.log("result:from ASYNC AWAIT:",result);
    }
     catch(e)
     {
        console.log("From Fucntion:",e);
        
     }
     
 }
 handlere();
 function disp()
 {
    console.log(Prom,"Khalcha function");
    
 }
disp(); 