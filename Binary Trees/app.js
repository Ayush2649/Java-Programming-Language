let arr = [10, 15, 25, 20, 30, 29, 0];

let largest = 0;
let secondLargest = 0;

for(let i = 0; i < arr.length; i++){
    if(arr[i] > largest){
        secondLargest = largest;
        largest = arr[i];
    } else if(arr[i] > secondLargest && arr[i] != largest){
        secondLargest = arr[i];
    }
}

console.log("Largest number is: " + largest);
console.log("Second largest number is: " + secondLargest);

























// // Using if-else statements
// function getPrice(productName) {
//   if (productName == "pencil") {
//     return 10;
//   } else if (productName == "pen") {
//     return 20;
//   } else if (productName == "eraser") {
//     return 5;
//   } else if (productName == "notebook") {
//     return 50;
//   } else {
//     return 0;
//   }
// }

// console.log(getPrice("pencil"));















// // Using a switch statement
// function getPrice2(productName) {
//   switch (productName) {
//     case "pencil":
//       return 10;
//     case "pen":
//       return 20;
//     case "eraser":
//       return 5;
//     case "notebook":
//       return 50;
//     default:
//       return 0;
//   }
// }

// console.log(getPrice2("pen"));













// // Using an object to store prices
// const prices = {
//   pencil: 10,
//   pen: 20,
//   eraser: 5,
//   notebook: 50,
// };

// function getPrice3(productName) {
//   return prices[productName] || 0;
// }

// console.log(getPrice3("eraser"));
