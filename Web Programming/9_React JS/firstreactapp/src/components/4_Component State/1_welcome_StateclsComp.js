import React from "react";
class Wlcm_StateClassComp extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state = {msg:"welcome"};
        this.changeMsg = this.changeMsg.bind(this);
    }
    changeMsg(){
        this.setState({msg:"Hello1"});
    }
    render(){
        return(
            <div>
                <p>{this.state.msg}</p>
                <button onClick={this.changeMsg}>Change MSG to Hello</button>
            </div>
        )
    }
}


export {Wlcm_StateClassComp};