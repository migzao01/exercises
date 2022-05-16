var name = "Cadet";

if (process.argv[2]) {
    name = process.argv[2];
}

welcome(name);

function welcome(name) {
    console.log('Hello ' + name + ', Welcome to your World!');
}
