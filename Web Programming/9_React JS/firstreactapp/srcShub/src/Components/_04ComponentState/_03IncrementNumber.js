// import {useState} from 'react';

// export default function IncreDecre(){
//    const[num,setNum] = useState(0);
//    return(
//     <div>
//         <h1>Number: {num}</h1>
//         <button onClick={()=>setNum(num+1)}>Increment</button>
//         <button onClick={()=>setNum(num-1)}>Decrement</button>
//     </div>
//    )
// }

//using Component class
import React from "react";

export default class IncreDecre extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            num : 0
        }
        // this.incrementNumber = this.incrementNumber.bind(this)
        // this.incrementNumber = this.decrementNumber.bind(this)
    }
    //Regular Function
    // incrementNumber(){
    //     this.setState({num : num+1});
    // }
    // decrementNumber(){
    //     this.setState({num:num-1});
    // }

    render(){
        return(
            <div>
                <h1>Num: {this.state.num}</h1>
                <button onClick={()=>{this.setState({num : this.state.num+1})}}>Increment</button>
                <button onClick={()=>{this.setState({num : this.state.num-1})}}>Decrement</button>
            </div>
        )
    }
}