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
class FinalizeDemo_03
{
    public static void main(String arg[])
    {
        Employee eobj = new Employee("Amit",78000,28,"Karve Road Pune");
        eobj.Display();
        String str = "MArvellous";
       
        System.out.println(eobj.getClass());
        System.out.println(str.getClass());

    }
}