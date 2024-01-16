class Employee implements Cloneable
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

    void Display()
    {
        System.out.println("Employee name :"+this.Name);
        System.out.println("Employee Salary :"+this.Salary);
        System.out.println("Employee Age :"+this.Age);
        System.out.println("Employee Address :"+this.Adddress);
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
class FinalizeDemo_04
{
    public static void main(String arg[])
    {   
        try
        {
            Employee eobj1 = new Employee("Amit",78000,28,"Karve Road Pune");
            Employee eobj2 = (Employee)eobj1.clone();

            eobj1.Display();
            eobj2.Display();

            System.out.println("Hash Code of eobj1 is :"+eobj1.hashCode());
            System.out.println("Hash Code of eobj2 is :"+eobj2.hashCode());

        }
        catch(CloneNotSupportedException obj)
        {
            System.out.println("Inside Catch Block");
        }
        
    }
}