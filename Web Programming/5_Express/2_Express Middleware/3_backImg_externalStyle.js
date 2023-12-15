var exp = require("express");
var app = exp();

app.listen(9000,function(){
    console.log("Server is listening at 9000");
});

app.use(exp.static('images'))
app.use(exp.static('stylesheets'))

app.get('/login',function(req,res){
    res.sendFile(__dirname+'/3_login_form.html');
});

app.all("*",function(req,res){
    res.send("<h1>Check URL</h1>")
});