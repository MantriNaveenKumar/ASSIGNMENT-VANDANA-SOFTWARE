
/*
 1. Take a sentence as an input and reverse every word in that sentence. 
Example - This is a sunny day > shiT si a ynnus yad. */

const input = prompt("Enter a sentence:"); // Prompt the user for input
const words = input.split(' ');

for (const word of words) {
  let reverse = "";
  for (let i = word.length - 1; i >= 0; i--) {
    reverse = reverse + word.charAt(i);
  }
  document.write(reverse + " ");
}


/*

INPUT :
Happy to be the part of Vandana Software Company.

OUTPUT:
yppaH ot eb eht trap fo anadanaV erawtfoS ynapmoC

*/