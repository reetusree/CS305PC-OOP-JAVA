package Student;
class Student extends person{
	private String id, name, branch, password;
	Student(String n){
		super(n);
		this.name = n;
	}
	public void getID(String ID){
		this.id =id;
		}
	public void getbranch(String branch){
		this.branch = branch;
		}
	public void getname(String name){
		this.name=name;
		}
	public void getpassword(String password){
		this.password = password;
		}
		
		//Dynamic polymorphism (Method Overriding)
		//@Override
		public String getdetails(){
			return(id+","+name+","+branch+","+password);
			}
		}
		
