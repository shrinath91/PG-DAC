var mysql = require('mysql2');
var exp = require('express');
var app = exp();

app.listen(9000,function(){console.log("Server is at 9000")});

var con = mysql.createConnection({
    host:'localhost',
    user:'root',
    password:'root',
    database:'Know_it'
});

con.connect(function(err){
    if(!err)
    console.log("DB connected")
else
console.log("Connection Failure!!!")
});

app.get("/emps",function(req,res){
    con.query("select * from emp",function(err,result){
        res.write("<table border=1 style='border-collapse: collapse;'>");
        res.write("<tr>");
        res.write("<td>Emp no</td>");
        res.write("<td>Emp name</td>");
        res.write("</tr>");
        
        result.forEach(function(v){
            res.write("<tr>");
            
            res.write("<td>"+v.EMPNO+"</td>");
            res.write("<td>"+v.ENAME+"</td>");
            
            res.write("</tr>");
        });
        res.write("</table>");
        res.end();
    });
})

