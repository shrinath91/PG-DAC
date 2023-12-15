function BulletList(){
    let name = ["Shrinath","Daulat","Suraj","Shubham","Omkar","Rahul","Mansi"];
    return(
        <div>
            <ul>
                {
                    name.map(function(v){
                        return <li key={v}>{v}</li>                        
                    })
                }
            </ul>
        </div>
    )
}

function Table(){
    let num = 6;
    let res = [];
    for(let i=1; i<=10; i++)
    {
        res.push(num*i);
    }

    return(
        <div>
            <table border='1' >
            {
                res.map((v,i)=>{
                    return(<tr>
                        <td>{num}*{i+1}</td>
                        <td>{v}</td>
                    </tr>)
                })
            }
            </table>
        </div>
    )
}

export { BulletList, Table};