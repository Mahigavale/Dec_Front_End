import { Car } from "./File";
import Remo from "./Remo";
function Chemo(name)
{

    //console.log(" Inside ::Chemo:"+name.name);
    
    return(

     <>
        <h2>This is the Chemo  :::{name.name}</h2>
        <h1>This is the Demo function of the React!</h1>
        <h1> I have remo </h1>
        <Remo name={name} ></Remo>
        </>
    )
}
function Render()
{
    return (
        <>
        <h1>This is another function!</h1>
        <Car></Car>
        </>
    );
}


export { Render};
export default Chemo;

