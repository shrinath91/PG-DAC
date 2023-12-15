let exp = require("express");
let u = require('url');


let app = exp();

app.listen(9000,function(){console.log("Server is live at 9000")});

app.get("/greet",function(req,res){
    res.send("<h1>Welcome to Express Js</h1>")
});

app.get("/login",function(req,res){
    res.sendFile(__dirname+"/1_login_form.html");
});

app.get("/checklogin",function(req,res){
    if(req.query.uid=="shrinath91"&&req.query.pass=="Ganapati")
    {
        res.send("<h1>Successfull Login</h1>");
    }
    else
    {
        res.send("<h1>Failed to Login!!!</h1>");
    }
});

app.all('*',function(req,res){
    res.send("<h3>Please enter valid URL</h3>")
});