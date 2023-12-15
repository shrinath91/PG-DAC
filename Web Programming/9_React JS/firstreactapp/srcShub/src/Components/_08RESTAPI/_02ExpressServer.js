let exp = require("express");
let mysql = require("mysql2");
let cors = require("cors");

let app = exp();
let conn = mysql.createConnection({
    host:"localhost",
    user:"root",
    password:"sql123",
    database:"cdac"
})

app.listen(9000,function(){
    console.log("Express RESTAPI server 9000");
})

app.use(cors());

conn.connect(function(err){
    if(!err)
        console.log("DataBase Connected!!!")
    else
        console.log("Database Connection Error!!!")
})

app.get("/getEmps",function(req,res){
    conn.query("select * from emp",function(err,result){
        if(!err){
            res.send(JSON.stringify(result));
            console.log("Record Sent to Client");
        }else{
            console.log("Error In Sql Query!!!")
        }
    })
})
