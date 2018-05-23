"use strict";
// let displayColors=function()
// {
//     console.log(message);
//     for(let i in arguments)
//     {
//         console.log(arguments[i]);
//     }
// }
// let message="List of colors";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
// displayColors(message,'Red');
// displayColors(message,'Red','Blue');
// displayColors(message,'Red','Blue','Green');
// let displayColors=function(message,msg,...colors)
// {
//     console.log(message);
//     console.log(msg);
//     for(let i in colors)
//     {
//         console.log(colors[i]);
//     }
// }
// let message="List of colors";
// let msg="List";
// displayColors(message,msg,'Red');
// displayColors(message,'Red','Blue');
// displayColors(message,'Red','Blue','Green');
var displayColors = function (message) {
    var colors = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        colors[_i - 1] = arguments[_i];
    }
    console.log(message);
    for (var i in colors) {
        console.log(colors[i]);
    }
};
var message = "List of colors";
var colors = ['Red', 'Blue', 'Green'];
displayColors.apply(void 0, [message].concat(colors));
var fname = "thejus";
var lnme = "K V";
var Person = {
    fname: fname,
    lnme: lnme
};
console.log(Person.fname + " " + Person.lnme);
function createPerson(fname, lname, age) {
    var fullname = fname + " " + lname;
    return { fname: fname,
        lname: lname,
        fullname: fullname,
        isSenior: function () {
            return age > 60;
        }
    };
}
var cp = createPerson("Shamil", "S", 68);
console.log(cp.fname);
console.log(cp.lname);
console.log(cp.fullname);
console.log(cp.isSenior());
var Student = /** @class */ (function () {
    function Student(name) {
        this.name = name;
        console.log('====================================');
        console.log(this.name);
        console.log('====================================');
    }
    Student.staticMethod = function () {
        console.log('====================================');
        console.log(this.name);
        console.log('====================================');
    };
    return Student;
}());
var s = new Student("Thejus");
Student.staticMethod();
var Student2 = /** @class */ (function () {
    function Student2() {
        console.log('====================================');
        console.log("student2");
        console.log('====================================');
    }
    Student2.prototype.getId = function () {
        return 10;
    };
    return Student2;
}());
var Student3 = /** @class */ (function (_super) {
    __extends(Student3, _super);
    function Student3() {
        var _this = _super.call(this) || this;
        console.log("student3");
        return _this;
    }
    return Student3;
}(Student2));
var s2 = new Student3();
console.log(s2.getId());
//# sourceMappingURL=tutorial13.js.map