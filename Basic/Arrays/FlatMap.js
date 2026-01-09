
let arr=[[20,30],[30,[40,[67,[90,80,[11,33,56]],78],60],40]];


//flat => depth =>1
  let arr2=arr.flat(Infinity);
  
  
  
  function multi(v)
  {
    return v*2;
  }
  
  let arr3=arr2.map(multi);

  console.log(arr3);
  
  console.log(arr);
  


// function dem(v)

//     {
//         return v*2;
//     }
// /**
//  * [40,60,60,80]
//  */
//       console.log(arr.map(dem));
      