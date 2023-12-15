var exp = require("express");
let fs = require('fs');
var app = exp();

app.use(function(req,res,next){
    logStr = "\n"+req.url +" at "+new Date(); 
    fs.appendFile("2_logs.text",logStr.toString(),function(err){
        if(!err)
            console.log("Append Done!!!");
        else
            console.log("Append Unsuccessful")
    });
    next();
});


app.listen(9000,function(){
    console.log("Server live at 9000")
});

app.get("/login",function(req,res){
    res.sendFile(__dirname+"/1_login_form.html");
});

app.get("/Home",function(req,res){
    res.send("<h1>Home Page</h1>");
});

app.get("/Contact",function(req,res){
    res.send("<h1>Constact Page</h1>");
});

app.all("*",function(req,res){
    res.send("<h1>checj URL</h1>")
});

