const express = require ('express');
const app = express();

const demo = (req , res , next) => {
    console.log('msg');
    next();
}

app.use('/xyz',demo);

app.get('/' , (req,res) => {
    res.send('Hello World');
});

app.get('/xyz' , (req,res) => {
    res.send('Hello World xyz');
});

app.listen(3040, (req,res) => {
    console.log('Server is started at 3040');
});