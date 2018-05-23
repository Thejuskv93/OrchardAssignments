"use strict";
var employee = {
    id: 1,
    greet: function () {
        var self = this;
        setTimeout(function () { console.log(self.id); }, 1000);
    }
};
employee.greet();
//or
var student = {
    id: 1,
    greet: function () {
        var _this = this;
        setTimeout(function () { console.log(_this.id); }, 1000);
    }
};
student.greet();
var funParam = function (value) {
    if (value === void 0) { value = 10; }
    console.log(value);
};
funParam();
funParam(20);
var percentBonus = function () { return 4; };
var add = function (value, bonus) {
    if (value === void 0) { value = 10; }
    if (bonus === void 0) { bonus = value * percentBonus(); }
    console.log(value + bonus);
};
add();
add(20);
add(20, 30);
add(undefined, 40);
var employee2 = {
    id: 1,
    greet: function () {
        var self = this;
        var a = function () {
            console.log("hello");
        };
        a();
    }
};
employee2.greet();
//# sourceMappingURL=tutorial11.js.map