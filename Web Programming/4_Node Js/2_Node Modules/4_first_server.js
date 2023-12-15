let h = require("http");

let server = h.createServer(function(req,res){
    res.writeHead(200,{'content-type':'text/html'});
    res.write("Hello from server");
    res.end();
});

server.listen(5000,function(){
    console.log("Server started on 5000");
});