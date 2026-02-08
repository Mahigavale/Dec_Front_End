/**
 * 
 * try=>Critical {}
 * catch=> Catch {}
 * finally=> {}
 */


let num=10;

try{
     if(num<20)
     {
        throw new Error("Invalid value");
     }
     console.log(num*5);    
}
catch(e)
{
    console.log("this is the error:",e);
    

}
finally
{


    console.log("welcome");
    
}