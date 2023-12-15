import { useState } from "react";

export default function StateFunIncDec()
{
    const[Count, setCount] = useState("0")
    return(
        <div>
            <p>Count: {Count}</p>
            <button onClick={()=>{setCount(Count+1)}}>Increment</button>
            <button onClick={()=>{setCount(Count-1)}}>Decrement</button>
        </div>
    )
}
