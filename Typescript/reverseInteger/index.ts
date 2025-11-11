function reverse(x: number): number {
  const MIN = -2147483648;
  const MAX = 2147483648;
  var inputNumberAsString = x.toString();
  let stringBuilder = "";

  for (let i = inputNumberAsString.length - 1; i >= 0; i--) {
    stringBuilder = stringBuilder.concat(inputNumberAsString.charAt(i));
  }

  if (x < 0) {
    // remove the '-' that got moved to the end
    stringBuilder = stringBuilder.replace("-", "");
    // convert to number and reapply sign
    if (-Number.parseInt(stringBuilder) < MIN) {
      return 0;
    } else return -Number.parseInt(stringBuilder);
  } else {
    if (Number.parseInt(stringBuilder) > MAX) {
      return 0;
    } else return Number.parseInt(stringBuilder);
  }
}

function main() {
  var numOne = 131;
  var numTwo = -123;
  console.log(reverse(numTwo));
  console.log("-----");
  //console.log(reverse(numTwo))
}

main();
