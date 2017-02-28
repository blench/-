package com.lizewu.openandclose;

import java.text.NumberFormat;
import java.util.ArrayList;

public class BookStore {
	
	private final static ArrayList<IBook> bookList = new ArrayList<IBook>();
	
	static{
		bookList.add(new NovelBook("天龙八部",3200,"金庸"));
		bookList.add(new NovelBook("巴黎圣母院",5600,"雨果"));
		bookList.add(new NovelBook("悲惨世界",3500,"雨果"));
		bookList.add(new OffNovelBook("水浒传",4000,"施耐庵"));
		bookList.add(new OffNovelBook("红楼梦",4500,"曹雪芹"));
		bookList.add(new OffNovelBook("西游记",3000,"吴承恩"));
		bookList.add(new ComputerBook("Think in java",7000,"Bruce Eckel","编程语言"));
	}
	
	
	public static void main(String[] args) {
		NumberFormat format = NumberFormat.getCurrencyInstance();
		format.setMaximumFractionDigits(2);
		System.out.println("-----------书店卖出去的记录如下------------");
		for(IBook book:bookList)
		{
			System.out.println("书籍名称:"+book.getName()+"\t书籍作者:"+book.getAuthor()+
					"\t书籍价格:"+format.format(book.getPrice()/100.0)+"元");
		}
	}
}
