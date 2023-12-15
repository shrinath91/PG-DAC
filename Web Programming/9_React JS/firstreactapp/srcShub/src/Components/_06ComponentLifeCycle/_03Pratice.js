import { useEffect, useState } from "react";

export default function Timer1(){
    
    const[time,setTime] = useState(new Date());
    useEffect(()=>{
        const t1 = setInterval(()=>{
            setTime(new Date());
        },1000)
        return ()=> {clearInterval(t1)}
    },[])
    return(
        <div>
            {/* <h1>Time: {time.getSeconds()}</h1> */}
            <h1>{time.getSeconds()}</h1>
        </div>
    )
}