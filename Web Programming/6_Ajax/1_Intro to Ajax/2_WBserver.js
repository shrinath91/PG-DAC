var exp = require("express");
var mysql = require("mysql2");

var app = exp();

app.listen(9000,function(){console.log("Server is listening at 9000")});
app.use(exp.static('resources'));

var con = mysql.createConnection({
    host:'localhost',
    user:'root',
    password:'root',
    database:'know_it'
});

con.connect(function(err){
    console.log("DB is connected!!!")
});




app.get("/findemp",function(req,res){
    res.sendFile(__dirname+"/2_employee.html");
});

app.get("/getemp",function(req,res){
    var eno = req.query.EMPNO;
    // console.log(eno);
    var que = "select * from emp where EMPNO="+eno;
    // console.log(que);
    con.query(que, function(err,result){
        if(result.length==0)
        {
            // console.log("Empty");
            res.send("<h1>Employe not found!!!</h1>")
        }
        else
        {
            res.write("<table border=1>");
            res.write("<tr><td>EMPNO</td><td>ENAME</td></tr>");

            result.forEach(function(v){
                res.write("<tr><td>"+v.EMPNO+"</td><td>"+v.ENAME+"</td></tr>");
            });

            res.write("</table>");
            res.end();
        }
     
    });

});