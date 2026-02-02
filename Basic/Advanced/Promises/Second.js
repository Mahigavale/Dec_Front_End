
/**
 * let number="123213443";
 * length=10=>resolve
 * reject
 */

let num="34567520";

const Prom=new Promise((Res,Rej)=>{

    setTimeout(()=>{

        if(num.length===10)
        {
            return Res("valid number")
        }
        else{
            return Rej("inmvalid number...")
        }
    },9000)
    
})



function Printre(V)
{
    console.log(V);
    
}

Prom.then(Printre).catch(Printre);



setTimeout(()=>{
    console.log(Prom);
    
},15000)