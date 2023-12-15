function Date1(){
    let dt = new Date();
    let months = ["jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"]
    let date = dt.getDate();
    let mon = dt.getMonth();
    let yr = dt.getFullYear();
    let hrs = dt.getHours();
    let min = dt.getMinutes();
    let sec = dt.getSeconds();
    return(
        <div className="dDiv">
            <h1>Date: {date}/{months[mon]}/{yr} Time: {hrs}:{min}:{sec}</h1>
        </div>
    )
}

export default Date1;