import React from "react";
class DateTime extends  React.Component
{
    render(){
        let name = "Shri...";
        let month = ["jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec",]
        let cdate = new Date();
        return(
            <div>
                <h1>Hello {name}</h1>
                <p>Date:{cdate.getDate()+"/"+month[cdate.getMonth()]+"/"+cdate.getFullYear()+" Time: "+cdate.getHours()+":"+cdate.getMinutes()}</p>
            </div>
        )
    }
}
export default DateTime;    