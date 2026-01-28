
/**
 * 
 * Seal()=> will not allow you to delete the Existing Proeperty.
 * Will not let you add the new Property.
 * will allow you to change the existing Property.
 */
let  Employee=
{
    "name":" Swami Arjan",
    "email":"swami@uss.com",
    "id":456,
    "salary":90989,
    "dept":"Recruting",
    "experiences":["TCS","ACCENTURE","LTIMINDTREE"]

}

console.log(Employee);

console.log("**************************************************************************");

Object.seal(Employee);

delete Employee.salary;

Employee.dept="FRONTEND";

Employee.UAN="878787878";

console.log(Employee);


console.log(Object.isSealed(Employee));


