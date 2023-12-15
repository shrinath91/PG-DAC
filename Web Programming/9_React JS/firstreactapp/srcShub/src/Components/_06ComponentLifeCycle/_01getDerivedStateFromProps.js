import React from "react";

export default class Greeting extends React.Component{
    constructor(props){
        super(props);
        this.state={
            msg : ""
        }
    }
    static getDerivedStateFromProps(){
        return {msg:"Hello Master"}
    }
    render(){
        return(
            <div>
                <h1>{this.state.msg}</h1>
            </div>
        )
    }
}