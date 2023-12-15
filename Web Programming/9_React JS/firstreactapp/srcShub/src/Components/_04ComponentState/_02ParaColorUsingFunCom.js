// import { useState } from "react"
// export default function ChangeColor(){
//     const[cl,changeColor] = useState("black")
//     return(
//         <div>
//             <p style={{color:cl}} onClick={()=>changeColor("red")}>Lorem ipsum dolor sit amet consectetur adipisicing elit. Dignissimos, magnam expedita! Sint error vel fugit omnis spiciatis consectetur, non quos, in odio maiores repellat, libero nihil exercitationem eaque deserunt tempora!
//             </p>
//         </div>
//     )
// }

//Using Component Class
import React from "react";
export default class ChangeColor extends React.Component{

    constructor(props){
        super(props);
        this.state = {
            cl : "black"
        }
        this.changeColor = this.changeColor.bind(this);
    }
    changeColor(){
        if(this.state.cl === "red")
            this.setState({cl:"black"});
        else
            this.setState({cl:"red"});
    }
    render(){
        return(
            <div>
                <p style={{color:this.state.cl}} onClick={this.changeColor}>Lorem ipsum dolor sit amet consectetur adipisicing elit. Dignissimos, magnam expedita! Sint error vel fugit omnis spiciatis consectetur, non quos, in odio maiores repellat, libero nihil exercitationem eaque</p>
            </div>
        )
    }
}