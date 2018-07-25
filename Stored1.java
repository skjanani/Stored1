package janani;

public class Stored1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp,i,j,n=4,l;
		/*System.out.println("enter the number");
		Scanner ja=new Scanner(System.in);
		n=ja.nextInt();
		int []a=new int[n];*/
		int a[]={1,2,3,4};
		for(i=0;i<n;i++){
			//a[i]=ja.nextInt();

		for(j=i+1;j<4;j++){
			if(a[i]>a[j]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
		}
l=a.length/2;
		System.out.println(a[l]);
			}

		}
	


