


//Screen Object.

function alertwidth()
{
    console.log("Screen:");
    
    console.log(screen.width);
    console.log(screen.colorDepth);
    console.log(screen.availWidth);
    console.log(screen.height);
    console.log(screen.availHeight);
    
    
    console.log("Location:");
    console.log(location.hostname);
    
    

    
    
}


function Reload()
{
    location.reload();
    
}



function ASSIGN()
{
   // location.assign("https://www.google.com");

  //  location.replace("https://www.google.com");
}





function NavigatorDemos()
{
   navigator.clipboard.readText().then((v)=>{
    console.log(v);
   }).catch((e)=>{
    console.log(e);
    
   })
   
if(navigator.onLine)
{
    alert("You are online...");
}

else{
    alert("connect to internet...");
}
}



function TrackLOcation()
{
     navigator.geolocation.getCurrentPosition((p)=>{
        console.log(p.coords.latitude);
        console.log(p.coords.longitude);
        console.log(p.coords.heading);
        console.log(p.coords.speed);
        console.log(p.timestamp.toLocaleString());
        
        



        
     },(e)=>{
        alert("user denied the permission.....");
     })
}




function TrackLocation()
{
    let id= navigator.geolocation.watchPosition((v)=>{
        console.log(v.coords.altitude);ṭ
        console.log(v.coords.longitude);
        console.log(v.coords.latitude);
        console.log(v.coords.heading);
        
        console.log(id);
        
        navigator.geolocation.clearWatch(id);        
    },(e)=>{});
}