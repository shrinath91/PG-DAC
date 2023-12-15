let http = require('http');

let server = http.createServer(function(req,res){
    res.writeHead(200,{'content-type': "text/html"});
    if(req.url == '/home')
       res.write("<h1>Home Page</h1>");

    else if(req.url == '/login')
       res.write("<h1>Login Page</h1>")
    else
       res.write("<h1>Unknown Page</h1>");

}).listen(5000,function(){
    console.log("Server started at 5000");
});