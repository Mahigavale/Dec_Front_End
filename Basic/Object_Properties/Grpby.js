

let arr=[13,14,18,20,21,23];


function check(i)
{
    if( i%2==0)
    {
        return "even";
    }
    return "odd";
}

console.log( Object.groupBy(arr,check).even);

