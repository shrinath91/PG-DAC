import { useEffect, useState } from "react"

export default function GetRESTAPI(){
    const[data,setData] = useState([]);
    useEffect(()=>{
        fetch("https://jsonplaceholder.typicode.com/users")
        .then((res) => {return res.json()})
        .then((data) => {setData(data)})
    })
    return(
        <div>
            <ul>
                {
                    data.map((v)=>{
                        return <ul>
                                <li key={v}>Id:{v.id}</li> 
                                <li key={v}>Name:{v.name}</li>
                                <li key={v}>UserName:{v.username} </li>
                                <li key={v}>Email:{v.email} </li>
                                <li key={v}>ZipCode:{v.address.zipcode}</li>
                                <li>*************************************************</li>
                            </ul>
                    })
                }
            </ul>
        </div>
    )
}