import React from "react";
//this is shortcut for export default FactorialProp
export default class FactorialProp extends React.Component{
    render(){
        let num = this.props.number;
        let fact = 1;
        for(let i = 1; i <= num ; i++){
            fact *= i;
        }
        return(
            <div>
                <h1>Factorial of {this.props.number} is {fact}</h1>
            </div>
        )
    }
}