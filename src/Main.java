import com.queue.Queue;
import com.stack.Stack;

public class Main
{
	public static void main(String[] args)
	{
		Stack stk = new Stack(10);
		
		System.out.println(stk);
		
		Queue que = new Queue(10);
		
		System.out.println(que);
	}
}
