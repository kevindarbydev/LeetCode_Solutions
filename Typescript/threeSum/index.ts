/*
    Given an array (arr) and an integer sum, check if there is a triplet
    in the array which sums up to 0
    also i,j & k must be unique (i != j, i != k, and j != k)
*/
function threeSum(arr: number[]): number[][] {
    const length = arr.length;
    let arrayOfArrays = [];
    let arrayCounter = 0;

   // let st = new Set();

    for (let i = 0; i < length; i++) {
        for (let j = i + 1; j < length; j++){
            for (let k = j +1; k < length; k++) {
                if (arr[i] + arr[j] + arr[k] == 0){
                    arrayOfArrays[arrayCounter] = [arr[i],arr[j],arr[k]];
                    arrayCounter++;
                }
            }
        }

    }


    return arrayOfArrays;
}

function main() {
  let arr1 = [-1, 0, 1, 2, -1, -4];
  console.log(threeSum(arr1));
  console.log("-----");
  
}

main();
