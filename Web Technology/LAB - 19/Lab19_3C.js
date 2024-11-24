// Create a webapp in NodeJS which reads ƒles like about.txt, contact.txt and display it 
// using express

const express = require ("express");
const fs = require ("fs");
const app = express();

app.get('/',(req,res) => {
    fs.readFile('home.txt',(err,data) => {
        if(err) throw err ;
        res.write(data);
        return res.send();
    });
});

app.get('/about',(req,res) => {
    fs.readFile('about.txt',(err,data) => {
        if(err) throw err ;
        res.write(data);
        return res.send();
    });
});

app.get('/contact',(req,res) => {
    fs.readFile('contact.txt',(err,data) => {
        if(err) throw err ;
        res.write(data);
        return res.send();
    });
});

app.listen(5000 , (req,res) => {
    console.log("Server is started at 5000 !!")
});