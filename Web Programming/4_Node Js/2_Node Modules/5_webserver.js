let http = require('http');
let u = require('url');

let server = http.createServer(function(req,res){
    let url_parts = u.parse(req.url,true);
    let name = url_parts.query.name;
    let col = url_parts.query.color;

    res.writeHead(200,{'content-type':'text/html'});
    res.write("<h1 style='color:"+col+"'>Hello "+name+"</h1>");
    res.end();
});

server.listen(9000,function(){console.log("Server at 9000")});