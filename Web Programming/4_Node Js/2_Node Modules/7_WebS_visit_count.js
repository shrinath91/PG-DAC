let h = require('http');
let u = require('url');
let fs = require('fs');

h.createServer(function(req,res){
    if(req.url=='/favicon.ico') return;
    else
    {
        fs.readFile('count.txt',function(err,data){
        if(!err)    
        {
            cnt = parseInt(data.toString());
            cnt++;
            console.log("Visit count:"+cnt);
            fs.writeFile("7_count.txt",cnt.toString(),function(err){
                if(!err)
                    console.log("Data Overridden!!")
                else
                    console.log("Error!!")});
        }
        else
        {
            console.log("count file cant read")
        }
        });
    }
    res.writeHead(200,{'conntent-type':'text/html'});
    res.end();
        
      
        
}).listen(9000,console.log("Server is live on 9000"));