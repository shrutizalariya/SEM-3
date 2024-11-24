// Create a hello world webapp using ExpressJS. 

const express = require ('express');
const app = express();

app.get('/',(req,res) => {
    res.send('Hello World !! ');
});

app.listen(3040 , (req,res) => {
    console.log("Server is started at 3040 !!")
});