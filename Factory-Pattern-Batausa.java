function Manager(name)
{
  this.name = name
  this.type = "Manager"
}

function CoManager(name)
{
  this.name = name
  this.type = "Co-Manager"
}
//diri ma identify sir if manager ba sya or co manager naka dipinde ug unsa number gibutang
function EmployeeFactory()
{
  this.create = (name, type) => {
    switch(type)
    {
      case 1:
        return new Manager(name)
      case 2:
        return new CoManager(name)
    }
  }
}

function say()
{
  console.log("Hi, I am " + this.name + " and I am a " + this.type)
}
//diri dayun sir kay diri kuhaon tong name sa mga employee sa taas si paul kay 1 and ira kay 2 so si paul ang manager then co manager si ira
const employeeFactory = new EmployeeFactory()
const employees = []

employees.push(employeeFactory.create("Paul", 1))
employees.push(employeeFactory.create("Ira", 2))
 
//loop dayun diri sir
employees.forEach( emp => {
  say.call(emp)
})