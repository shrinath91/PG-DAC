export default function DisEmp(props){
    let Emps = props.Emps;
    let e2 = props.e1;
    return(
        <div>
            <table>
                <tr><td>Name</td><td>Id</td><td>Salary</td></tr>
                {
                    Emps.map((v)=>{
                        return <tr><td>{v.Ename}</td><td>{v.EId}</td><td>{v.ESal}</td></tr>
                    })
                }
                <tr><td>{e2.Ename}</td><td>{e2.EId}</td><td>{e2.ESal}</td></tr>
            </table>
        </div>
    )
}