// import { useState } from "react";

export default function AddArray()
{
    let arr = ["Shri", "Daulat", "Tokas"]
    // const[]
    return(
        <div>
            <ul>
                {
                    arr.map(function(v){
                        return (<li> {v} </li>)
                    })
                }
            </ul>
        </div>
    )
}