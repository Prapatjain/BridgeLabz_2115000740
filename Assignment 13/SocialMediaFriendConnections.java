import java.util.*;
class SocialMediaFriendConnections{
	
	class Node{
	
		int userId;
		String name;
		int age;
		List<Node> friends;
		
		Node next;
	
		Node(int userId, String name, int age){
		
			this.userId = userId;
			this.name = name;
			this.age = age;
			
			friends = new ArrayList<>();
			this.next = null;
		}
		
		public void display(){
			System.out.println("User Id is : "+this.userId);
			System.out.println("User name is : "+this.name);
			System.out.println("User age is : "+this.age);
			System.out.println();
			
		}
		

	}
	
	Node head;
	Node tail;
	int size;
	
	SocialMediaFriendConnections(){
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public void addLast(int userId, String name, int age){
		
		Node nn = new Node(userId, name, age);
		
		if(tail == null)
			tail = nn;
		else{
			tail.next = nn;
			tail = nn;
		}
		
		if(head == null)
			head = nn;
		
		size++;
		
		System.out.println("Node is added at Last");
	}
	
	public void addFriend(int userId1, int userId2){
		Node user1 = null;
		Node user2 = null;
		Node temp = head;
		while(temp != null){
			if(temp.userId == userId1){
				user1 = temp;
			}
			if(temp.userId == userId2){
				user2 = temp;
			}
			temp = temp.next;
		}
		if(user1 != null && user2 != null)
			user1.friends.add(user2);
		if(user1 != null && user2 != null)
			user2.friends.add(user1);
	}
	
	public void removeFriend(int userId1, int userId2){
		Node user1 = null;
		Node user2 = null;
		Node temp = head;
		while(temp != null){
			if(temp.userId == userId1){
				user1 = temp;
			}
			if(temp.userId == userId2){
				user2 = temp;
			}
			temp = temp.next;
		}
		if(user1 != null && user2 != null)
			user1.friends.remove(user2);
		if(user1 != null && user2 != null)
			user2.friends.remove(user1);
	}
	
	public void mutualFriends(int userId1, int userId2){
		Node user1 = null;
		Node user2 = null;
		Node temp = head;
		while(temp != null){
			if(temp.userId == userId1){
				user1 = temp;
			}
			if(temp.userId == userId2){
				user2 = temp;
			}
			temp = temp.next;
		}
		System.out.println("All Mutual friends of "+user1.name+" and "+user2.name+" are : ");
		for(int i=0;i<user1.friends.size();i++){
			for(int j=0;j<user2.friends.size();j++){
				if(user1.friends.get(i) == user2.friends.get(j))
					user1.friends.get(i).display();
			}
		}
	}
	
	public void allFriends(int userId){
		
		Node temp = head;
		while(temp != null){
			if(temp.userId == userId){
				System.out.println("All friends of "+temp.name+" are : ");
				for(int i=0;i<temp.friends.size();i++){
					temp.friends.get(i).display();
				}
			}
			temp = temp.next;
		}
	
	}
	
	public void delete(int userId){
		//if at first place
		if(head.userId == userId){
			head = head.next;
			return;
		}
		
		Node prev = null;
		Node temp = head;
		
		while(temp != null){
			if(temp.userId == userId){
				prev.next = temp.next;
				if(temp.next == null) //if at last place
					tail = prev;
			}
				
			prev = temp;
			temp = temp.next;
		}
		
	}
	
	public void search(int userId){
		Node temp = head;
		while(temp != null){
			if(temp.userId == userId){
				temp.display();
				return;
			}
			temp = temp.next;
		}
		System.out.println("Cannot find the User with user Id : "+userId);
	}
	
	public void search(String name){
		Node temp = head;
		while(temp != null){
			if(temp.name.equals(name)){
				temp.display();
				return;
			}
			temp = temp.next;
		}
		System.out.println("Cannot find the User with user name : "+name);
	}
	
	public void displayAll(){
		
		Node temp = head;
		
		while(temp != null){
			temp.display();
			System.out.println();
			temp = temp.next;
		}
	}
	
	public static void main(String[] args){
		SocialMediaFriendConnections l1 = new SocialMediaFriendConnections();
	
		l1.addLast(12, "Prapat Jain", 21);
		l1.addLast(23, "Kushagra Sharma", 22);
		l1.addLast(42, "Naman Agarwal", 20);
		l1.addLast(25, "Nihit Jain", 21);
		l1.addLast(85, "Sajal Saraf", 24);
		l1.addLast(57, "Afraj Khan", 19);
		
		
		l1.addFriend(12, 23);
		l1.addFriend(12, 25);
		l1.addFriend(12, 85);
		l1.addFriend(12, 57);
		
		l1.addFriend(23, 85);
		
		l1.addFriend(42, 23);
		l1.addFriend(42, 12);
		
		l1.mutualFriends(12, 23);
		l1.mutualFriends(12, 42);
		
		l1.allFriends(12);
		
		l1.removeFriend(12, 42);
		
		l1.allFriends(12);
	
	}
	
}