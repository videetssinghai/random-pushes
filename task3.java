
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

class Tuple {
	int id;
	int x;

	public Tuple(int id, int x) {
		super();
		this.id = id;
		this.x = x;
	}

}

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random ran = new Random();
		int count = 0;
		LinkedList<Tuple> list[] = new LinkedList [1000];
		int N = 100000;

		for(int i=0;i<N;i++) {
			int x = ran.nextInt(1000);
			if(list[x]==null) {
				list[x] = new LinkedList<Tuple>();
			}
			list[x].add(new Tuple(i,x));
		}

		for(int k=0;k<1000;k++) {

			if(count == 500)
				break;

			if (list[k]!=null) {
				Iterator<Tuple> i = list[k].listIterator();

				while (i.hasNext())
				{
					System.out.println(i.next().id+" ");

				}
				count++;
			}

		}


	}

}
