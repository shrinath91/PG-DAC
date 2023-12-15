import { useState, useReducer, useEffect } from "react"

//info - about one emp, initial state
const init = {
    empid: 0,
    ename:"",
    salary:0,
    dept:""
}

const reducer = (state,action) => {
    switch(action.type)
    {
        case 'update':
            //partial updation
            //get the current state and modify only the mentioned field
            return {...state,[action.fld]:action.val}
        case 'reset':
            return init;
    }
}

export default function EmpForm() {
 
    const[emp, dispatch] = useReducer(reducer,init);
    const[msg,setMsg] = useState("xx")

    useEffect(()=>{
        setMsg(localStorage.getItem("msg"))
    },[]);

    const submitData = (e) => {
        //default behavior submit - cancelling
        e.preventDefault();
        console.log(JSON.stringify(emp));
    }

    return (
        <div>
            <h1> {msg} </h1>
            <h1> Emp Form </h1>
            <form>
                Empid : <input type="number" name="empid" 
                value={emp.empid}
                onChange={(e)=>{dispatch({type:'update',fld:"empid",val:e.target.value})}} />
                <br/>

                Ename : <input type="text" name="ename" 
                value={emp.ename}
                onChange={(e)=>{dispatch({type:'update',fld:"ename",val:e.target.value})}} />
                <br/>

                Salary : <input type="number" name="salary" 
                value={emp.salary}
                onChange={(e)=>{dispatch({type:'update',fld:"salary",val:e.target.value})}} />
                <br/>

                Dept : <input type="text" name="dept" 
                value={emp.dept}
                onChange={(e)=>{dispatch({type:'update',fld:"dept",val:e.target.value})}} />
                <br/>
                <input type="submit" value="Insert" 
                onClick={(e)=>{submitData(e)}} />
                <input type="reset" value="Clear" 
                onClick={()=>{dispatch({type:"reset"})}}/>
            </form>
            <p> {JSON.stringify(emp)} </p>
        </div>
    )
}