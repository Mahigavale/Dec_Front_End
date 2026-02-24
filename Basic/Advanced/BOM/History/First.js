let count=0;


function goforward()
{  count++;
    history.go(1);
}



function printlength()
{
    console.log(history.length);
    
}


function backward()
{  
    history.back();
}
 function jumplast()
 {
    history.go(history.length-1);
 }


 function home()
 {
    history.go(-(history.length-1));
 }

function alertsound()
{
 
}


