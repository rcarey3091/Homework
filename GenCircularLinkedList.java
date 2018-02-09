public class GenCircularLinkedList <T> {
	private class ListNode
	{
		private T data;
		private ListNode link;
		public ListNode()
		{
			data = null;
			link = null;
		}
		public ListNode(T aData, ListNode aLink)
		{
			this.data = aData;
			this.link = aLink;
		}
	}
	private ListNode head;
	private ListNode tail;
	private ListNode prev;
	private ListNode curr;
	public GenCircularLinkedList()
	{
		head = new ListNode();
		curr = head;
	}
	
	public void goToNext()
	{
		if(curr != null)
		{
			prev = curr;
			curr = curr.link;
		}
		
	}
	public void goToPrev()
	{
		if(curr != null)
		{
			curr = prev;
		}
	}
	
	public T getDataAtCurrent()
	{
		if(curr != null)
		{
			return curr.data;
		}
		else
		{
			return null;
		}
	}
	
	public void setDataAtCurrent(T aData)
	{
		if(curr != null)
		{
			curr.data = aData;
		}
	}
	
	public void insert(T aData)
	{
		//Create an instance of new node
		ListNode newNode = new ListNode(aData,null);
		if(head.data == null)
		{
			head.data = aData;
			head.link = null;
			tail = head;
			curr = head;
			prev = head;
		}
		//The list isn't empty
		else
		{
			newNode.data = aData;
			tail.link = newNode;
			newNode.link = head;
			tail = newNode;
		}
		
	}
	
	public void insertAfterCurrent(T aData)//inserts a new now after the current
	{
		//Create new node
		ListNode newNode = new ListNode(aData, null);
		newNode.data = aData;
		curr.link = newNode;
		prev = curr;
		if(curr == tail)
		{
			tail = newNode;
		}
		else
		{
		curr = newNode;
		}
		
	}
	
	public void deleteCurrent()
	{
		if(curr == head)
		{
			if(head == tail)
				head = new ListNode();
			else
			{
				head = head.link;
				curr = head;
			}
		}
		else if(curr == tail)
		{
			ListNode temp = head;
			while(temp != curr)
			{
				prev = temp;
				temp = temp.link;
			}
			prev.link = head;
			tail = prev;
		}
		else 
		{
			prev.link = curr.link;
			curr = curr.link;
		}
	}
	
	public void showList()
	{
		ListNode temp = head;
		do
		{
			System.out.println(temp.data);
			temp = temp.link;
		}
		while(temp != tail.link);
	}
	
	public boolean inList(T temp)
	{
		boolean found = false;
		ListNode pos = head;
		while(pos != null && !found)
		{
			T dataAtPosition = pos.data;
			if(dataAtPosition.equals(temp))
			{
				found = true;
			}
			else
			{
				if(pos == tail)
				{
					break;
				}
				pos = pos.link;
			}
		}
		return found;
	}
}
