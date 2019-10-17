var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var ename = "RAmesha";
console.log('name=', ename);
var phoneNo = 7411024475;
console.log('Phone No=', phoneNo);
var sal;
sal = 456357;
console.log("salaray=", sal);
var currentAddress;
currentAddress = 571101;
console.log(currentAddress);
currentAddress = "Kunthanahalli village, Bannur Hobli,T.N pura Taluk,Mysore District";
console.log(currentAddress);
var res = function () {
    console.log("Hello Good Morning");
};
res();
//examples for class,object and inheritance
var Employee = /** @class */ (function () {
    function Employee(name, sal) {
        this.name = name;
        this.sal = sal;
    }
    return Employee;
}());
var e1 = new Employee("Ramesha", 500000);
console.log("Employee Details=", e1);
var Newstudent = /** @class */ (function (_super) {
    __extends(Newstudent, _super);
    function Newstudent(name, age) {
        var _this = _super.call(this, name, sal) || this;
        _this.name = name;
        _this.age = age;
        return _this;
    }
    return Newstudent;
}(Employee));
var s1 = new Newstudent("Ramesha", 22);
console.log("student Details=", s1);
