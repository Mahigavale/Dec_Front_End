
let arr=[1,3,2,4];


       //1+2=2+1

 function demo (a,b)
 {
    console.log('a',a);
    console.log('b',b);
    
    
     return a=a+b;
 }
 
 console.log(arr.reduceRight(demo));
 
 console.log(arr.toLocaleString());


 