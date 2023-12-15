var exp = require('express');
var bp = require('body-parser');
var app = exp();

app.listen(8000,function(){
   console.log("Server is listening at 8000"); 
});

app.use(bp.urlencoded({extended:false}));

app.post("/checklogin",function(req,res){
    if(req.body.uid=="shrinath91" && req.body.pass=="shri")
    {
        res.send("<h3>Successful login</h3>");
    }
    else
        res.redirect("/login");
    
});

app.get("/login",function(req,res){
    res.sendFile(__dirname+"/1_login_form.html");
});


app.all("*",function(req,res){
    res.send("<h1>Check URL</h1>")
});