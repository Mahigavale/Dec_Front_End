
/**
 * 144 =>Summation
 * //5
 * 2+3+5+7+11+13+17+19+23+29
 * 
 */

var sum=0;

var count=0;

for(v=2;v<5000;v++)
{
    if(count==144)
    {
        break;
    }
    else{
  if(v==2)
  {
    sum=sum+v;
    count++;
  }
  else
  {
    var flag=false;
    for(j=2;j<v;j++)
    {
        if(v%j==0)
        {
       flag=true;
        }
      
    }
    if(!flag)
    {
        count++;
        sum=sum+v;
    }
  }
}
}

console.log("Sum:"+sum);



