// Demonstrate “path” core module in NodeJS.

const path = require('path');

// Normalize
Ans1 = path.normalize('./sfd/sjh/..');
console.log(Ans1);

//Join
Ans2 = path.join('sgh','vwhj','wbj');
console.log(Ans2);

//Resolve
Ans3 = path.resolve('abc','xyz');
console.log(Ans3);

//Relative
Ans4 = path.relative('/hv/hb','/nj/kn');
console.log(Ans4);

//Dirname = Returns Directory name
Ans5 = path.dirname('/ghh/xsb.txt');
console.log(Ans5);

//Basename = Returns File name
Ans6 = path.basename('/ghh/xsb.txt');
console.log(Ans6);

//Extname = Returns Extention of File
Ans7 = path.extname('/ghh/xsb.txt');
console.log(Ans7);