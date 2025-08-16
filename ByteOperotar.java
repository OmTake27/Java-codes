public class ByteOperotar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 4;
		no = (int)(no+4.0F);//expecting typecasting
	no+=4.0f;
	byte byteVariable =10;
	long longVariable =20;
	int no1=22;
	int no2=26;
	int no3=25;
//	if(no1>no2)
//		System.out.println("no1 is greater");
//	else
//		System.out.println("no2 is greater");
//	String result=no1>no2?"no1 is greater":"no2 is greater";
//    System.out.println(result);
//		System.out.println(no);

//if(no1>no3) {
//	if(no1>no3) {
//	System.out.println("no1 is greater than no2 no3");
//}else {
//	System.out.println("no3 is greater than no2 no1");
//}
//	
//}else {
//if(no2>no3){
//	System.out.println("no2 is greater than no3 no1");
//	
//}else {
//	System.out.println("no3 is greater than no2 no1");
//}
//
//}
int greaterNo=(no1>no2)?(no1>no3)?no1:no3:(no2>no3)?no2:no3;
   System.out.println(greaterNo+"is greater");
	}
}
