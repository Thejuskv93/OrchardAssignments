console.log("Hello world");
for(let i=0;i<5;i++)
{
    setTimeout(function(){console.log(i);},1000);
}
const obj1={
    name:"Thejus"
};
//obj1={}; not possible because of const
console.log(obj1.name);
obj1.name="Thejus K V";
console.log(obj1.name);

const getArrowValue =()=>10;

console.log(getArrowValue());



const getVal = (m) => 10*m;

console.log(getVal(5));

const getArr=m=>10*m;
console.log(getArr(5));


const getValue=(m,n)=>10*m*n;
console.log(getValue(2,3));
