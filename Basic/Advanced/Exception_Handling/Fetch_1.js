
      

//  fetch("https://dummyjson.com/todos")
//  .then((v)=>{
//     return v.json();
//  })
//  .then((v)=>{
//     v.todos.map((i)=>{
//         console.log("TODO:"+i.todo+":::"+i.userId);
        
//     });
    
 //})




   async function getdata(v)
   { 
     let result=  await fetch(v);
    let real= await result.json();
    console.log(real.todos);
   }

   getdata("https://dummyjson.com/todos");