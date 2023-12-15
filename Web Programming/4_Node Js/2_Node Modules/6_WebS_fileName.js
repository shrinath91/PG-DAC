let h = require('http');
let u = require("url");
let fs = require("fs");

h.createServer(function(req,res){
    let url_p = u.parse(req.url,true);
    let name = url_p.pathname;
    // console.log(name);
    let fName = name.substring(1);
    fs.readFile(fName,function(err,data){
        if(!err)
        {
            res.writeHead(200,{'content-type':'text/html'});
            res.write(data);
            res.end();
        }
        else
        {
            res.writeHead(200,{'content-type':'text/html'});
            res.write("<h1>Page not found!!!</h1>");    
            res.end();
        }
    })
    
    


}).listen(9000,function(){
    console.log("Server is on 9000")
});