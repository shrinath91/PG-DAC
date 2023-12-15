var exp = require('express');

var app = exp();

app.use(exp.static('images'));

app.listen(9000,function(){console.log("Server is listening on 9000")});

app.get("/login",function(req,res){
    res.sendFile(__dirname+"/1_login_form.html");
});

app.get("/checklogin",function(req,res){
    
});

