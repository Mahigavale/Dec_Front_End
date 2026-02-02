
/**
 * Promise.all();
   Promise.allSettled();
   Promise.any();
   Promise.race();
 */


   let Prom1=Promise.reject("Pass");

   let Prom2=Promise.resolve("second pass");

   let Prom3=Promise.reject("error");

   Promise.allSettled([Prom1,Prom2,Prom3])
   .then((v)=>{
    console.log(v);
    console.log("*");
    
   }).catch((e)=>{
    console.log(e);
    console.log("8");
    
    
   })