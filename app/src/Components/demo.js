

/**
 *  let[counter,setCounter]=useState("ABC");
 */


   function useState(v)
  {
    
function increase()
{
    return ++v;
}

    return [v, increase];
  }

     let [v,incr]=useState(100);
     console.log("V:",v);
     
      console.log("v",
        incr());
     //console.log("V:",v);
     


  let arr=[10,20,30];
  let[a,b,c]=arr;
  console.log(a);
  console.log(c);
  
  