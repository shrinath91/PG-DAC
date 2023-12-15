var exp = require("express");
var app = exp();

app.listen(9000,function(){console.log("Server is listening at 9000")});

app.get('/welcome',function(req,res){
    res.sendFile(__dirname+"/1_hello.html");
});
app.get('/greetMessage',function(req,res){
    // res.send("<h1>Hello "+req.query.name+ ", Namaskaram!!!</h1>")
    res.send("<h1>Hello "+req.query.name+ ", Namaskaram!!!</h1>")
});