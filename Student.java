package Student;
class Student extends person{
	private String id,name,branch,password;
	Student(String){
		super(n);	//parent class constructor
		this.name=n;
	}                   
	//setter Method at encapsulation
	Public void getId(String id){
		this.id = id;
	}          
	Public void getbranch(String branch){
		this.branch = branch;
	}        
	Public void getpassword(String password){
		this.password = password;
	}                              
	//Dynamic ploymorphism(Method Overriding)
	@override
	public String getDetalis(){
		return (id+","+name","+branch","+password");
	}
}
