function palindrome(word){
    if (word.charAt(0) !== word.charAt(word.length-1)){
        return false;
    }
    if (word.length < 2){
        return true;
    }

    return palindrome(word.slice(1, word.length-1))
}

console.log(palindrome("romeu"));
console.log(palindrome("racecar"));
