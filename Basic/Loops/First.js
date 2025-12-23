
/**
 * For()
 * While()
 * Do while()
 */

/**
 * Do the same thing, again and again based on the specific Condition on number.
 * 
 * number >value => true
 *  number >< value=> false =>break.
 * 
 */

 
// for(var num=1;num<=11;num+=2)
// {
// console.log(num);

// }
// console.log("Outside");



/**
 *  1-100 => even =>
 *  51-60
 */
// for(let v=1;v<=100;v+=1)
// {
//  if(v%3==0 && v%7==0 && v%9==0 &&  v%2==0)
//     {
//         console.log(v);  
//     }   
// }
//1-1789 => 13. =>2


for(var v=1;v<=500;v+=1)
{
    if(v%13==0)
    {
        if(v%2==0){
       
            if(v<100)
            {
                console.log(v);
                
            }
        }
    }
}