


setTimeout(()=>{
    
let count=1;

while(count<100)
{
    console.log("hiiii");
    count++;
    
}
},4000)





 async function Greet()
{
     
    let result=await fetch("http://localhost:8080/get-all");
  let data= await result.json();
  console.log(data);

  let obj={...data[0]}

  console.log("Obj:",obj);
  
  
  window.alert(obj.orderPrice);
  
    

  // let data=await  result.json();


 //  console.log("data:"+data);
   

}




 async function AddData()
{
    let data={
    "orderPrice":88888888,
    "orderType":"Sports RCB RCb"
};



  let res= await fetch("http://localhost:8080/add",{
    method:"POST",
    headers:{"Content-Type":"application/json"},
    body: JSON.stringify(data)
   })

res.json().then((v)=>{
    console.log(v);
    
})
    
}
