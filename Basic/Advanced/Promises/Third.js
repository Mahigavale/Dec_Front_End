

let Prom=Promise.reject("value  not fullfilled");


Prom.catch((e)=>{
    console.log(e);
    
})
