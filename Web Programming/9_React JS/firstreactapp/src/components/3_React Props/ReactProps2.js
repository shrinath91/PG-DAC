export default function PropsArrName(props)
{
    let nmArr = props.nameArr;
    return(
        <div>
            <h1>Name of Students</h1>
            <ul>
                {
                    nmArr.map(function(v){
                        return (<li>{v}</li>)
                    })
                }
            </ul>
        </div>
    )
}