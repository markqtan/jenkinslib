package hello

class HelloGroovy {
	public String hi(String name) {
		return "hi 2.0, " + name;
	}
	
	public static final void main(String[] args) {
		println new HelloGroovy().hi("Mark");
	}
	
	public static final String test(wf, String... args) {
		wf.println("args: "+ args);
		return ( new HelloGroovy().hi("Mark") );
	}
}

