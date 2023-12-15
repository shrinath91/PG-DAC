import { useState } from "react";
function Wlcm_StateFuncComp()
{
    const[Msg, setMsg] = useState("Welcome");
    return(
        <div>
            <p>{Msg}</p>
            <button onClick={()=>{setMsg("Hello")}}>Change to Hello</button>
        </div>
    )
}
export {Wlcm_StateFuncComp};