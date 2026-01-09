
let arr=[1,2,[4,5],6];


     console.log(
      arr.flat(1).map(multi));
  

      function multi(i)
      {
        return i*2;
      }