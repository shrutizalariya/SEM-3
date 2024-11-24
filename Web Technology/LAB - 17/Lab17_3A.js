// Demonstrate “fs” core module in NodeJS.

const fs = require('fs');

//Exist
fs.exists ('Lab17_2A.js',(exists) => {
    console.log(exists ? 'Found' : 'Not Found');
})

//write file
fs.writeFile('xyz','darshanuni',(err) => {
    if(err){throw err};
    console.log('Saved');
})

//read file
fs.readFile('xyz',(err,data) => {
    if(err){throw err};
    console.log(data.toString());
})

//append file
fs.appendFile('xyz',' rajkot',(err,data) => {
    if(err){throw err};
    console.log('Saved');
})

//rename file
fs.rename('xyz','abc',(err) => {
    if(err){throw err};
    console.log('Renamed');
})

//unlink file
fs.unlink('abc',(err) => {
    if(err){throw err};
    console.log('Deleted');
})