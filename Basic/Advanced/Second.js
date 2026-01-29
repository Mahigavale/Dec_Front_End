

function Demo(v)
{
    function Demo2(k)
    {
       console.log(v+k);     
    }
    return Demo2;
}
 let m=Demo(5);
 m(10);