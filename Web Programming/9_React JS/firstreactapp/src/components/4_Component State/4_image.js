import { useState } from "react";
export default function ImgHideUnhide()
{
    const[flag, setFlag] = useState("true")
    return(
        <div>
            <img src="https://cdn.pixabay.com/photo/2023/08/28/20/36/gerbera-8220025_640.jpg" alt="flower Image"></img>
        </div>
    )

}






















// import { useState } from "react";

// export default function ImageToggle(){
//     const[flag,changeFlag] = useState(true);
//     return(
//         <div>
//             <img src="https://cdn.pixabay.com/photo/2023/08/28/20/36/gerbera-8220025_640.jpg" 
//             alt="img" style={{display:flag?"block":"none"}}></img>
//             <input type="checkbox" checked={flag} onClick={()=>{changeFlag(!flag)}}/>Toggle Image
//         </div>
//     )
// }