export default function PropEmp(props)
{
    // const emps = [{eid:101, ename:'Hariya', sal:20000},{eid:101, ename:'Hariya', sal:20000},{eid:101, ename:'Hariya', sal:20000}]
    const femps = props.emps
    return(

        <div>
            <h1>Employee Details</h1>
            <table border="1">
            <tr>
                <td>Emp ID</td>
                <td>Name</td>
                <td>Salary</td>
            </tr>
                {
                    femps.map((v)=>{
                        return(<tr>
                            <td>{v.eid}</td>
                            <td>{v.ename}</td>
                            <td>{v.sal}</td>
                        </tr> )
                    })
                }
            </table>
        </div>
    )
}