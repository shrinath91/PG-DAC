package _11_Circular_Linked_list;

public class Circular_LL 
{
	public static class Node////node
	{
		int data;
		Node next;

		public Node(int data) 
		{
			this.data = data;
			this.next = null;
		}


		public String toString() {
			return data+"";
		}		
	}

	Node head;

	public Circular_LL() 
	{
		this.head = null;
	}

	public void addBeg(int data)
	{
		Node n1 = new Node(data);
		if(head == null)
		{
			head = n1;
			n1.next=head;
		}
		else
		{
			n1.next = head;
			Node mv = head;
			while(mv.next!=head)
			{
				mv=mv.next;
			}
			mv.next=n1;
			head = n1;
		}
	}

	public void addEnd(int data)
	{
			Node n1 = new Node(data);
			if(head == null)
			{
				head = n1;
				n1.next = n1;
			}
			else
			{
				Node mv = head;
				while(mv.next!=head)
				{
					mv=mv.next;
				}

				n1.next=head;
				mv.next=n1;
			}
		}

		public void addMid(int data, int pos)
		{
			if(pos>0 && pos<=size()+1)
			{
				if(pos==1)
					addBeg(data);

//				else if(pos == size()+1)
//					addEnd(data);

				else
				{
					Node mv = head;
					Node n1 = new Node(data);
					for(int i=1; i<pos-1; i++)
					{
						mv=mv.next;
					}
					n1.next = mv.next;
					mv.next = n1;
				}
			}
			else
				System.out.println("Invalid Pos!!!\n");
		}

		public int deleteBeg()
		{
			int data;
			if(head.next==head)
			{
				data = head.data;
				head=null;
				return data;
			}
			
			data = head.data;
			Node del = head;
			Node mv = head;
			while(mv.next!=head)
				mv=mv.next;
	
			mv.next=head.next;
			head=head.next;
		
			del=null;
			
			return data;
		}

		public int deleteEnd()
		{
			int data;
			if(head.next==head)
			{
				data=head.data;
				head=null;
				return data;
			}
			
			Node mv = head;
			while(mv.next.next!=head)  
				mv=mv.next;

			data = mv.next.data;
			Node del = mv.next;
			mv.next = head;
			
			del=null;
			
			return data;
		}

		public int deleteMid(int pos)
		{
			int data = 0;
			if(pos>0 && pos<size())
			{
				if(pos==1)
				{
					data = deleteBeg();
				}
				else if(pos==size())
				{
					data = deleteEnd();
				}
				else
				{
					Node mv = head;
					for(int i=1; i<pos-1; i++)
					{
						mv=mv.next;
					}
					data=mv.next.data;

					Node del = mv.next;
					mv.next = mv.next.next;
					del = null;
				}
			}
			else
				System.out.println("Invalid!!!");

			return data;
		}

		public void display()
		{
			if(head==null)
			{
				System.out.println("Empty Cicular Linked List");
				return;
			}
			
			Node mv = head;
			System.out.print("| ");
			while(mv.next!=head)
			{
				System.out.print(mv+" |<-->| ");
				mv=mv.next;
			}
			System.out.println(mv+" |");

		}
		public int size()
		{
			Node mv = head;
			int count=1;

			while(mv.next!=head)
			{
				mv=mv.next;
				count++;
			}

			return count;	
		}



//		2 20 2 10 3 40 3 50


	}
