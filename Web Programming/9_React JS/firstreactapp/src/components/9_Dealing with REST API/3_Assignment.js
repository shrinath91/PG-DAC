import { useReducer, useState } from "react"
const init = {
    eno : 0,
    ename : "",
    job :"",
    deptno : 0
}
const reducer = function(state,action){
    // console.log(action.val)
    switch(action.type)
    {
        case "update":
                return {...state,[action.fld]:action.val}
        case "reset":
                return init;
    }
}

export default function InserEmp()
{
    const [emp,dispatch] = useReducer(reducer, init);
    const [msg ,setMSG] = useState("");

    const submitData = function(e){
        e.preventDefault();
        // console.log(JSON.stringify(emp));
        const reqOptions = {
            method : "POST",
            headers : {'content-type':"application/json"},
            body : JSON.stringify({
                eno : emp.eno,
                ename : emp.ename,
                job : emp.job,
                dno : emp.deptno
            })    
        }


        fetch("http://localhost:9000/insertemp", reqOptions)
        .then(resp => resp.text())
        .then(data => setMSG(data))
    }


    return(
        <div>
            <form>
                <label for="empid">Enter id: </label>
                <input id="empid" type="number" className="form-input"
                onChange={(e)=>{dispatch({type:"update", fld:"eno", val:e.target.value})}}/> 
                <br/>
                <label for="ename" className="form-label">Enter Name:</label>
                <input id="ename" type="text" className="form-input"
                onChange={(e)=>{dispatch({type:"update", fld:"ename", val:e.target.value})}}/> 
                <br/>
                <label for="job" className="form-label">Enter Job</label>
                <input id="job" type="text" className="form-input"
                onChange={(e)=>{dispatch({type:"update", fld:"job", val:e.target.value})}}/> 
                <br/>
                <label for="deptno" className="form-label">Enter deptno</label>
                <input id="deptno" type="number" className="form-input"
                onChange={(e)=>{dispatch({type:"update", fld:"deptno", val:e.target.value})}}/> 

                 <br/>   
                <input type="submit" value="Insert" 
                onClick={(e)=>{submitData(e)}}/>
                <input type="reset" value="Clear"
                onClick={()=>{dispatch({type:"reset"})}} 
                />
            </form>
            <div id="MSG">{msg}</div>



            
        </div>
    )
}