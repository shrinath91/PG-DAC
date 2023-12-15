import { useReducer, useState } from "react"

export default function Registration(){
    const[check,flagCheck] = useState(false);
    const init={
        email : "",
        pass : "",
        gender : "",
        city : ""
    }
    const reducer = (state,action)=>{
        switch(action.type){
            case "update":
                return {...state,[action.fld]:[action.val]}
            case "reset":
                return init;
            default:
                return init;
        }
    }
    const[details,dispatch] = useReducer(reducer,init);
    return(
        <div>
            <form>
                <div>
                    <label className="form-lable">Email:</label>
                    <input type="text" className="form-control" id="email" onChange={(e)=>{dispatch({type:"update",fld:"email",val:e.target.value})}}/>
                </div>
                <div>
                    <label className="form-lable">Password:</label>
                    <input type="password" className="form-control" id="pass" onChange={(e)=>{dispatch({type:"update",fld:"pass",val:e.target.value})}}/>
                </div>
                <div>
                    <label className="form-check-lable">Gender:</label>
                    <input type="radio" className="form-check-input" id="m" name="gen" value="Male" onClick={(e)=>{dispatch({type:"update",fld:"gender",val:e.target.value})}}/>Male
                    <input type="radio" className="form-check-input" id="fe" name="gen" value="Female" onClick={(e)=>{dispatch({type:"update",fld:"gender",val:e.target.value})}}/>Female
                </div>
                <div>
                    <label className="form-check-lable">City:</label>
                    <select name="city" id="city" onChange={(e)=>{dispatch({type:"update",fld:"city",val:e.target.value})}}>
                        <option value={"Pune"} selected>Pune</option>
                        <option value={"Mumbai"}>Mumbai</option>
                        <option value={"Goa"}>Goa</option>
                    </select>
                </div>
                <div>
                    <label className="form-check-lable">Display Info:</label>
                    <input type="checkbox" className="form-check-input" id="check" name="Dis" checked={check} onChange={()=>{flagCheck(!check)}}/>
                </div>
                <div>
                    <input type="button" value={"Submit"} onClick={()=>{
                        if(check){
                            console.log(JSON.stringify(details));
                        }else{
                            console.log("Information Can not be shown here!!!");
                        }
                    }}/>
                </div>
            </form>
        </div>
    )
}