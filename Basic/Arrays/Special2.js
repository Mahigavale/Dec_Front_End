
let arr=[13,45,22,33,11,44];



  function checkvalue(v)
  {
    return  v>15;
  }

  console.log(arr.every(checkvalue));
  console.log(arr.some(checkvalue));
  
  