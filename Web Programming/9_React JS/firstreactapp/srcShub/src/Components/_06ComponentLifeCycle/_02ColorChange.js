import React from "react";

export default class ColorChange extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            color : "red"
        }
    }
    getSnapshotBeforeUpdate = (prevP,prevS)=>{
        console.log("before update: "+prevS.color);
        return null;
    }
    componentDidUpdate = (prevP,prevS) => {
        console.log("After update: "+this.state.color);
    }
    render(){
        return(
            <div>
                <p> Fav color : {this.state.color}</p>
                <button onClick={()=>{this.setState({color: "yellow"})}}>Click to change</button>
            </div>
        )
    }
}