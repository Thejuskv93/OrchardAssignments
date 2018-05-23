// let displayColors=function()
// {
//     console.log(message);
//     for(let i in arguments)
//     {
//         console.log(arguments[i]);
//     }
// }
// let message="List of colors";

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

let displayColors=function(message,...colors)
{
    console.log(message);
    for(let i in colors)
    {
        console.log(colors[i]);
    }
}
let message="List of colors";

let colors=['Red','Blue','Green'];

displayColors(message,...colors);

let fname="thejus"
let lnme="K V"

let Person={
    fname,
    lnme
};
console.log(Person.fname+" "+Person.lnme);

function createPerson(fname,lname,age)
{
    let fullname=fname+" "+lname;
    return {fname,
        lname,
        fullname,
        isSenior()
        {
            return age>60
        }
    };
}
let cp=createPerson("Shamil","S",68);
console.log(cp.fname);
console.log(cp.lname);
console.log(cp.fullname);
console.log(cp.isSenior());

class Student
{
    name:string;
    constructor(name)
    {
        this.name=name;
        console.log('====================================');
        console.log(this.name);
        console.log('====================================');
    }
    static staticMethod()
    {
        console.log('====================================');
        console.log(this.name);
        console.log('====================================');
    }
}
let s=new Student("Thejus");
Student.staticMethod();


class Student2
{
    constructor()
    {
        console.log('====================================');
        console.log("student2");
        console.log('====================================');
    }
    getId()
    {
        return 10;
    }
}

class Student3 extends Student2
{
    constructor()
    {
        super();
        console.log("student3");
    }
}
let s2=new Student3();
console.log(s2.getId())

