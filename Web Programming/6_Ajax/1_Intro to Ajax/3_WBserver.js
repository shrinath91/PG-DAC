var exp = require('express');
var mysql = require('mysql2');

var app = exp();

var con = mysql.createConnection({
    host:'localhost',
    user:'root',
    password:'root',
    database:'know_it'
});

con.connect(function(err){
    if(!err)
    {
        console.log("DB is connected")
    }
    else
    {
        console.log("DB is not connected")
    }
});



app.use(exp.static("resources"));

app.listen(9000,function(){console.log("server is on 9000")});

app.get("/reg",function(req,res){
    res.sendFile(__dirname+"/3_registration.html");
});

app.get("/checkuser",function(req,res){
    var usrname = req.query.usrname;
    var que = "select ENAME from emp where ENAME="+"'"+usrname+"'";
    con.query(que,function(err,result){
        if(result.length>0)
        {
            res.send("Userid not present");
        }
        else
        {
            res.send("Userid present");
        }
    });

});

