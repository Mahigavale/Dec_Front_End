
/**
 * 0-17 =>No vote 
 * 18-70=>Vote!
 * 71-90 => Last Vote !
 * 90=> Invalid Age!
 */

var age=18;

if(age >=0  &&  age<18)  //0-17
{
  console.log("No vote!");
  
}
else if( age >=18 && age<=70) //18-70
{
   console.log("Vote!");
   
}
else if(age>=71 &&  age <=90)  //71-90
{
    console.log("LAST VOTE!");
    
}
else      //Rest All the Values.
{
    console.log("Invalid age");
    
}