//  Create a hello world webapp using “http” core module in NodeJS.

const http = require ("http");

const server = http.createServer ((req,res) => {
    res.end ("Server Running");
});

server.listen (3000 ,() => {
    console.log("server is running at port 3000 !! ")
});