import { Fragment } from "react";
import {Render} from "./Demo"
import Chemo from "./Demo";
import Counter from "./Components/Counter";


function App() {
  
  let NameS="Kapoor";
 // console.log("Name:",Name);


  // setTimeout(()=>{
  //   window.alert("THis Is the react Page!");
  // },5000)

  // let Obj=
  // {
  //   "City":"Pune",
  //   "Pincode":"123456"
  // }
  
  return(
   <>
  {/* <Chemo name={NameS}></Chemo>
  <Render></Render> */}
  <Counter></Counter>
   </>
  );
  
}

export default App
