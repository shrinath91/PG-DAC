import logo from "./logo.svg";

function Image(){
    let h = 300;
    let w = 300;
    return(
        <div>
            <img src={logo} height={h} width={w} alt="img" className="i1"/>
            <h1>Wellcome</h1>
        </div>
    )
}

export default Image;