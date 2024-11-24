const http = require ('http');
const fs = require ('fs');

const server = http.createServer((req,res) => {
    res.setHeader("Contact-type","text-html");
    res.write("<a style='margin:50px ; height:50px ; width:50px ; background-color:cadetblue ; color:black ; ' href='About.html'>About</a>");
    res.write("<a style='margin:50px ; height:50px ; width:50px ; background-color:darkseagreen ; color:black ; ' href='Contact.html'>Contact</a>");

    if(req.url == '/About.html'){
        const data = fs.readFileSync('About.html','utf-8');
        res.end(data.toString());
    }
    else if(req.url == '/Contact.html'){
        const data = fs.readFileSync('Contact.html','utf-8');
        res.end(data.toString());
    }
    res.end();
});

server.listen(3040,() => {
    console.log("Server is running at 3040 !! ");
});