package com.lizewu.algo.dictionary;

class TrieNode {
	public boolean isLeaf;
}

class TrieNonLeaf extends TrieNode{
	public boolean endOfWord = false;
	public String letters;
	public TrieNode[] ptrs = new TrieNode[1];
	public TrieNonLeaf(){
		isLeaf = false;
	}
	
	public TrieNonLeaf(char ch){
		letters = new String();
		letters += ch;
		isLeaf = false;
	}
}

class TrieLeaf extends TrieNode{
	public String suffix;
	public TrieLeaf(){
		isLeaf = true;
	}
	
	public TrieLeaf(String suffix){
		this.suffix = new String(suffix);
		isLeaf = true;
	}
}

 class Trie {
	public TrieNonLeaf root;
	public final int notFound = -1;
	public Trie(){
		
	}
	public Trie(String word) {
		root = new TrieNonLeaf(word.charAt(0));//初始化根节点
		createLeaf(word.charAt(0),word.substring(1),root);
	}
	public void printTrie() {
		printTrie(0,root,new String());
	}
	
	protected void printTrie(int depth,TrieNode p,String prefix) {
		if(p.isLeaf) {
			for(int j=1;j<=depth;j++)
				System.out.println("  ");
			System.out.println(" >"+prefix+"|"+((TrieLeaf)p).suffix);
		}
		else{
			for(int i=((TrieNonLeaf)p).letters.length()-1;i >= 0;i--){
				if(((TrieNonLeaf)p).ptrs[i] != null) {
					prefix = prefix.substring(0,depth) +
							((TrieNonLeaf)p).letters.charAt(i);
//					sizeView(depth+1,(TrieNonLeaf)p).ptrs[i],prefix);
				}
				else{
					for(int j = 1;j <= depth + 1;j++)
						System.out.println("  ");
					System.out.println(" >>"+prefix.substring(0,depth)+
							((TrieNonLeaf)p).letters.charAt(i));
				}
			}
			if(((TrieNonLeaf)p).endOfWord) {
				for(int j = 1;j <= depth+1;j++)
					System.out.println("  ");
				System.out.println(" >>"+prefix.substring(0,depth));
			}
		}
	}
	
	private int position(TrieNonLeaf p,char ch)
	{
		int i = 0;
		for( ;i < p.letters.length() && p.letters.charAt(i) != ch;i++);
		if(i < p.letters.length())
			return i;
		else
			return notFound;
	}
	public boolean found(String word)
	{
		TrieNode p = root;
		int pos, i = 0;
		while(true)
			if(p.isLeaf) //节点p是一个叶子节点
			{
				TrieLeaf lf = (TrieLeaf)p;
				if(word.substring(i).equals(lf.suffix))
					return true;
				else return false;
			}
			else if((pos = position((TrieNonLeaf)p,word.charAt(i))) != notFound
					&& i+1 == word.length())
				if(((TrieNonLeaf)p).ptrs[pos] == null)
					return true;
				else if(!(((TrieNonLeaf)p).ptrs[pos]).isLeaf &&
						((TrieNonLeaf)((TrieNonLeaf)p).ptrs[pos]).endOfWord)
						return true;
				else return false;
			else if(pos != notFound && ((TrieNonLeaf)p).ptrs[pos] != null) {
				p = ((TrieNonLeaf)p).ptrs[pos];
				i++;
			}
			else return false;
	}
	
	private void addCell(char ch,TrieNonLeaf p,int stop)
	{
		int i;
		int len = p.letters.length();
		char[] s = new char[len+1];
		TrieNode[] tmp = p.ptrs;
		p.ptrs = new TrieNode[len+1];
		for(i = 0;i<len;i++)
		{
			p.ptrs[i] = null;
		}
		if(stop < len)
			for(i = len;i >= stop+1; i--)
			{
				p.ptrs[i] = tmp[i-1];
				s[i] = p.letters.charAt(i-1);
			}
		s[stop] = ch;
		for(i = stop - 1;i >= 0;i--)
		{
			p.ptrs[i] = tmp[i];
			s[i] = p.letters.charAt(i);
		}
		p.letters = new String(s);
	}
	
	private void createLeaf(char ch,String suffix,TrieNonLeaf p)
	{
		int pos = position(p,ch);
		TrieLeaf lf = null;
		if(suffix != null && suffix.length() > 0)//不创建任何叶子节点
			lf = new TrieLeaf(suffix);//如果这棵树本身不存在
		if(pos == notFound)
		{
			for(pos = 0;pos < p.letters.length() && 
					p.letters.charAt(pos) < ch;pos++);
			addCell(ch,p,pos);
		}
		p.ptrs[pos] = lf;
	}
	
	public void insert(String word)
	{
		TrieNonLeaf p = root;
		TrieLeaf lf;
		int offset,pos,i=0;
		while(true)
		{
			if(i == word.length())
			{
				if(p.endOfWord)
					System.out.println("duplicate entry1:"+word);
				p.endOfWord = true;
				return;
			}
			pos = position(p,word.charAt(i));
			if(pos == notFound)
			{
				createLeaf(word.charAt(i),word.substring(i+1),p);
				
				return;
			}
			else if(pos != notFound &&
					p.ptrs[pos] == null)
			{
				if(i+1 == word.length())
				{
					System.out.println("duplicate entry1:"+word);
					return;
				}
				p.ptrs[pos] = new TrieNonLeaf(word.charAt(i+1));
				((TrieNonLeaf)(p.ptrs[pos])).endOfWord = true;
				String s = (word.length() > i+2)?word.substring(i+2):null;
				createLeaf(word.charAt(i+1),s,(TrieNonLeaf)(p.ptrs[pos]));
				return;
			}
			else if(pos != notFound
					&& p.ptrs[pos].isLeaf)
			{
				lf = (TrieLeaf)p.ptrs[pos];
				if(lf.suffix.equals(word.substring(i+1)))
				{
					System.out.println("duplicate entry2:"+word);
					return;
				}
				offset = 0;
				do{
					pos = position(p,word.charAt(i+offset));
					//word = "ABC",leaf = "ABCDEF" => leaf = "DEF"
					if(word.length() == i+offset+1)
					{
						p.ptrs[pos] = new TrieNonLeaf(lf.suffix.charAt(offset));
						p = (TrieNonLeaf) p.ptrs[pos];
						p.endOfWord = true;
						createLeaf(lf.suffix.charAt(offset),
								lf.suffix.substring(offset+1),p);
						return;
					}
					//word = "ABCDEF",leaf = "ABC" => leaf = "DEF";
					else if(lf.suffix.length() == offset)
					{
						p.ptrs[pos] = new TrieNonLeaf(word.charAt(i+offset+1));
						p = (TrieNonLeaf)p.ptrs[pos];
						p.endOfWord = true;
						createLeaf(word.charAt(i+offset+1),
								word.substring(i+offset+2),p);
						return;
					}
					p.ptrs[pos] = new TrieNonLeaf(word.charAt(i+offset+1));
					p = (TrieNonLeaf)p.ptrs[pos];
					offset++;
				}while(word.charAt(i+offset) == lf.suffix.charAt(offset-1));
				offset--;
				//word = "ABCDEF",leaf = "ABCPQR" =>
				//leaf ('D') = "EF" leaf =
				String s = null;
				if(word.length() > offset+i+2)
					s = word.substring(i+offset+2);
				createLeaf(word.charAt(i+offset+2),s,p);
				if(lf.suffix.length() > offset+1)
					s = lf.suffix.substring(offset+1);
				else s = null;
				createLeaf(lf.suffix.charAt(offset),s,p);
				return;
			}
			else{
				p = (TrieNonLeaf)p.ptrs[pos];
				i++;
			}
		}
	}
}

