

let counter=0;
 let id=setInterval((a,b)=>{
    console.log(a+b);
    counter++;
    if(counter==5)
    {
        clearTimeout(id);
    }
    
},3000,10,20)

