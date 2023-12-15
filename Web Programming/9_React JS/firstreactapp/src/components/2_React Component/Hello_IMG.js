import pic from "../timon.jpg"
let w = 200;
function HelloImg(){
    return(
        <div className="hello-image">
            <img src={pic} width={w} height='200'></img>
            <h1>Hello Image!!!</h1>
        </div>
    )
}
export default HelloImg;