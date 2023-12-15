import { useState } from "react"
import '../../../node_modules/bootstrap/dist/js/bootstrap.bundle'
import '../../../node_modules/bootstrap/dist/css/bootstrap.min.css'
function GreetUserForm()
{
    const[nm, setNM] = useState("");
    const[msg, setMsg] = useState("");
    return(
        <div>
            <h1>Login Form</h1>
            <form className="" >
                <label for="name" className="form-label">Enter Username: </label>
                <input type="text" id="name" onChange={(e)=>{setNM(e.target.value)}} className="form-control"></input>
                <br/> 
                <input type="button" value="Login" onClick={()=>{setMsg("Welcome "+nm)}}></input>
            </form>
            <div >{msg}</div>
        </div>
    )
}

const GreetUserForm2 =()=>{
    const[nm,setNm]=useState("");
    const[name,setName]=useState("");
    return(
        <div>
            <form>
                <div>
                    <label className="form-label">Enter Name: </label>
                    <input type="text" value={nm} onChange={(e)=>{setNm(e.target.value)}} className="form-control"/>
                    <label className="form-label">Enter Name: </label>
                    <input type="password" />
                    <input type="button" onClick={()=>{setName("Welcome "+nm)}} value={"click"}/><br/>
                </div>
                <p>{name}</p>
            </form>
        </div>
    )
}

export {GreetUserForm}