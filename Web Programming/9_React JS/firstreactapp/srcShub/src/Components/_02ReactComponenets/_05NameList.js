import React from "react";

class NameList extends React.Component{
    render(){
        var Names = ["Shubham","Shesherao","kale","Suraj","Abhale"]
        return(
            <div>
                <h1>--------------NameList---------------</h1>
                <ul>
                    {
                        Names.map(function(nm){
                            return <li type={nm}>{nm}</li>
                        })
                    }
                </ul>
            </div>
        )
    }
}
export default NameList;