export default function PropsFactorial(props)
{
    var n1 = props.num;
    var fact=1;
    for(let i=2; i<=n1; i++)
    {
        fact*=i;
    }
    return(
        <div>
            <h1>Factorial of {n1}</h1>
            <p>Factorial: {fact}</p>
            
        </div>
    )
}
