// import React from "react";

// export default class HelloMessage extends React.Component{
//     constructor(props){
//         super(props);
//         this.state =  {
//             name : "WellCome"
//         }
//     }
//     render(){
//         return(
//             <div>
//                 <p>{this.state.name}</p>
//                 {/*Since we have used the arrow function no need to bind state if we had used the regular function then we must need to bind the state
//                     Syntax for that is this.funName = this.funName.bind(this);
//                     for anonimous function search
//                 */}
//                 <button onClick={()=>{
//                     if(this.state.name === "Hello"){
//                         this.setState({name:"Wellcome"});
//                     }else{
//                         this.setState({name:"Hello"});
//                     }   
//                 }}>Change Message</button>
//             </div>
//         )
//     }
// }


//By Function
import { useState } from "react";
export default function HelloMessage(){
    const[msg,changeMessage] = useState("Wellcome");
    return(
        <div>
            <h1>{msg}</h1>
            <button onClick={function(){
                if(msg === "Wellcome"){
                    changeMessage("Hello");
                }else{
                    changeMessage("Wellcome");
                }
            }}>Change Message</button>
        </div>
    )
}