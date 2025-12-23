
/**
 *  10
 */

var count = 0;

for (num = 2; num <= 50000; num++) {
    if (num == 2) {
        count++;
    }
    else {
        var flag = false;
        for (j = 2; j < num; j++) {

            if (num % j == 0) {
                flag = true;
            }
        }
        if (!flag) {
            count++;
        }
    }
}

console.log("Total nums are :" + count);
