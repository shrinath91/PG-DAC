import { useState } from "react";

export default function ParaColorChange()
{
    const[color, setColor] = useState("red");
    return(
        <div>
            <p style={{color}} onClick={()=>{setColor("Blue")}}>Hello, My Name is Shrinath Garad. </p>

        </div>
    )
}