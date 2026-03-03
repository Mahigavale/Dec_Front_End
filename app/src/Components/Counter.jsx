import { useState } from "react";


function Counter()
{

    let[counter,setCounter]=useState(10);

    let [color_s,setColor] =useState("blue");

    function Red()
    {
        setColor("red");
        console.log(color_s);
        
    }

    function Blue()
    {
        setColor("blue")
        console.log(color_s);
        
    }
    function Increase()
    {
        setCounter(counter+1);
    }

    function Decrease()
    {
        setCounter(counter-1);
    }

    function Reset()
    {
        setCounter(10);
    }
    return(<>
    <h1 style={{color:color_s}}> This is the Counter Function !</h1>
    <h2>{counter}</h2>
    <button onClick={Increase}>Increase</button>
    <button onClick={Decrease}>Decrease</button>
    <button onClick={Reset}>Reset</button>
    <button onClick={Red}>Red</button>
    <button onClick={Blue}>Blue</button>
    </>)
}


export default Counter;