



let pins={
    "Mumbai":13243,
    Delhi:787878,
    "JaiPur":"kdkednkek",
    "demo":['a','b','c','d'],
    Greet:function ()
{
    console.log("hello, Human !");
    
}
};





/**
 * First way of accessing the Properties.
 * Where you use the . Operator
 */
console.log(pins.Delhi);
/**
 * Where you use the name of the Property as
 * it is in the form of String.
 */

console.log(pins['Delhi']);

console.log(pins.demo);

pins.Greet();