
/**
 *   IIFE=> immediately invoked function expression.
 */


(function ()
{
    console.log("hii , a function...");
    (function ()
    {
        console.log("inner IFFE");
        
    })();
   
    
})();

console.log("are re!");

