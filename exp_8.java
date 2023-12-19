import java.util.Scanner; 
class Employee
{
String Emp_name,Mail_id,Address,Emp_id, Mobile_no; double BP,GP,NP,DA,HRA,PF,CF;
Scanner get = new Scanner(System.in); Employee()
{
System.out.println("Enter Name of the Employee:"); Emp_name = get.nextLine();
System.out.println("Enter Address of the Employee:"); Address = get.nextLine();
System.out.println("Enter ID of the Employee:"); Emp_id = get.nextLine(); 
System.out.println("Enter Mobile Number:"); Mobile_no = get.nextLine();
System.out.println("Enter E-Mail ID of the Employee :"); Mail_id = get.nextLine();
}
void display()
{
System.out.println("Employee Name: "+Emp_name); 
System.out.println("Employee Address:"+Address); System.out.println("Employee ID: "+Emp_id); 
System.out.println("Employee Mobile Number: "+Mobile_no);
System.out.println("Employee E-Mail ID"+Mail_id); DA=BP*0.97;
HRA=BP*0.10; PF=BP*0.12; CF=BP*0.01; GP=BP+DA+HRA+PF; NP=GP-PF-CF;
System.out.println("Basic Pay :"+BP); System.out.println("Dearness Allowance : "+DA);
System.out.println("House Rent Allowance :"+HRA); 
System.out.println("Provident Fund :"+PF);
System.out.println("Club Fund :"+CF);
System.out.println("Gross Pay :"+GP); System.out.println("Net Pay :"+NP);
}
}

class Programmer extends Employee
{
Programmer()
{
System.out.println("Enter Basic pay of the Programmer:"); BP = get.nextFloat();
}
void display()
{
System.out.println("=============================="+"\n"+"Programmar PaySlip"+"\n"+"=============================="+"\n");
super.display();
}
}
class Assistant_Professor extends Employee
{
Assistant_Professor()
{
System.out.println("Enter Basic pay of the Assistant Professor:"); BP = 
get.nextFloat();
}
void display()
{
System.out.println("=============================="+"\n"+"Assistant Professor PaySlip"+"\n"+"=============================="+"\n");
super.display();
}
}
class Associate_Professor extends Employee
{
Associate_Professor()
{
System.out.println("Enter Basic pay of the Professor:"); BP = get.nextFloat();
}
void display()
{
System.out.println("=============================="+"\n"+"Associate Professor PaySlip"+"\n"+"=============================="+"\n");
super.display();
}
}
class Professor extends Employee
{
Professor()
{
System.out.println("Enter Basic pay of the Professor:"); BP = get.nextFloat();
}
void display()
{
System.out.println("=============================="+"\n"+"Professor PaySlip"+"\n"+"=============================="+"\n");
super.display();
}
}

class exp_8
{
public static void main(String args[])
{
String pos;
Scanner get = new Scanner(System.in); System.out.println("\nEnter Employee Position(PROGRAMMER/AP/ASSOCIATE/PROFESSOR) :");
pos=get.nextLine();
if(pos.equals("PROGRAMMER")||pos.equals("programmer"))
{
Programmer p=new Programmer(); p.display();
}
if(pos.equals("AP")||pos.equals("ap"))
{
Assistant_Professor AP=new Assistant_Professor(); AP.display();
}
if(pos.equals("ASSOCIATE")||pos.equals("associate"))
{
Associate_Professor ASP=new Associate_Professor(); ASP.display();
}
if(pos.equals("PROFESSOR")||pos.equals("professor"))
{
Professor PR=new Professor(); PR.display();
}
get.close();
}
}
