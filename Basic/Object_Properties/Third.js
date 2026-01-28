
let  Employee=
{
    "name":" Swami Arjan",
    "email":"swami@uss.com",
    "id":456,
    "salary":90989,
    "dept":"Recruting",
    "experiences":["TCS","ACCENTURE","LTIMINDTREE"]

}
/**
 * Freeze()=>won't allow the deletion of the existing Properties.
 *  won't allow the addition of the new Properties in the Object.
 */
 Object.freeze(Employee);

 Employee.dept="IT"
delete Employee.experiences;

Employee.UAN="cHfp789";
console.log(Employee);

console.log(Object.isFrozen(Employee));
