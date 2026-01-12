
let str="wElcomE";
// welcOme




 let arr2=str.split("").map(Change);


function Change(v)
{   let str2=new String(v);
    console.log(str2+"--");
    
    if(str2=='e'||  str2=='o')
    {
          return str2.toUpperCase();
    }
    else if( str2=='E' || str2=='A')
    {
        return str2.toLowerCase();
    }
    return str2;
}

console.log(str);


console.log(arr2.join(""));
