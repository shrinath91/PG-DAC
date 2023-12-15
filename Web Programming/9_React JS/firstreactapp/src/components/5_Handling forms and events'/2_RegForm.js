import { useReducer, useState } from 'react'




const init = {
    email : "",
    password:"",
    gender:"",
    city:""

}

const reducer = (state,action)=>{
    switch(action.type)
    {
        case "update":
            
            return{...state,[action.fld]:action.val}
       
    }

}

const RegForm = ()=>{
    const[data,dispatch] = useReducer(reducer, init);
    
    const[flag, setFlag] = useState(false);

    
    const submit1 = (e)=>{
        e.preventDefault();
        if(flag)
        {
            console.log(JSON.stringify(data));
        }
        else
        {
            console.log("Data Cant be shown!!!")
        }
    }

   
    return(
        <div className=''>
            <h1>Registration Form</h1>
            <form>
                <div>
                    <label for="email1" >Enter Email Id: </label>
                    <input type='email'  name='email' value={data.email} id="email1"
                    onChange={(e)=>{dispatch({type:"update", fld:"email",val:e.target.value})}}
                    /><br/>
               </div> 
                <div>
                    <label for="pass" >Enter password: </label>
                    <input type='password' id='pass' value={data.password}
                    onChange={(e)=>{dispatch({type:"update", fld:"password",val:e.target.value})}}
                    /><br/>
                </div>
                <div>
                    <label>Gender:  </label>
                    <input type='radio' name="gender" value="M" className='form-check-input'
                    onChange={(e)=>{dispatch({type:"update", fld:"gender",val:e.target.value})}}
                    />
                    <label for="r1" className='for-check-label'>Male</label>
                    <input type='radio' name="gender" value="F" className='form-check-input'
                    onChange={(e)=>{dispatch({type:"update", fld:"gender",val:e.target.value})}}
                    />
                    <label id="r2" className='form-check-label'>Female</label>
                </div>
                <div>
                    Select City: 
                    

                    <select onChange={(e)=>{dispatch({type:"update", fld:"city",val:e.target.value})}}  value={data.city}>
                    <option value="">Select option</option>
                    <option value="Pun">Pune</option>
                    <option value="Mum">Mumbai</option>
                    <option value="Hyd">Hydrabad</option>

                    </select>
                   </div> 
                <div>
                    Agree: 
                    <input type='checkbox' onChange={()=>{setFlag(!flag)}}></input>
                </div>
                <div>
                    <input type='button' value='Submit' onClick={(e)=>{submit1(e)}}></input>
                </div>
            </form>
            <p>{JSON.stringify(data)}</p>
        </div>
    )
}
export default RegForm;


