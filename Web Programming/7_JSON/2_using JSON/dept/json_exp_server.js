var exp = require("express");
var bp = require("body-parser");
var mysql = require("mysql2");

var con = mysql.createConnection({
    host:"localhost",
    user:"root",
    password:"root",
    database:"know_it"
})

con.connect(function(err){
    if(!err)
        console.log("DB connected");
    else
        console.log("DB not connected");
});

var app = exp();

app.use(bp.urlencoded({extended: false}));

app.listen(9000,function(){console.log("server on 9000");});

app.get("/deptform",function(req,res){
    res.sendFile(__dirname+"/dept_form.html");
});


app.post("/getemps",function(req,res){
    var dno = req.body.deptno;
    var query = "select * from emp where DEPTNO = "+dno;
    con.query(query,function(err, result){
        if(!err)
        {
            console.log(result);
            res.send(JSON.stringify(result));
        }
        else{
            console.log("error in query"+err.toString())

        }
    });
});
