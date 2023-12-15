let h = require('http');
let u = require('url');
let fs = require('fs');

h.createServer(function(req,res){
    let url_part = u.parse(req.url);
    let resource = url_part.pathname;
    let cdate = new Date();
    logStr = "\nrequest for "+resource+" at "+cdate;

    fs.appendFile("8_logs.txt",logStr,function(err){
        if(!err)
            console.log("logs generated!!")
       });



}).listen(9000,function(){
    console.log("started at 9000")
});