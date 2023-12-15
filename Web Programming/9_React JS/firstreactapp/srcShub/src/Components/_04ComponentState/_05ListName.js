import { useState } from "react";

export default function AdvNameList(){
    var list1 = ["shubham","saurabh","bhagvat"];
    const[ele,addName] = useState("");
    const[list,updateList] = useState(list1);
    return(
        <div>
            <ul>
                {
                    list.map((v)=>{
                        return <li type={v}>{v}</li>
                    })
                }
            </ul>
            <input type="text" name = "ele" value={ele} onChange={(e)=>{
                addName(e.target.value)
            }}/>
            <button onClick={()=>{
                updateList(list.concat([ele]))
            }}>Add Name</button>
        </div>
    )
}