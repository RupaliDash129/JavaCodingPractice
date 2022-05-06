package HackerRank;

	
	public class test{

		
		public static void main(String args[]){

		try {
			System.out.println(10/0);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println(10/0);
		}


}
	}