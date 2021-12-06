
public class StaticVariable {
int i=0;
static int j=0;
public StaticVariable ()
{++i;
++j;}
public static void gr()
public static void main(String argv[]){
	StaticVariable  ob1=new StaticVariable ();
	StaticVariable  ob2=new StaticVariable ();
	System.out.println(ob1.i);
	System.out.println(ob2.i);
	System.out.println(StaticVariable.j);
	System.out.println(ob1.j);
    System.out.println(i);
}

}
    