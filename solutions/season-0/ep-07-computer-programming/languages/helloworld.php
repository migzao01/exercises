<?php

function welcome($name) {
    echo "Hello " . $name . ", Welcome to our World!\n";
}

$name = "Cadet";
if ($argv[1]) {
    $name = $argv[1];
}

welcome($name);

?>
