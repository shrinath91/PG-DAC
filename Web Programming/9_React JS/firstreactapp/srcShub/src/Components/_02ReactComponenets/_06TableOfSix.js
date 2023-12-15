function PrintTable(){
    var table = [];
    for(let i = 1 ; i <= 10 ; i++){
        table.push(i*6);
    }
    return(
        <div>
            <table className="table" border="1">
                <tr>
                    <td>Equation</td>
                    <td>Ans</td>
                </tr>
                {
                    table.map(function(v,i){
                        return(
                            <tr>
                                <td>6*{i+1}</td>
                                <td>{v}</td>
                            </tr>
                            
                        ) 
                    })
                }
            </table>
        </div>
    )
}
export default PrintTable;