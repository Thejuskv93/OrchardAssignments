let num1=10;
let num2=20;
document.write(`10 * 20=${num1*num2}<br/>`);

function doMath(strings, ...values)
{
    if(strings[0]=='add')
    {
        document.write(`${values[0]}+${values[1]}=${values[0]+values[1]}<br/>`);
    }
    else if(strings[0]=='sub')
    {
        document.write(`${values[0]}-${values[1]}=${values[0]-values[1]}<br/>`);
    }
}
doMath `add${10} ${50}`;
// doMath `sub${10} ${50}`;


let fname="Thejus";
for(let c of fname)
{
    document.write(`${c}<br/>`);
}
document.write(fname.startsWith("Th"));
document.write(fname.endsWith("Th"));
document.write(fname.includes("Th"));

let multiline=`Hello
this is 
thejus`;
document.write(`${multiline}<br/>`);
function val(num1=1,num2=2)
{
    document.write(`${num1}+${num2}=${num1+num2}<br/>`);
}
val(2,6);

function valMore(...vals)
{
    let sum=0;
   for(let i=0;i<vals.length;i++)
   {
    sum+=vals[i];
   }
   document.write(`Sum = ${sum}<br/>`);
}
valMore(2,6,4,6,7,8,9,10);

let difference=(num1,num2)=>num1-num2;
// document.write(`${5}-${10}=${5-10}<br/>`);

let diff=(num1,num2)=>
{
    let d=num1-num2;
    document.write(`${num1}-${num2}=${d}<br/>`);
}
diff(50,20);

let valArr=[1,2,3,4,5,6];

let sumVals=valArr.reduce((a,b)=>a+b);
document.write(`${sumVals}<br/>`);

let evens=valArr.filter(t => t % 2 == 0);
document.write(`${evens}<br/>`)

let doubles=valArr.map(v=>v*2);
document.write(`Doubles :${doubles}<br/>`);
