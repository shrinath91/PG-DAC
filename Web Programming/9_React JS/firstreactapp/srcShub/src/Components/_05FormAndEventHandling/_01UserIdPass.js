import { useState } from "react"

export default function Login(){
    const[name1,setName] = useState("");
    const[Greeting,setGreeting] = useState("");
    return(
        <div>
            <form>
                <div>
                Enter userId: <input type="text" className="form-control" onChange={(e)=>{setName(e.target.value)}}/>
                </div>
                <div>
                Enter PassWord: <input type="text" className="form-control"/>
                </div>
                <div>
                    <input type="button" value={"Login"} onClick={()=>{setGreeting("Wellcome " + name1)}}/>
                </div>
            </form>
            <div>
                <h1>{Greeting}</h1>
            </div>
        </div>
    )
}