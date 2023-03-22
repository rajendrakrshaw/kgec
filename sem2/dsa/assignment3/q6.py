class Node:    
	def __init__(self,value):        
		self.value = value        
		self.next = None
        
class LinkedList:
    def __init__(self,head=None):
        self.head = head  
        
    def insert_beg(self, new_node):
        current = self.head
        if current:
            while current.next:
                current = current.next
            current.next = new_node
        else:
            self.head = new_node
            
    def delete_beg(self, value):
        """Delete the first node with a given value."""
        current = self.head
        if current.value == value:
            self.head = current.next
        else:
            while current:
                if current.value == value:
                    break
                prev = current
                current = current.next
            if current == None:
                return
            prev.next = current.next
            current = None 

    def display(self):
        current = self.head
        while current:
            print(current.value)
            current = current.next
            
    def menu():
        print("1.Insert at beginning.")
        print("2.Delete at beginning.")
        print("3.Display.")
        print("4.Exit.")
        
        
l = LinkedList()
run = True
l.menu()
while run:
    opt = int(input("Enter your choice: "))
    if opt == 1:
        d = int(input("Enter data: "))

l.display()