"use strict";
console.log("Hello world");
var _loop_1 = function (i) {
    setTimeout(function () { console.log(i); }, 1000);
};
for (var i = 0; i < 5; i++) {
    _loop_1(i);
}
var obj1 = {
    name: "Thejus"
};
//obj1={}; not possible because of const
console.log(obj1.name);
obj1.name = "Thejus K V";
console.log(obj1.name);
var getArrowValue = function () { return 10; };
console.log(getArrowValue());
var getVal = function (m) { return 10 * m; };
console.log(getVal(5));
var getArr = function (m) { return 10 * m; };
console.log(getArr(5));
var getValue = function (m, n) { return 10 * m * n; };
console.log(getValue(2, 3));
//# sourceMappingURL=example.js.map