function createAnimal(name,owner)
{
    return{
        name,
        owner,
        getInfo()
        {
            return `${this.name} is owned by ${this.owner}`
        },
        address:
        {
            street:'123 Main St',
            city:'Bangalore'
        } 
    };
}
var sp1=createAnimal("Boss","Shamil");

document.write(`${sp1.getInfo()}<br/>`);
document.write(`${sp1.name} is at ${sp1.address.street}<br/>`);

let {name,owner}=sp1;
document.write(`Name : ${name}<br/>`);

class Person{
    constructor(name,age)
    {
        this.name=name;
        this.age=age;
    }
    static arms()
    {
        return 2;
    }
    what()
    {
        document.writeln(this.name);
    }
}
var me=new Person("Thejus",24);
document.writeln(me.name+" "+me.age);

me.what();

let symbol=Symbol('symbol1');
document.writeln(typeof symbol);