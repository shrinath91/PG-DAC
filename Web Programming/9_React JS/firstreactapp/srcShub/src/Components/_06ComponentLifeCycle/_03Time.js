import { useEffect, useState } from "react";

export default function Time(){
    const[time,setTime] = useState(new Date());
    useEffect(()=>{
        console.log("mounted");
        setInterval(()=>{
            const timer = setTime(new Date());
            //unmount
            return ()=>{
                console.log("unmounted")
                clearInterval(timer)
            };
        },1000)
    },[])
    useEffect(()=>{
        console.log("updated");
    })
    return(
        <div>
            <h1>Time:{time.getHours()}:{time.getMinutes()}:{time.getSeconds()}</h1>
        </div>
    )
}