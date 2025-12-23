
/**
 * 
 * Money=>
 * 0-149=>working class. 
 * 150-250 middle class.
 * 251-500 =>rich
 * 501=>1000 =>HNI
 * >1000=>UHNI
 */
let money=1543;

if(money>=0 && money <150)  //0-149
{
   console.log("working class.");
   
}
else if(money >=150 && money <251) //150-250 
{
    console.log("Middle class.");
    
}
else if(money >=251 && money<501) //251-500
{
    console.log("rich");
    
}
else if(money>=501 && money<1001) //501-1000
{
    console.log("HNI");
    
}
else  if(money >=1001) //1001=>Infinity
{
    console.log("UHNI");
    
}
else   //negative
{
    console.log("Loan");
    
}