let myName : string = "Ramesha";
console.log(myName,typeof myName);

let age = 21;
console.log(age,typeof age);

let mobileNumber : number;
mobileNumber = 7411024475;
console.log(mobileNumber,typeof mobileNumber);

let address;
address = "Bannur Hobli T.N pura Taluk,Mysore District"
console.log(address,typeof address);
//Example for void
let calAge = function() : void{
    console.log("age is 22");
}
calAge();
//class
class Person{
    constructor(public name : string,public age :number){
    }
}
let person1 = new Person("Ramesha",21);
console.log(person1);
//inheritance
class Student extends Person{
    constructor(name : string,age : number,public rollNO : number){
        super(name,age);
    }
}
let student1 = new Student("Mahesha",45,555);
console.log(student1);

