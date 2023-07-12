package ex12inheritance;
/*
 * 가변인자(Variable Argument)
 * :메서드 오버로딩을 대체할 수 있는 문법으로 하나의 메서드를
 * 여러가지 호출형식을 대체할 수 있다.
 * 형식]
 *   메서드명(자료형....매개변수명){
 *      실행문장;
 *    }
 *    -필요에 따라 매개변수를 가변적으로 조정할 수 있는 문법
 *    -매개변수를 2개이상 받을 수 있어야 하므로 배열로 반환
 *    -단, 자료형은 모두 동일해야 한다.
 *   */
public class E08VariableArgument {
  static int getTotal(int param) {
	  int total=0;
	  total+=param;
	  return=total;        
  }
  static int getTotal(int param1, int param2) {
	  int total=0;
	  total+=(param1+param2);
	  return total;
  }
  static int getTotal(int param1, int param2, int param3) {
	  int total=0;
	  total+=(param1+param2+param3);
	  return total;
  }
  //statuc int get
  
  
  public static void main(String[]args) {
	  System.out.println("getTotal(args1)호출:"+
         getTotal(10));
	  System.out.println("getTotal(args1,args2)호출:"+
		         getTotal(10,20));
	  System.out.println("getTotal(args1,args1,args3)호출:"+
		         getTotal(10,20,30));
	  System.out.println("getTotal(매개변수6개)호출:"+
		         getTotal(10,20,30,40,50,60));
	  System.out.println("getTotal(args1,ㅁㄱㅎㄴ2)호출:"+
		         getTotal(10,20.3));
	  
  }
}
