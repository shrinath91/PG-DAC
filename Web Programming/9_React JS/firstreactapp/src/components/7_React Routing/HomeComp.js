import {  useNavigate } from "react-router-dom"

export default function HomeComp() {

    let navigate = useNavigate()
    localStorage.setItem("msg","Welcome to storage objects")

    return (
        <div>
            <h1> This is Application home  </h1>
            <p> Register if not already </p>

            <button onClick={()=>{navigate('/styling') }}>
                Move to Dynamaic Style Comp
            </button>
            
        </div>
    )
}