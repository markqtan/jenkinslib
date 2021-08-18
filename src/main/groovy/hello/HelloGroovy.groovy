package hello

class HelloGroovy {
	public String hi(String name) {
		return "hi, " + name;
	}
	
	public static final void main(String[] args) {
		println new HelloGroovy().hi("Mark");
	}
}

