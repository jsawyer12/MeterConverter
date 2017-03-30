public class W04Practical {
	public static void main(String[] args) {
		
		System.out.println("Enter a Metric distance in meters");
		double Meters= EasyIn.getDouble();
		if (Meters<0) System.out.println("Error, nonexistant distance");
		if (Meters==0) System.out.println("Distance is a single dimension, 0 meters is not");
		
		double Output= Meters*39.37;
		double Rem1= Output%36;
		double Yards= (Output-Rem1)/36;
		double Inches= Rem1%12;
		double Feet= (Rem1-Inches)/12;
		
		if (Meters==1) System.out.println(+Meters+" meter in yards, feet and inches is:");
		if ((Meters!=1) && (Meters>0)) System.out.println(+Meters+" meters in yards, feet and inches is:");
		
		if ((1>Yards) && (1>Feet) && (1==Inches)) System.out.println(+Inches+" Inch");
		if ((1>Yards) && (1==Feet) && (0==Inches)) System.out.println(+Feet+" foot");
		if ((1==Yards) && (1>Feet) && (0==Inches)) System.out.println(+Yards+" yard");
		
		if ((1>Yards) && (1>Feet) && (1!=Inches) && (Inches>0)) System.out.println(+Inches+" Inches");
		if ((1>Yards) && (1<Feet) && (0==Inches)) System.out.println(+Feet+" feet");
		if ((1<Yards) && (1>Feet) && (0==Inches)) System.out.println(+Yards+" yards");
		
		if ((1>Yards) && (1==Feet) && (1==Inches)) System.out.println(+Feet+" foot and "+Inches+" Inch");
		if ((1>Yards) && (1==Feet) && (1!=Inches)) System.out.println(+Feet+" foot and "+Inches+" Inches");
		if ((1>Yards) && (1<Feet) && (1!=Inches)) System.out.println(+Feet+" feet and "+Inches+" Inches");
		if ((1>Yards) && (1<Feet) && (1==Inches)) System.out.println(+Feet+" feet and "+Inches+" Inch");
		
		if ((1==Yards) && (1>Feet) && (1==Inches)) System.out.println(+Yards+" yard and "+Inches+" Inch");
		if ((1==Yards) && (1>Feet) && (1!=Inches)) System.out.println(+Yards+" yard and "+Inches+" Inches");
		if ((1<Yards) && (1>Feet) && (1!=Inches)) System.out.println(+Yards+" yards and "+Inches+" Inches");
		if ((1<Yards) && (1>Feet) && (1==Inches)) System.out.println(+Yards+" yards and "+Inches+" Inch");
		
		if ((1==Yards) && (1==Feet) && (0==Inches)) System.out.println(+Yards+" yard and "+Feet+" foot");
		if ((1<Yards) && (1==Feet) && (0==Inches)) System.out.println(+Yards+" yards and "+Feet+" foot");
		if ((1<Yards) && (1<Feet) && (0==Inches)) System.out.println(+Yards+" yards and "+Feet+" feet");
		if ((1==Yards) && (1<Feet) && (0==Inches)) System.out.println(+Yards+" yard and "+Feet+" feet");
		
		if ((1==Yards) && (1==Feet) && (1==Inches)) System.out.println(+Yards+" yard and "+Feet+" foot and "+Inches+" Inch");
		if ((1<Yards) && (1>Feet) && (1==Inches)) System.out.println(+Yards+" yards and "+Feet+" foot and "+Inches+" Inch");
		if ((1<Yards) && (1<Feet) && (1==Inches)) System.out.println(+Yards+" yards and "+Feet+" feet and "+Inches+" Inch");
		if ((1<Yards) && (1<Feet) && (1!=Inches)) System.out.println(+Yards+" yards and "+Feet+" feet and "+Inches+" Inches");
		if ((1==Yards) && (1==Feet) && (1!=Inches)) System.out.println(+Yards+" yard and "+Feet+" foot and "+Inches+" Inches");
		if ((1==Yards) && (1<Feet) && (1!=Inches)) System.out.println(+Yards+" yard and "+Feet+" feet and "+Inches+" Inches");
		if ((1<Yards) && (1==Feet) && (1==Inches)) System.out.println(+Yards+" yard and "+Feet+" feet and "+Inches+" Inch");
		if ((1<Yards) && (1==Feet) && (1!=Inches)) System.out.println(+Yards+" yards and "+Feet+" foot and "+Inches+" Inches");
	}
}
