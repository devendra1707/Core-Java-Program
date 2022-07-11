package test;
public class BookData {
		public String bCode, bName, bAuthor;
		public float bPrice;
		public int bQty;
		public BookData(String bCode,String bName,String bAuthor,float bPrice,int bQty) 
		{
			this.bCode = bCode;
			this.bName = bName;
			this.bAuthor = bAuthor;
			this.bPrice = bPrice;
			this.bQty = bQty;
		}
		public String toString()
		{
			System.out.println("BookCode\tBookName\tBookAuthor\tBookPrice\tBookQty");
			return bCode+"\t\t"+bName+"\t\t"+bAuthor+"\t\t"+bPrice+"\t\t"+bQty;
		}
}
