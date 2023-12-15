import { useState } from "react"

export default function LocalStoragePractise(){
    const[name,setName] = useState("");
    
    return(
        <div>
            <input type="text" onChange={(e)=>{
                setName(e.target.value);
            }}/>
            {
                localStorage.setItem("name",name)
            }
        </div>
    )
}