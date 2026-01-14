
let  str="Dhum Dhadaka";


 let arr=str.split(" ");

   
 arr.reverse();

   let str2=arr.join(" ");

   console.log(str2);
   
//console.log(str.split(""));


let str3="";
for(v=str.length;v>=0;v--)
{
      str3+=str.charAt(v);
    
}
console.log(str3);
