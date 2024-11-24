// Explore minimum 3 other core module from the documentation of NodeJS

// 1. os(Hostname)
    const os = require ('os');
    console.log(os.hostname());

// 2. url (Password)
    const myURL = new URL('https://abc:xyz@example.com');
    console.log(myURL.password);
    // Prints xyz

    myURL.password = '123';
    console.log(myURL.href);
    // Prints https://abc:123@example.com/ 