
let arr=[13,11,13,17,14,54,57];


// =>even => e%2==0 => add
    
function Check(v)
{
   if( v%2==0)
   {

    return v;
   }

}
    
console.log(arr.filter(Check));

console.log(arr.map(Check));
console.log(arr.filter(Check));


function multiply(v)
{
    return v*2;
}



console.log(arr.map(multiply));
