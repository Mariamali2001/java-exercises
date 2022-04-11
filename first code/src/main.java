
 public static void main (String[] args ) {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("please enter the coefficient of a and b and c");
	 double a=sc.nextDouble();
	 double b=sc.nextDouble();
	 double c=sc.nextDouble();
	 double underroot,x1,x2;
	 underroot=Math.pow(b,2)-(4*a*c);
	 if ((a==0) || (underroot<0)) {
		 System.out.println("no solution!"); 
	 }
	 else if (underroot==0) {
		 x1 = -b/(2*a);
		 x2 = x1;
		 System.out.println("x1=x2="+x1);
	 } 
	 else {
		 x1=(-b+Math.sqrt(underroot))/(2*a);
		x2= (b + Math.sqrt(underroot))/(2*a);
	System.out.println("x1 ="+ x1);
	System.out.println("x2 ="+ x2);
 }}}
