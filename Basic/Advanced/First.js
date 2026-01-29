

/**
 * Call Stack.
 */

function Demo() {
    let car = "BMW";
    function Demo2() {
        let Truck = "LeyLand";
        function Demo3() {
            console.log(car, Truck);
        }
        return Demo3;
    }
    return Demo2;

}


let m = Demo();
let n = m();
n();
