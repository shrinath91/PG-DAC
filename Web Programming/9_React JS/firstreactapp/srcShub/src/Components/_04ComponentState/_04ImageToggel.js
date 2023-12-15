// import { useState } from "react";

// export default function ImageToggle(){
//     const[flag,changeFlag] = useState(true);
//     return(
//         <div>
//             <img src="https://cdn.pixabay.com/photo/2023/08/28/20/36/gerbera-8220025_640.jpg" alt="img" style={{display:flag?"block":"none"}}></img>
//             <input type="checkbox" checked={flag} onClick={()=>{changeFlag(!flag)}}/>ToggelImageUsingFunctionalComponent
//         </div>
//     )
// }

//using Class Component
import React from "react";
export default class ImageToggle extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            flag : true
        }
    }
    render(){
        return(
            <div>
                <img src="https://cdn.pixabay.com/photo/2023/11/30/07/51/bridge-8420945_640.jpg" alt="img" style={{display: this.state.flag?"Block":"none"}}></img>
                <input type="checkbox" checked={this.state.flag} onChange={()=>{this.setState({flag : !this.state.flag})}}/>ToggelImageUsingClassComponent
            </div>
        )
    }
}