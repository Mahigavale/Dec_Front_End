
/**
 * 1-15 => Cubes.
 */

// for(var v=1;v<=15;v++)
// {
//     console.log(v**3);

// }

/**
 * Prime number :=> decide whether it is prime number or not.
 */

/**
 * 10:
 * 1,2,5,
 */


//13 => 1,13
//2,12

var flag = false;
for (var v = 2; v < 14; v++) {
    if (14 % v == 0) {
        flag = true;

    }
}

if (flag == true) {
    console.log("Not prime");

}
else {
    console.log("Prime");

}


// 1-150
/**
 * Print the prime numbers from 2-150.
 */

var count = 0;

var sum = 0;
for (var v = 2; v < 151; v++) {
    if (v == 2) {
        count++;
        console.log(v + " :Prime");
        sum = sum + v;

    }
    else {

        var flag = false;
        for (var a = 2; a < v; a++) {
            if (v % a == 0) {
                flag = true;
            }
        }
        if (flag != true) {
            sum = sum + v;
            count++;
            console.log("Prime :" + v);

        }
    }

}
console.log("total prime:" + count);

console.log("sum:" + sum);
