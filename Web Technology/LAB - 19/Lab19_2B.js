// Create a webapp with 5 pages like about, contact etc.. using ExpressJS.

const express = require ('express');
const app = express();

app.get('/home',(req,res) => {
    res.send('Home page');
});

app.get('/about',(req,res) => {
    res.send('About page');
});

app.get('/Contact',(req,res) => {
    res.send('Contact page');
});

app.get('/abc',(req,res) => {
    res.send('abc page');
});

app.get('/xyz',(req,res) => {
    res.send('xyz page');
});

app.listen(3040 , (req,res) => {
    console.log("Server is started at 3040 !!")
});