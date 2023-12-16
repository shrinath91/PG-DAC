let exp = require("express");
let mysql = require("mysql2");
let cors = require("cors");
const bp = require("body-parser");


let app = exp();
app.use(bp.json());

let conn = mysql.createConnection({
    host:"localhost",
    user:"root",
    password:"root",
    database:"know_it"
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

app.post("/insertemp",function(req,res){
    var empno = req.body.eno;
    var ename = req.body.ename;
    var job = req.body.job;
    var dno = req.body.dno;
    // console.log(req.body);

    var query = "insert into emp(EMPNO,ENAME,JOB, DEPTNO) values(?,?,?,?)"
    conn.query(query, [empno,ename,job,dno], function(err){
        if(!err)
            res.send("SUCESS")
        else
            res.send("FAILURE")
    });
})

