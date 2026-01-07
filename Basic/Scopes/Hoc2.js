


function one(a=10,b=2,c=10)
{
    return a*b*c;
}


function  two(v)
{
    return v()+10;
}

console.log(two(one));
