export default function ListName(props){
    let NameArray = props.Names;
    console.log(NameArray.toString());
    return(
       <div>
            <ul>
                {
                    NameArray.map((name)=>{
                        return <li key={name}>{name}</li>
                    })
                }
            </ul>
       </div> 
    )
}