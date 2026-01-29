

function Yono(z)
{
    let bankbalance=z;
    function Checkbalance()
    {
        console.log("Pinjara");
        
        console.log(bankbalance);
    }
  

     function Deposit(m)
     {
        console.log("deposit");
        
        bankbalance+=m;
        console.log("new Balance :"+bankbalance);
     }

     
     function WithDraw(w)
     {
        if(bankbalance<w)
        {
            console.log("UnBa");   
        }
        bankbalance=bankbalance-w;
        console.log("amount withdrawn :"+w);
        console.log("New Bankbalance :"+bankbalance);
     }
     return [Checkbalance,Deposit,WithDraw];
}
 let [a,b,c]=Yono(1010);

 a();
 b(1);
 c(100);

 