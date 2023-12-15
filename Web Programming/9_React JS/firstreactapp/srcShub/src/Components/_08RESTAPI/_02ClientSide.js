import { useEffect, useState } from "react"

export default function GetEmpDetails(){
    const[emps,setEmps] = useState([]);
    useEffect(()=>{
        fetch("http://localhost:9000/getEmps")
        .then((res)=>{return res.json()})
        .then((data)=>{setEmps(data)});
    })
    return(
        <div>
            <table className="table table-bordered ">
            <tr><td>EMPNO</td><td>ENAME</td><td>JOB</td><td>SAL</td></tr>
                {
                    emps.map((v)=>{
                        return <tr>
                            <td>{v.EMPNO}</td>
                            <td>{v.ENAME}</td>
                            <td>{v.JOB}</td>
                            <td>{v.SAL}</td>
                        </tr>
                    })
                }
            </table>
        </div>
    )
}