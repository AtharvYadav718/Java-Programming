class Employee
{
    public String Name;
    public int Salary;
    public int Age;
    public String Adddress;

    Employee(String str, int amount, int A, String addr)
    {
        this.Name = str;
        this.Salary = amount;
        this.Age = A;
        this.Adddress = addr;
    }

    protected void Finalize()
    {
        System.out.println("Inside Finalize method...");
    }

    void Display()
    {
        System.out.println("Employee name :"+this.Name);
  
        System.out.println("Employee Salary :"+this.Salary);
        System.out.println("Employee Age :"+this.Age);
        System.out.println("Employee Address :"+this.Adddress);
    }
}
class FinalizeDemo_02
{
    public static void main(String arg[])
    {
        Employee eobj = new Employee("Amit",78000,28,"Karve Road Pune");
        eobj.Display();
        Employee eobj2 = eobj;
        Employee eobj3 = new Employee("Sagar",88000,29,"Prabhat Road Mumbai");

        System.out.println("Hash Code of eobj is :"+eobj.hashCode());
        System.out.println("Hash Code of eobj2 is :"+eobj2.hashCode());
        System.out.println("Hash Code of eobj3 is :"+eobj3.hashCode());

        eobj = null;
        
        System.gc();
    }
}