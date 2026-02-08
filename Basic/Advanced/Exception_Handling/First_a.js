
let num=12;

 const Prom=new Promise(((Res, Rej)=>{

    setTimeout(()=>{

        if(num===12)
        {
            return Res("correct value")
        }
        return Rej("Incorrect value")
    },5000)
 }))

//  Prom.then((v)=>{
//     console.log(v);
    
//  }).catch((e)=>{
//     console.log(e);
    
//  })


      async function  promisehandler()
     {

        console.log("Inside promise handler......");
        
        try{
            let result=await  Prom;


            console.log(result);
        }
        catch(e)
        {
            console.log("EEEEE:",e);
            
        }
            
     }

     promisehandler();